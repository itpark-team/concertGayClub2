package com.example.concert.controller;

import com.example.concert.model.User;
import com.example.concert.service.UsersService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/users")
@CrossOrigin(origins = "*", maxAge = 3600)
@AllArgsConstructor
public class UsersController {
    private final UsersService usersService;

    @GetMapping(value = "/getAll")
    public List<User> getAll() {
        return usersService.getAll();
    }

    @PostMapping(value = "/addNew")
    public void addNew(@RequestBody User user) {
        usersService.addNew(user);
    }

    @PutMapping(value = "/updateById/{id}")
    public void deleteById(@PathVariable int id, @RequestBody User user) {
        usersService.updateById(id, user);
    }

    @DeleteMapping(value = "/deleteById/{id}")
    public void deleteById(@PathVariable int id) {
        usersService.deleteById(id);
    }

}
