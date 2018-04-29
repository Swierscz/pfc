package com.example.demo.services;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Service
public class NumberGeneratorServiceImpl implements NumberGeneratorService {
    Random random = new Random();

    public List<Integer> getListFilledWithRandomNumbers(){
        ArrayList<Integer> list = new ArrayList<>(10);
        for(int i = 0; i< 10; i++){
            list.add(random.nextInt(100));
        }
        return list;
    }

}
