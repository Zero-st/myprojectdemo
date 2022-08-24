package com.st.example.demo.redisdemo.designmode.AbstractFactory;

public interface IPhoneProduct {


    //开机
    void start();
    //关机
    void shutdown();
    //打电话
    void callup();
    //发邮件
    void sendSMS();

}
