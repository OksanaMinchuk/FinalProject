package by.oksana.carbooking.dao.impl;

import by.oksana.carbooking.dao.UserDAO;
import by.oksana.carbooking.dao.mapper.UserMapper;
import by.oksana.carbooking.model.Login;
import by.oksana.carbooking.model.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

public class UserDAOImpl implements UserDAO {

    private static final String SQL_INSERT_USER = "INSERT INTO user (firstname, lastname, dateOfBirth, numPassport, numTel, username, password) VALUES(?,?,?,?,?,?,?)";

    private static final String SQL_SELECT_USER_BY_USERNAME_PASSWORD = "SELECT * FROM user WHERE username=? and password=?";

    private static final String SQL_SELECT_USER_BY_USERNAME = "SELECT id, firstname, lastname, dateOfBirth, numPassport, numTel FROM user WHERE username=?";

    private static final Logger log = LoggerFactory.getLogger(CarDAOImpl.class);

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public void register(User user) {
        jdbcTemplate.update(SQL_INSERT_USER, new Object[] {
                user.getFirstname(),
                user.getLastname(),
                user.getDateOfBirth(),
                user.getNumPassport(),
                user.getNumTel(),
                user.getUsername(),
                user.getPassword()
        });
    }

    @Override
    public User validateUser(Login login) {
        List<User> users = jdbcTemplate.query(SQL_SELECT_USER_BY_USERNAME_PASSWORD,
                new Object[]{login.getUsername(), login.getPassword()},
                new UserMapper());
        return users.size() > 0 ? users.get(0) : null;
    }

    @Override
    public User selectUser(String username) {
        User user = jdbcTemplate.queryForObject(SQL_SELECT_USER_BY_USERNAME, new Object[]{username}, new UserMapper());
        log.info("select user by username");
        return user;
    }
}
