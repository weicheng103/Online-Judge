package sytaxPractice;

import java.math.BigDecimal;

public class Test {
	public static void main(String[] args){
		if(args.length == 0 ){
			System.out.println("args=0");
		}else{
			for(int i = 0; i < args.length; i++){
				System.out.println(args[i]);
			}
		}
	}	
}