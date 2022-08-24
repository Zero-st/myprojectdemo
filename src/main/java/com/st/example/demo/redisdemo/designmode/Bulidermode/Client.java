package com.st.example.demo.redisdemo.designmode.Bulidermode;


import com.alibaba.fastjson.JSON;

public class Client {

    public static void main(String[] args) {

        String decode="\"{\"result_code\":\"1\",\"result_message\":\"成功\"}\"";
        decode=decode.substring(1,decode.length()-1);

        System.out.println(
             decode
        );

        com.alibaba.fastjson.JSONObject jsonObject = JSON.parseObject(decode);

        String result_code = jsonObject.getString("result_code").trim();
        System.out.println(result_code);

        String result_message = jsonObject.getString("result_message");

        MealBuilder builder = new MealBuilderA();
        KFCWaiter kfcWaiter = new KFCWaiter(builder);

        Meal meal = kfcWaiter.construct();
        meal.setDrink("111");
        meal.setFood("222");
        System.out.println(meal.getDrink());
        System.out.println(meal.getFood());
    }


}
