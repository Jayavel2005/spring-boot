package jaya.vel.HelloWorld;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/todo")
public class TodoController {
    @GetMapping("/get")
    String  getTodo(){
        return "Hi I am todo";
    }
    @GetMapping("/{id}")
    String getTodoById(@PathVariable int id){
        return "Jayavel  " + id;
    }

    @GetMapping("")
    String getTodo(@RequestParam int id){
        return "vel " + id;
    }

}
