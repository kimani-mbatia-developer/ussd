package com.example.ussd.domain;

public class ussdObj {
    private long sessionID;
    private long networkCode;
    private long serviceCode;
    private long phoneNumber;
    private String text;

    public ussdObj() {

    }
    private ussdObj(long id, long nCode, long sCode, long number, String text){
        this.sessionID =id;
        this.networkCode = nCode;
        this.serviceCode = sCode;
        this.phoneNumber = number;
        this.text = text;
    }



    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public long getSessionID() {
        return sessionID;
    }

    protected void setSessionID(long sessionID) {
        this.sessionID = sessionID;
    }

    public long getNetworkCode() {
        return networkCode;
    }

    protected void setNetworkCode(long networkCode) {
        this.networkCode = networkCode;
    }

    public long getServiceCode() {
        return serviceCode;
    }

    public void setServiceCode(long serviceCode) {
        this.serviceCode = serviceCode;
    }

    public long getPhoneNumber(){
        return this.phoneNumber;
    }

    protected void setPhoneNumber(long phoneNumber){
        this.phoneNumber = phoneNumber;
    }
}
