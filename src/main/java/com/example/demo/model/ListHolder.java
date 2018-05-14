package com.example.demo.model;

import java.util.List;

public interface ListHolder {
    List<Integer> getListOfIntegers();
    void clear();
    void fillListWithData(List<Integer> passedList);
}
