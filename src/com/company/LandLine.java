package com.company;

public class LandLine implements Phone{

    private String myPhoneNo;
    private boolean isRinging;
    private boolean isPowerOn;

    public LandLine(String myPhoneNo) {
        this.myPhoneNo = myPhoneNo;
        this.isRinging=false;
        this.isPowerOn=true;
    }

    public String getMyPhoneNo() {
        return myPhoneNo;
    }

    public void setMyPhoneNo(String myPhoneNo) {
        this.myPhoneNo = myPhoneNo;
    }

    public void setRinging(boolean ringing) {
        isRinging = ringing;
    }

    public boolean isPowerOn() {
        return isPowerOn;
    }

    public void setPowerOn(boolean powerOn) {
        isPowerOn = powerOn;
    }

    @Override
    public void powerOn() {
        this.isPowerOn=true;
    }

    @Override
    public void callNumber(String PhoneNo) {
        if(isPowerOn){
            System.out.println("you are dialing the no. "+PhoneNo);
        }else{
            System.out.println("your LandLine is off");
        }
    }

    @Override
    public void receiveCall(String phoneNo) {
        if (isPowerOn && myPhoneNo.equals(phoneNo)) {
            this.isRinging=true;
            System.out.println("hey"+myPhoneNo+"you are receving a call");
        }else{
            System.out.println("call not received");
        }
    }

    @Override
    public boolean answerCall() {
        if(isRinging){
            System.out.println("call answered");
            this.isRinging=false;
            return true;
        }
        return false;
    }

    @Override
    public boolean isRinging() {
        return isRinging;
    }
}
