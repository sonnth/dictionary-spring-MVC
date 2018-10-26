package com.sonnth.service;

import java.util.HashMap;
import java.util.Map;

public class Dictionary {
    private static Map<String,String> data;
    static{
        data = new HashMap<>();
        data.put("hello","xin chao");
        data.put("cat","con meo");
        data.put("apple","qua tao");
        data.put("banana","qua chuoi");
        data.put("dog","con cho");
        data.put("camel","con lac da");
    }

    public HashMap<String, String> findAllData(){
        return (HashMap<String, String>) data;
    }

    public String getVi(String eng){
        if(data.containsKey(eng.toLowerCase())){
            return data.get(eng);
        }else{
            return "Not found";
        }
    }
}