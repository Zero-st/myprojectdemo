package com.st.example.demo.redisdemo.designmode.Bulidermode;

public class KFCWaiter {

    /**
     *指挥者：调用建造者中的方法完成复杂对象的创建。
     *
     */

    private MealBuilder mb;

    public  KFCWaiter(MealBuilder mb)
    {
        this.mb = mb;
    }

    public  Meal construct()
    {

        mb.buildFood();
        mb.buildDrink();
        return mb.getMeal();
    }


}
