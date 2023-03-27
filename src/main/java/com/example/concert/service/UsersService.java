package com.example.concert.service;

import com.example.concert.model.User;
import com.example.concert.repository.UsersRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class UsersService {
    private final UsersRepository usersRepository;

    public List<User> getAll() {
        return usersRepository.findAllByOrderByIdAsc();
    }

    public void addNew(User user) {
        usersRepository.save(user);
    }

    public void updateById(int id, User user) {
        User findUser = usersRepository.findById(id).get();

        findUser.setNickname(user.getNickname());
        findUser.setTicketPrice(user.getTicketPrice());

        usersRepository.save(findUser);
    }

    public void deleteById(int id) {
        usersRepository.deleteById(id);
    }


}
