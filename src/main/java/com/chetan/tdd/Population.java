package com.chetan.tdd;

import java.util.HashMap;
import java.util.Map;

public class Population {


    public int getPopulation(String city) {

        Map<String, Integer> population = populationStaistic();
        int count = populationStaistic().get(city);
        return count ;
    }

     private Map<String,Integer> populationStaistic(){

           Map<String, Integer>  data = new HashMap<>();

         data.put("Bangalore", 200000);
         data.put("Nagpur", 400000);
         data.put("Pune", 500000);
         data.put("Bhandara", 700000);
         data.put("Mumbai", 900000);
         data.put("Gujrat", 300000);

         return data;


     }


}
