package com.st.example.demo.redisdemo.designmode.AbstractFactory;

public class AbatractFactoryDemo1 {


    public static void main(String[] args) {


        //创建一个工厂
        HuaweiFactory huaweiFactory = new HuaweiFactory();

        IPhoneProduct huaweiproduct = huaweiFactory.phoneProduct();

        huaweiproduct.start();

    }




}
