package com.st.example.demo.redisdemo.designmode.AbstractFactory;

public class HuaweiFactory implements IProductFactory{


    @Override
    public IPhoneProduct phoneProduct() {
        return new HuaweiPhone();
    }

    @Override
    public IRouterProduct routerProduct() {
        return new HuaweiRouter();
    }
}
