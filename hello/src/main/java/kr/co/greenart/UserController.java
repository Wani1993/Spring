package kr.co.greenart;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import kr.co.greenart.model.User;
import kr.co.greenart.model.UserService;
import kr.co.greenart.model.UserValidator;

@Controller
public class UserController {
	private final static Logger logger = LoggerFactory.getLogger(UserController.class);
	
//	@Autowired
//	private UserValidator validator;
	
	@Autowired
	private UserService service;
	
	
	@ModelAttribute("user")
	public User user() {
		return new User("기본값", 1);
	}
	
	@GetMapping("/user")
	public String userForm(@ModelAttribute("user") User user) {
		return "userForm";
	}
	// 위에거랑 같은 말이다. 이말이야
//	public String userForm(Model model) {
//		model.addAttribute("user", new User("기본값", 1));
//		return "userForm";
//	}
	
	
	@PostMapping("/user")
	public String submit(@ModelAttribute("user") @Valid User user, BindingResult errors) {
		// 파라미터 안에 submit으로 받는 request 정보를 담을 클래스를 만든다면 자동으로 그 클래스로 대입이 된다.
		logger.info("입력정보: " + user.toString());
		
//		validator.validate(user, errors); // BindingResult 객체를 사용하면 알아서 errors 를 준다.
		if(errors.hasErrors()) {  // 한개라도 에러가 있으면 참을 리턴한다.
			return "userForm";  // 다시 입력폼으로 보낸다.
		}
		service.add(user);
		
		return "redirect:/user/list";
	}
	
	@GetMapping("/user/list")
	public String list(Model model) {
		model.addAttribute("list", service.list());
		return "userlist";
	}
	
}
