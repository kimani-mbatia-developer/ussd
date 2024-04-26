package com.example.ussd.web;

import com.example.ussd.domain.ussdObj;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ussdController {

    //@Autowired
    //public ussdObj ussdItm;
    
    @GetMapping("/ussd")
    public String ussdHomepage(){
        return "<h1>Ussd endpoint is here, post to make a request</h1>";
    }



    @PostMapping("/ussd")
    public String ussdRes(@RequestBody ussdObj ussd){

        int inputInt = Integer.parseInt(ussd.getText());
        //return ussd.getText();
        if (inputInt == 1){
            return "Option 1!";
        }

        if (inputInt == 2){
            return "Option 2!";
        }

        if (inputInt == 3){
            return "Option 3!";
        }

//        if(ussd.getText().isEmpty()|| ussd.getText()==""){
//            return "CON What would you like to check\n1. My account\2. My phone number";
//        }
//
//        if(ussd.getText()=="zero"){
//            String empty = "You selected 0!";
//            return empty;
//        }
//
//        if(ussd.getText() =="1"){
//            return "You entered 1!";
//        }

        else {return "conditional placeholder";}

        //return "conditional placeholder";

    }
}
