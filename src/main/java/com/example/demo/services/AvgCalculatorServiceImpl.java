package com.example.demo.services;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AvgCalculatorServiceImpl implements AvgCalculatorService {
    @Override
    public Float getAvgValueFromPassedList(List<Integer> list) {
        int sum  = 0;
        for(int i : list){
            sum+=i;
        }
        return Float.valueOf(sum/list.size());
    }
}
