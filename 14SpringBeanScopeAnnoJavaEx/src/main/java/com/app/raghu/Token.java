package com.app.raghu;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component("t1")
//@Scope("prototype")
public class Token {

	private int code;

	public Token() {
		super();
		System.out.println("CONST IS CALLED...");
		code = Math.abs( new Random().nextInt() );
	}

	@Override
	public String toString() {
		return "Token [code=" + code + "]";
	}
	
	
	
}
