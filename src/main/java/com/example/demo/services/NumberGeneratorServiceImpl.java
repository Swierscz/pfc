package com.example.demo.services;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Service
public class NumberGeneratorServiceImpl implements NumberGeneratorService {
    Random random = new Random();

    public List<Integer> getListFilledWithRandomNumbers(int lenght){
        ArrayList<Integer> list = new ArrayList<>(lenght);
        for(int i = 0; i< lenght; i++){
            list.add(random.nextInt(100));
        }
        return list;
    }

}
