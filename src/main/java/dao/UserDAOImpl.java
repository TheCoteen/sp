package dao;

import dao.User;
import dao.UserDAO;

import java.util.ArrayList;
import java.util.List;

public class UserDAOImpl implements UserDAO {

    List<User> users = new ArrayList<>();

    @Override
    public void saveUser(User user) {
        users.add(user);
    }

    @Override
    public void deleteUser(User user) {
        users.remove(user);
    }

    @Override
    public List<User> getUsers() {
        return users;
    }
}
