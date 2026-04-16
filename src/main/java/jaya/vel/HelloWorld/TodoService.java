package jaya.vel.HelloWorld;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

@Service
public class TodoService {
    @Autowired
    private TodoRepository todoRepository;



    public String printTodos(){
        return todoRepository.getTodo();
    }
}
