package com.service;

import org.springframework.stereotype.Service;

@Service
public class WordService {
public int countwords(String text) {
  if (text == null || text.trim().isEmpty()) {
         return 0;
     }

     String[] words = text.trim().split("\\s+");
     return words.length;
}

}