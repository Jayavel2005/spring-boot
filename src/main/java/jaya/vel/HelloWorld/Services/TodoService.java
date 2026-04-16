package jaya.vel.HelloWorld.Services;

import jaya.vel.HelloWorld.Repositories.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class TodoService {

    @Autowired
    private TodoRepository todoRepository;

//    creating todo

    public void createTodoService(String todo) {
        todoRepository.createTodo(todo);

    }

    public ArrayList<String> getAllTodo() {
        return todoRepository.getAllTodo();
    }

    public String getByInddex(int index) {
        return todoRepository.getByIndex(index);
    }

    public String updateTodo(int index, String newTodo) {
        return todoRepository.update(index, newTodo);

    }

    public  String deleteTodo(int index){
        return todoRepository.deleteTodo(index);
    }


}
