package com.tchaikop.shop.dto;

import java.security.Timestamp;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class MemberDto {

	String id;
	String pw;
	String age;
	Timestamp regdate;
	
	
}
