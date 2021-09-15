package org.example.web;

import org.example.service.FooService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class FooController
{
  private final FooService service;

  @Autowired
  public FooController(FooService service) {
    this.service = service;
    System.out.println("FooController loaded");
  }

  @RequestMapping("/")
  @ResponseBody
  public String home()
  {
    return service.greet();
  }
}
