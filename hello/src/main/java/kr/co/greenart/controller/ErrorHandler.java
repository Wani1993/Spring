package kr.co.greenart.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice  // 모든 컨트롤러 전역에서 사용된다
public class ErrorHandler {
	@ExceptionHandler(value = NullPointerException.class)
	public String nullExcep(Model model, NullPointerException ex) {
		model.addAttribute("error", "서버에서 오류가 발생했습니다. 죄송하무니다." + ex.getMessage());
		return "errorpage";
	}
	
}
