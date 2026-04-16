package jaya.vel.HelloWorld.Controllers;

import jaya.vel.HelloWorld.Services.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.lang.reflect.Array;
import java.util.ArrayList;

@RestController
@RequestMapping("/api/v1")
public class TodoController {
    @Autowired
    private TodoService todoService;

    //    getAll
    @GetMapping("/getAll")
    public ArrayList<String> getAll() {
        return  todoService.getAllTodo();
    }

    //    get By Index
    @GetMapping("/get/{id}")
    public String todoByIndex(@PathVariable int id) {
        return todoService.getByInddex(id);
    }

    //    create todo
    @PostMapping("/create")
    public String createTodo(@RequestBody String todo) {
        todoService.createTodoService(todo);
        return "Your task is added.";
    }

    /* update todo

     */
    @PutMapping("/update/{id}")
    public String updateTodo(@PathVariable int id, @RequestBody String todo) {
        return todoService.updateTodo(id, todo);
    }

    //    delete todo
    @DeleteMapping("/delete/{id}")
    public String deleteTodo(@PathVariable int id) {
        return todoService.deleteTodo(id);
    }
}
