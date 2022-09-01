package mybeans;

import org.springframework.stereotype.Component;

@Component(value = "firstComp")  // bean으로 등록할거야~ 표시해둔거
public class FirstComponent {
	public void hello() {
		System.out.println("어노테이션으로 Bean 설정하기 연습!!");
	}
}
