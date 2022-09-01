package kr.co.greenart;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);
		
		MyService service = context.getBean(MyService.class);
		System.out.println(service.numberService());
		
		
		
		
		MyDataRepository repo = context.getBean("myset", MyDataRepository.class); //인터페이스를 달라고해도 구현체를 가져와준다
		System.out.println(repo.getMyNumbers());
	}
}
