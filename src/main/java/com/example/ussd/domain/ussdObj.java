package com.example.ussd.domain;

public class ussdObj {
    private long sessionID;
    private long networkCode;
    private long serviceCode;
    private long phoneNumber;
    private String text;

    private ussdObj(long id, long nCode, long sCode,long number, String txt){
        this.sessionID =id;
        this.networkCode = nCode;
        this.serviceCode = sCode;
        this.phoneNumber = number;
        this.text = txt;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
