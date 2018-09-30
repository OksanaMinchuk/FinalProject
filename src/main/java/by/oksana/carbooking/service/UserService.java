package by.oksana.carbooking.service;

import by.oksana.carbooking.model.Login;
import by.oksana.carbooking.model.User;

public interface UserService {
    void register(User user);
    User validateUser(Login login);
    User selectUser(String username);
}
