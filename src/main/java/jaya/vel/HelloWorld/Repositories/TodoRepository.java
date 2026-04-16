package jaya.vel.HelloWorld.Repositories;

import org.springframework.stereotype.Component;

import java.util.ArrayList;

@Component
public class TodoRepository {

    ArrayList<String> todos = new ArrayList<>();

    public void  createTodo(String todo){
        todos.add(todo);
    }

    public ArrayList<String> getAllTodo(){
        return todos;
    }

    public String getByIndex(int index){
        if (todos.isEmpty()) return "Todo list is empty";
        return todos.get(index);
    }

    public String update(int index, String newTodo){
        todos.set(index, newTodo);
        return "Your Task Updated";
    }

    public String deleteTodo(int index){
        todos.remove(index);
        return "Your task deleted";
    }
}
