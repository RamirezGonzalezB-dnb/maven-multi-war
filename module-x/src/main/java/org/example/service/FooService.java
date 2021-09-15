package org.example.service;

import org.springframework.stereotype.Service;

@Service
public class FooService
{
  public FooService() {
    System.out.println("FooService loaded");
  }

  public String greet()
  {
    return "Hello";
  }
}
