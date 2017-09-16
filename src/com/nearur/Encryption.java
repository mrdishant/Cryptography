package com.nearur;

public class Encryption {

	public static void main(String[] args) {


		PlayFair playFair=new PlayFair();
		String x=playFair.encrypt("key square");
		System.out.println("Cipher : "+x);
		System.out.println("Plain  : "+playFair.decrypt(x));

	}

}
