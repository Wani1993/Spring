import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import mybeans.MyBean;
import mybeans.MyLogic;
import mybeans.MyStatefulObj;

public class IOC_Test {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("myconfig.xml"); //설정값을 세팅해주는거
		MyStatefulObj fourth = context.getBean(MyStatefulObj.class);
		System.out.println(fourth.toString()); // bean이 2개이상이어도  primary 설정을 해두면 주요키가 된다.
		
		
		
		
		//		MyStatefulObj third = context.getBean(MyStatefulObj.class);
//		System.out.println(third.toString());
//		third.setName("new-name");
//		third.setNumber(200);
//		
//		MyStatefulObj oneMoretime = context.getBean(MyStatefulObj.class);
//		System.out.println(oneMoretime.toString());
//		System.out.println(third == oneMoretime); // scope 타입이 프로토타입으로 설정되있으면 new 로 만들어준다 
		
		
		
//		MyLogic logic = context.getBean(MyLogic.class);
//		logic.someMethod();
		
		
		
			
		
		
//		MyBean b = context.getBean(MyBean.class);  // new 인스턴스 생성없이 그냥 설정해둔 context에 클래스 이름만 넣어도 호출이 가능하다.
//		
//		b.hello();
//		
//		MyBean b2 = (MyBean) context.getBean("first"); //오브젝트로 주기때문에 다운캐스팅을하거나
//				  // context.getBean("first", MyBean.class); 인자로 받아도 된다.
//		b2.hello();
//		
//		System.out.println(b == b2); // 같은 인스턴스에서 불러온다는 말이다 이말이야
	}
}
