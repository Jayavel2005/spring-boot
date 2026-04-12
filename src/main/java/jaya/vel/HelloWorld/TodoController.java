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
    String getTodo(@RequestParam("todoId") int id){
        return "vel " + id;
    }

    @PostMapping("/create")
    String createuser(@RequestBody String name){
        return name + " Jayavel is hero and the villain";
    }

    @PutMapping("/update/{id}")
    String updateUser(@PathVariable int id){
        return "user updated  " + id;
    }

    @DeleteMapping("/delete/{id}")
    String deleteUser(@PathVariable int id){
        return "user deleted" + id;
    }



}
