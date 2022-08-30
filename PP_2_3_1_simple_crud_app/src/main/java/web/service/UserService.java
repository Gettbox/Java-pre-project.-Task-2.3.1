package web.service;

import web.model.User;

import java.util.List;

public interface UserService {
    List<User> getUserList();

    User getById(int id);

    void add(User user);

    void update(int id, User user);

    void delete(int id);
}
