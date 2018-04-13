package com.example.firebase.MainController;

import com.example.firebase.Model.User;
import com.example.firebase.Repository.Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping(path = "/demo")
public class MainController {
    @Autowired
    private Repository repository;
    @GetMapping(path="/add")
    public @ResponseBody String addNewUser (@RequestParam String id,@RequestParam String message) {

        User n = new User();
        n.setId(id);
        n.setMessage(message);
        repository.save(n);
        return "Saved";
    }
    @GetMapping(path="/all")
    public @ResponseBody Iterable<User> getAllUsers() {
        return repository.findAll();
    }

}
