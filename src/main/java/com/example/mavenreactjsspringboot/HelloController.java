package com.example.mavenreactjsspringboot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController
{
 @GetMapping("/hello")
  public String greetings() {
    return "Hello Darling I love you";
  }
}
