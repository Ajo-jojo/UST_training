package com.controller;

import org.springframework.beans.factory.annotation.Autowired;


import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import org.springframework.web.bind.annotation.RestController;

import com.service.WordService;

@RestController
public class WordController {
 @Autowired
 WordService wordService;
 
 @PostMapping(value="wordcount")
 public int wordcount(@RequestBody String text) {
  return wordService.countwords(text);
  
 }

}