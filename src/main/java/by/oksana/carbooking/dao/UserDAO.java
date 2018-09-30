package by.oksana.carbooking.dao;

import by.oksana.carbooking.model.Login;
import by.oksana.carbooking.model.User;

public interface UserDAO {
    void register(User user);
    User validateUser(Login login);
    User selectUser(String username);
}
