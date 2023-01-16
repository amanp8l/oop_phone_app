package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        LandLine l1=new LandLine("123");
        LandLine l2=new LandLine("456");

        l1.callNumber("456");
        l2.receiveCall("123");
        System.out.println(l2.answerCall());
    }
}
