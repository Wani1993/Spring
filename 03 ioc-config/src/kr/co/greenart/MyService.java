package kr.co.greenart;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class MyService {
	@Autowired
	@Qualifier(value = "mylist") // 인터페이스 구현체가 두개이니까 그중에 어느것을 가져올지 지정해주는거
	//사용할 의존 객체를 선택할 수 있도록 해준다.
	//설정에서 bean의 한정자 값을 설정한다.
	//@Autowired 어노테이션이 적용된 주입 대상에 @Qualifier 어노테이션을 설정한다.
	//이때 @Qualifier의 값으로 앞서 설정한 한정자를 사용한다.
	private MyDataRepository repo;
	
	public Iterable<Integer> numberService() {
		return repo.getMyNumbers();
	}
}
