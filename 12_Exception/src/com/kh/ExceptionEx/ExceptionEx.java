package com.kh.ExceptionEx;

import java.util.Scanner;
/*
exception : 예외
예외는 코드로 처리가능한 에러

try{

내가 예외 발생시킬 수 있지만
작성해서 시도하고싶은 코드 작성

} catch(Exception e){

예외가발생했을때 보여줄 코드나 문구 작성

}

catch문은 무제한으로 작성할 수 있음
	catch(Exception e) 맨 마지막에 작성
	
	
*/
public class ExceptionEx {

private Scanner sc = new Scanner(System.in);
	
	//기본생성자
	public ExceptionEx() {
	}
	
	public void method1() {
		int[] arr = {10,20,30,40};
		
		try {
		
		for(int i = 0; i <= arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		}catch(ArrayIndexOutOfBoundsException e) {//or RuntimeException e
			System.out.println("1번예외상황");
			
		}catch(Exception e) {
			System.out.println("배열의 인덱스를 벗어났습니다.");
		}
	}
	
	public static void main(String[] args) {
		ExceptionEx ee = new ExceptionEx();
		ee.method1();
	}
}
