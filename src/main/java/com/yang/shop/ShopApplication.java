package com.yang.shop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ShopApplication {

	public static void main(String[] args) {
		SpringApplication.run(ShopApplication.class, args);

		var test =new Friend("yang",30) ;// a 에 "kim" 넣어서 object 뽑아주세요
//		System.out.println(test.name);
	}
}

class Friend {

	String name = "kim";
	int age = 20 ;

	// new Friend() 자동 실행
	Friend(String a, int b){ // constructor = Friend, 초기값 설정 가능
		this.name = a ; // 새로 생성될 object
		this.age = b ;
	}
}
