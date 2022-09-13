package kr.co.greenart;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/mapping")
public class MappingController {
	@GetMapping(value = "/??.two", produces = "text/plain; charset=utf-8") //응답을 utf-8로 받을거라는걸로 produces를 이용한다 (json으로 받으려면 그에 맞게 설정하면된다)
	public @ResponseBody String two() {
		return "두글자 매핑";
	}
	
	@GetMapping("/*.do")
	public @ResponseBody String doURI() {
		return "do로 끝나는 매핑";
	}
	
//	@GetMapping(value = "/ppp", params = "!com") com이라는 파라미터가 없을때 사용 
	@GetMapping(value = "/ppp", params = "com", produces = "text/plain; charset=utf-8") // params 안에들어가는 문자열이 똑같아야 나온다.
	public @ResponseBody String ppp(@RequestParam(defaultValue = "default") String com) { // params안에 com 값을 String com에 집어넣는데 값이 없으면은 디폴트값을 넣어준다 
																						  // 값이 있으면 입력된 값을 넣어준다.
		return com;
	}
	
	
}
