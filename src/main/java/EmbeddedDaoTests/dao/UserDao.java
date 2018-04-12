package EmbeddedDaoTests.dao;

import EmbeddedDaoTests.model.User;

import java.util.List;

public interface UserDao {
    User findByName(String name);

    List<User> findAll();
}
