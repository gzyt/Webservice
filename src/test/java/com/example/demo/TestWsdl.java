package com.example.demo;
import cn.com.webxml.*;
import org.junit.Test;

import java.util.List;

public class TestWsdl {
    @Test
    public static void main(String[] args) throws Exception {
        TranslatorWebService translatorWebService = new TranslatorWebService();
        TranslatorWebServiceSoap soap = translatorWebService.getTranslatorWebServiceSoap();
        ArrayOfString arrayOfString = soap.getEnCnTwoWayTranslator("person");


        //创建列表，存储翻译结果
        List<String> list = arrayOfString.getString();
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        test();


    }

    @Test
    public static void test() throws Exception {
        TransLationController tl = new TransLationController();
        tl.get("17393163790","");
    }
}
