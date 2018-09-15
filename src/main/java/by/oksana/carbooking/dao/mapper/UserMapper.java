package by.oksana.carbooking.dao.mapper;

import by.oksana.carbooking.model.User;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class UserMapper implements RowMapper<User> {

    @Override
    public User mapRow(ResultSet resultSet, int i) throws SQLException {
        User user = new User();
        user.setFirstname(resultSet.getString("firstname"));
        user.setLastname(resultSet.getString("lastname"));
        user.setDateOfBirth(resultSet.getDate("dateOfBirth"));
        user.setNumPassport(resultSet.getString("numPassport"));
        user.setNumTel(resultSet.getString("numTel"));
        user.setUsername(resultSet.getString("username"));
        user.setPassword(resultSet.getString("password"));
        return user;
    }
}
