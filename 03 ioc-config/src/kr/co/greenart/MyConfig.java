package kr.co.greenart;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration // 설정을 가지고 있는 컴포넌트 (xml에서 했던 설정을 똑같이 해줄수있다)
@ComponentScan("kr.co.greenart") // 컴포넌트 스캔 해라는 뜻
public class MyConfig {
	@Bean
	public List<Integer> myList() { // 메소드 이름이 빈의 이름이 된다
		return new ArrayList<Integer>(Arrays.asList(1,2,3,4,5));
	}
	
	@Bean
	public Set<Integer> mySet() {
		return new HashSet<Integer>(Arrays.asList(6,7,8,9,10));
	}
}
