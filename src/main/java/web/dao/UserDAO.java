package web.dao;

import web.model.User;

import java.util.List;

public interface UserDAO {

    void add(User user);

    void delete(int id);

    void edit(User user, int id);

    User getById(int id);

    List<User> getAllUsers();
}
