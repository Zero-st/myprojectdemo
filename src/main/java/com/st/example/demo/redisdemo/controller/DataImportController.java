package com.st.example.demo.redisdemo.controller;


import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.net.URLDecoder;
import java.nio.charset.StandardCharsets;

@RestController
@RequestMapping("/external/dataImport")
public class DataImportController {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());


    @ResponseBody
    @PostMapping("/proKG")
    public String proKG(HttpServletRequest request) {
        String responseData = "";
        try {
            String requestData = request.getParameter("requestData");
            System.out.println(requestData);
            requestData = URLDecoder.decode(requestData, String.valueOf(StandardCharsets.UTF_8));
            logger.info("请求报文：{}", requestData);

            System.out.println("响应结果："+ URLDecoder.decode("\"%7B%22result_code%22%3A%221%22%2C%22result_message%22%3A%22%E6%88%90%E5%8A%9F%22%7D\"\n","UTF-8"));

            String decode = URLDecoder.decode("%7B%22result_code%22%3A%221%22%2C%22result_message%22%3A%22%E6%88%90%E5%8A%9F%22%7D", "UTF-8");

            System.out.println(decode);
            //com.alibaba.fastjson.JSONObject jsonObject = JSON.parseObject("%7B%22result_code%22%3A%221%22%2C%22result_message%22%3A%22%E6%88%90%E5%8A%9F%22%7D");


            com.alibaba.fastjson.JSONObject jsonObject = JSON.parseObject(decode);

            String result_code = jsonObject.getString("result_code");

            String result_message = jsonObject.getString("result_message");
            System.out.println(result_code);
            System.out.println(result_message);






           /* JSONObject jsonObject1 = JSON.parseObject(decode.trim());

            String result_code1 = jsonObject1.getJSONObject("result_code").toString();

            String result_message1 = jsonObject1.getJSONObject("result_message").toString();
            System.out.println(result_code1);
            System.out.println(result_message1);*/
        } catch (Exception e) {
            e.printStackTrace();
        }
        responseData="%7B%22result_code%22%3A%221%22%2C%22result_message%22%3A%22%E6%88%90%E5%8A%9F%22%7D";
        return responseData;
    }

}
