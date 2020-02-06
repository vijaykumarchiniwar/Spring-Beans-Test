package com.example.beans.test;

import com.example.beans.bean.MyBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

@Service
public class MyService {

    @Autowired
    MyBean myBean;

    @Autowired
    MyComponent myComponent;

    @PostConstruct
    public void doService(){
        myBean.display();
        myComponent.display();
    }
}
