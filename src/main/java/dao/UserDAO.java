package dao;

import dao.User;

import java.util.List;

public interface UserDAO {
    void saveUser(User user);

    void deleteUser(User user);

    List<User> getUsers();
}
