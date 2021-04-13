package day11_20210413_01;

public class People {
	// 필드 , 생성자 , 메소드
	// 필드 선언
	String name; // 필드로 선언되면 파란색으로 선언됨
	int age;
	String nation;
	
	
	// 생성자 선언
	// 기본생성자
	People(){
		nation = "대한민국";
	}
	
	// 매개변수가 있는 생성자
	// String name , int age => 매개변수
	// 쓰임 중요함 암기.
	People(String name , int age){
		
		// 매개변수를 사용하는 이유
		/*
		 * 생성자에서 필드값을 세팅하거나
		 * 메소드에서 처리할 값을 넘길 때
		 */
		// 넘겨받은 매개변수를 필드값으로 저장.
		// 매개변수이름과 필드이름은 동일하게 쓰는게
		// 일반적이며 , 구분을 위해 필드앞에는 this를 붙임.
		// 필드를 지칭할때는 앞에 this 붙여준다.
		this.name = name;
		this.age = age;
		
	}
	
	
	
	
	
	
}
