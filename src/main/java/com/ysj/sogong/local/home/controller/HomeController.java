package com.ysj.sogong.local.home.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@RequestMapping("/")
@Controller
public class HomeController
{
  @GetMapping("/home")
  @ResponseBody
  public String home()
  {
    return "Hello Sogong!";
  }
}
