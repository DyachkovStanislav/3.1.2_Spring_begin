package ru.stas.spring_begin_3_1_2.dao;

import ru.stas.spring_begin_3_1_2.model.User;


import java.util.List;

public interface UserDao {
    void create(User user);

    List<User> findAllUsers();

    User findById(Long id);

    void update(User user);

    void delete(Long id);


}
