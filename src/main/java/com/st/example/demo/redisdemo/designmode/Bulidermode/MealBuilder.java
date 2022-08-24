package com.st.example.demo.redisdemo.designmode.Bulidermode;


/*
*
*抽象建造者（Builder）
* */
public abstract  class MealBuilder {

    protected Meal meal = new Meal();
    public abstract void buildFood();
    public abstract void buildDrink();
    public Meal getMeal(){return meal;}



}
