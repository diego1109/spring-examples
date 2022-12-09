package org.example.threadpool.api;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/threadpool")
public class ThreadPoolController {


  @GetMapping()
  public String hello(){
    return "thread-pool"+ ":"+ System.currentTimeMillis();
  }

}
