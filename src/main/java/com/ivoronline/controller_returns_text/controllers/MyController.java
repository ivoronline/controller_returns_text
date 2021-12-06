package com.ivoronline.controller_returns_text.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("Start")          //URLs of all Endpoints start with this prefix
public class MyController {

  //============================================================================
  // HELLO
  //============================================================================
  @ResponseBody
  @RequestMapping("Hello")
  public String hello() {
    return "Hello from Controller";
  }

}


