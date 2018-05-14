package com.example.demo.controllers;

import com.example.demo.model.ListHolder;
import com.example.demo.model.ListHolderImpl;
import com.example.demo.services.AvgCalculatorService;
import com.example.demo.services.NumberGeneratorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class NumberController {

    @Autowired
    NumberGeneratorService numberGeneratorService;
    @Autowired
    AvgCalculatorService avgCalculatorService;
    @Autowired
    ListHolder listHolder;

    @GetMapping("/random")
    public ResponseEntity<List<Integer>> getListFilledWithRandomNumbers(@RequestHeader(value="List_lenght") int list_lenght) {
        return new ResponseEntity<List<Integer>>(numberGeneratorService.getListFilledWithRandomNumbers(list_lenght), HttpStatus.ACCEPTED);
    }

    @PostMapping("/generated-numbers")
    public ResponseEntity<List<Integer>> postListFilledWithRandomNumbers(@RequestBody List<Integer> listOfNumbers) {
        listHolder.clear();
        listHolder.fillListWithData(listOfNumbers);
        return new ResponseEntity<List<Integer>>(listHolder.getListOfIntegers(), HttpStatus.OK);
    }

    @GetMapping("/avg-value")
    public ResponseEntity<Float> getAvgValue(){
        return new ResponseEntity<Float>(avgCalculatorService.getAvgValueFromPassedList(listHolder.getListOfIntegers()), HttpStatus.ACCEPTED);
    }

}
