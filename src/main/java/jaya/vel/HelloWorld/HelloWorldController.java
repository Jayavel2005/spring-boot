package jaya.vel.HelloWorld;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
    @GetMapping("/hello")
    public String hello(){
        return "Hello Man";
    }

    @GetMapping("/name")
    String name(){
        return "Jayavel";
    }

}
