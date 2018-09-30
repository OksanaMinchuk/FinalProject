package by.oksana.carbooking.service.impl;

import by.oksana.carbooking.dao.UserDAO;
import by.oksana.carbooking.model.Login;
import by.oksana.carbooking.model.User;
import by.oksana.carbooking.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UserServiceImpl implements UserService {

    @Resource
    private UserDAO userDao;

    @Override
    public void register(User user) {
        userDao.register(user);
    }

    @Override
    public User validateUser(Login login) {
        return userDao.validateUser(login);
    }

    @Override
    public User selectUser(String username) {
        return selectUser(username);
    }
}
