package com.st.example.demo.redisdemo.designmode.Bulidermode;

public class Meal {

    private String food;
    private String drink;

    public void setFood(String food){
        this.food  = food;
    }
    public void setDrink(String drink){
        this.drink = drink;
    }
    String getFood(){return food;}
    String getDrink(){return drink;}

}
