package kr.co.greenart.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;


// web config 에서 addInterceptors 오버라이드 해준다
@Component
public class MyInterceptor extends HandlerInterceptorAdapter {
	private static final Logger logger = LoggerFactory.getLogger(MyInterceptor.class);

	@Override // 사용자 핸들 사용하기전
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		logger.info("--- 1. 핸들러가 처리 전 ---");
		
		HttpSession session = request.getSession(false);
		if(session != null) {
			session.removeAttribute("burn");
		}
		//request.removeAttribute("burn");
		request.setAttribute("burn", "요청 객체에 새로운 어트리뷰트 생성");
		return true;
	}

	@Override // 뷰가 만들어 지기 전
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		logger.info("--- 3. 핸들러가 처리 후, 뷰 생성 전 ---");
		
		String value = (String) request.getAttribute("burn");
		value += ".핸들러 처리 후 어트리뷰트 변경";
		request.setAttribute("burn", value);
	}

	@Override // 뷰가 만들어 진 후
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
		logger.info("--- 5. 뷰 생성 후 ---");
		
		HttpSession session = request.getSession(false);
		session.removeAttribute("burn");
	}

}
