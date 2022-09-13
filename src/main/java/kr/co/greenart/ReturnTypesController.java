package kr.co.greenart;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/returns")
public class ReturnTypesController {
	@GetMapping("/viewname")
	public String viewname() {
		return "hello";
	}
	
	@GetMapping("/respbody")
	public @ResponseBody String body() {
		return  "body 내용";
	}
	
	@GetMapping("/mv")
	public ModelAndView mv() {
		ModelAndView mv = new ModelAndView(); // 파라미터 안에서 모델엔뷰 객체를 받아도 된다.
		mv.addObject("result", "모델엔뷰 객체로 설정");
		mv.setViewName("plusresult");
		return mv;
	}
	
	@GetMapping("/respentity")
	public ResponseEntity<String> entity() { // 헤드 응답코드를 바디에 설정
		return ResponseEntity.ok().header(HttpHeaders.CONTENT_TYPE, "text/plain charset=utf-8").body("바디 내용입니다.");	
		
//		String body = "바디 내용입니다.";
//		HttpHeaders headers = new HttpHeaders(); // 응답 헤더 설정을 할수있는 객체
//		headers.add("Content-Type", "text/plain; charset=utf-8");
//		ResponseEntity<String> en = new ResponseEntity<>(body, headers, HttpStatus.OK);
//		return en;
	}
	
	@GetMapping("/red")
	public String redirect() {
		return "redirect:/";
	}
}
