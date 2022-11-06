package web.service;

import org.springframework.stereotype.Service;
import web.model.User;

import java.util.List;

@Service
public interface UserService {

    void add(User user);

    void delete(int id);

    void edit(User user, int id);

    User getById(int id);

    List<User> getAllUsers();
}
