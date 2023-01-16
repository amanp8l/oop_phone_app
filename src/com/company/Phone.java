package com.company;

public interface Phone {
    void powerOn();
    void callNumber(String number);
    void receiveCall(String phoneNo);
    boolean answerCall();
    boolean isRinging();
}
