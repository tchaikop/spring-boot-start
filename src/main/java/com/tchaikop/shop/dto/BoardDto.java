package com.tchaikop.shop.dto;

import java.security.Timestamp;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data  // getter, setter, 기본생성자
@AllArgsConstructor  // 모든 필드를 사용하는 생성자
@NoArgsConstructor

public class BoardDto {
	
	int boardnum;
	String title;
	String conten;
	Timestamp regdate;
	

}
