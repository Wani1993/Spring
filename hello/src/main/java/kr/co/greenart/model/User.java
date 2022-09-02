package kr.co.greenart.model;

import javax.validation.constraints.Max;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Positive;
import javax.validation.constraints.Size;


public class User {
	@NotBlank(message = "이름을 입력해주세요")  // 자동검사를 위해 설정하는 어노테이션
	@Size(min = 1, max = 4, message = "이름은 1 ~ 4자 사이여아합니다.") // 문자열 값 길이를 정해줄수있다 (최소값, 최대값)
	private String name;
	@Positive(message = "양수를 입력해주세요") // 양수일때만 사용
	@Max(value = 100, message = "최대값(100)을 초과했습니다.") // 최대값 설정
	private int age;

	public User() {
	}
	
	public User(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "User [name=" + name + ", age=" + age + "]";
	}
	
	

}
