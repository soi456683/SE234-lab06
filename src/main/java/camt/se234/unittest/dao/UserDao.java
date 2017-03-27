package camt.se234.unittest.dao;

import camt.se234.unittest.entity.User;

import java.util.List;

/**
 * Created by CAMT on 3/27/2017.
 */
public interface UserDao {
    List<User> getUsers() ;
    User findById(long id);

}
