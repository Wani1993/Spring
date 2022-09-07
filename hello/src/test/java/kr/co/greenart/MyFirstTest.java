package kr.co.greenart;

import static org.junit.Assert.*;

import org.junit.Test;

import kr.co.greenart.model.User;

public class MyFirstTest {

	@Test
	public void test() {
//		fail("Not yet implemented");
		int a = 10;
		int b = 20;
		
		int sum = a + b;
		assertEquals(30, sum); // 기대값이랑 실제 값을 비교해서 같으면 테스트 통과
	}
	
	@Test
	public void test2() {
		String abc = "abc";
		String abc2 = "abc";
		
		assertSame(abc2, abc); // 두 객체의 참조값이 같으면 테스트 통과
	}

	@Test
	public void test3() {
		User u = new User();
		
		assertNotNull(u); // 널참조가 아니면 통과 널참조이면 통과X
	}
	
}
