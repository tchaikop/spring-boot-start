package com.tchaikop.shop.entity;

import java.time.LocalDateTime;

import org.antlr.v4.runtime.misc.NotNull;
import org.springframework.data.annotation.CreatedDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity  //연결된 DB의 member테이블 만들어주는 클래스 선언
@Getter
@Setter
public class Member {
	
	@Id //기본키를 선언
	@GeneratedValue(strategy= GenerationType.IDENTITY)  //Auto Increment자동증가
	private int usernum;  //pk, ai(1,2,3,4..)
	
	@Column(length = 20,nullable = false) //칼럼에 허용되는 문자 길이-> 안쓰면 기본 값이 255자 들어간다
	private String userid;
	
	
	@Column(length = 20)
	private String password;
	
	@Column(length = 20)
	private String username;
	
	@CreatedDate  //엔터티가 생성되어 저장될때 시간이 자동으로 저장
	private LocalDateTime regdate;  //현재 시간의자동저장

}
