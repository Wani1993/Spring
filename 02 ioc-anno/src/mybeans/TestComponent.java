package mybeans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestComponent {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("myconfig.xml");
		ThirdComponent third = context.getBean(ThirdComponent.class);
		third.printValue();
		
		
		
		
		
//		SecondComponent second = context.getBean(SecondComponent.class);
//		System.out.println(second);
//
//		
//		second.myServiceMethod();
		
		

		
//		FirstComponent comp = context.getBean(FirstComponent.class);
//		comp.hello();
//		
//		FirstComponent byName = context.getBean("firstComp", FirstComponent.class); //어노테이션으로 value값지정해두고 그 값을 불러서 사용하는법
//		byName.hello();
//		
//		System.out.println(comp == byName);
	}
}
