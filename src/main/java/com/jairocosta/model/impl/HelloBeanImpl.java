package com.jairocosta.model.impl;

import com.jairocosta.model.HelloBean;


public class HelloBeanImpl implements HelloBean {
    private String msg;


    @Override
    public void printHelloBean() {
        System.out.println("Hello " + msg);
    }
    @Override
    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getMsg() {
        return msg;
    }
}
