package com.example.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.services.NumberGeneratorService;

import java.util.List;

@RestController
@RequestMapping("/api")
public class NumberGeneratorController {

    @Autowired
    NumberGeneratorService numberGeneratorService;

    @GetMapping ("/random")
    public ResponseEntity<List<Integer>> getListFilledWithRandomNumbers(){
        return  new ResponseEntity<List<Integer>>(numberGeneratorService.getListFilledWithRandomNumbers(), HttpStatus.OK);
    }

}
