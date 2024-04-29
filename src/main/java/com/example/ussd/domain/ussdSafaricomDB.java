package com.example.ussd.domain;

//import jakarta.persistence.Entity;
//import jakarta.persistence.GeneratedValue;
//import jakarta.persistence.GenerationType;
//import jakarta.persistence.Id;

//@Entity
public class ussdSafaricomDB extends ussdObj {
    //@Id
    //@GeneratedValue(strategy = GenerationType.AUTO)
    //private long number;
    private String text;

    public ussdSafaricomDB(long number,String txt){
        super();
        super.setSessionID(1);
        super.setNetworkCode(0001);
        super.setServiceCode(3333);

        //this.number = no;
        this.text = txt;

        super.setPhoneNumber(number);
        super.setText(this.text);
        this.text = txt;
    }
}
