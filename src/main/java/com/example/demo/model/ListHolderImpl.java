package com.example.demo.model;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class ListHolderImpl implements ListHolder {
    private List<Integer> listOfIntegers = new ArrayList<Integer>(30);

    public List<Integer> getListOfIntegers() {
        return listOfIntegers;
    }

    public void clear(){
        listOfIntegers.clear();
    }

    public void fillListWithData(List<Integer> passedList){
        for (int i : passedList) {
            listOfIntegers.add(i);
        }
    }
}
