package kr.co.greenart;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HelloController {
	@RequestMapping(value = "/hello", method = RequestMethod.GET) // get방식의 요청을 핸들링하는것
	public String hello() {
		return "hello";
	}
	
	@RequestMapping(value = "/hi", method = RequestMethod.GET)
	public String hi() {
		return "hello";
	}
	
}
