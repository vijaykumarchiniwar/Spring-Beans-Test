package com.example.beans.test;

import com.example.beans.bean.MyBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class MyComponent {

    @Value("${property.prop1}")
    String prop1;

    @Autowired
    MyBean myBean;

    @PostConstruct
    public void doService(){
        myBean.display();
    }

    public void display() {
        System.out.println(prop1);
    }

    public MyComponent(/*@Autowired MyBean myBean*/){
        //this.myBean = myBean;
        //myBean.display();
    }
}
