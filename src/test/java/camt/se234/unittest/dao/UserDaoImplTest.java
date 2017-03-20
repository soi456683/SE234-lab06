package camt.se234.unittest.dao;
import camt.se234.unittest.entity.User;
import camt.se234.unittest.service.UserServiceImpl;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import java.awt.*;
import java.text.DateFormat;
import java.time.LocalDate;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.contains;
import static org.hamcrest.Matchers.containsInAnyOrder;
import static org.hamcrest.Matchers.nullValue;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsCollectionContaining.hasItems;
import static org.hamcrest.core.IsCollectionContaining.*;

public class UserDaoImplTest {
    @Test
    public void testGetUsers(){
        UserDaoImpl userDao = new UserDaoImpl();
        assertThat(userDao.getUsers(),
                hasItems(new User("Prayuth","1234","Tu",
                                LocalDate.of(1979,2,14),"08612345678"),
                        new User("Tucky","5675","Tuckung",
                                LocalDate.of(1999,8,30),"08687654321"),
                        new User("Honey","aabbcc","Honey",
                                LocalDate.of(2012,11,13),"0000000000"),
                        new User("None","none","NoName",
                                LocalDate.of(2112,1,1),"9999999999")

                ));

        assertThat(userDao.getUsers(),
                contains(new User("Prayuth","1234","Tu",
                                LocalDate.of(1979,2,14),"08612345678"),
                        new User("Tucky","5675","Tuckung",
                                LocalDate.of(1999,8,30),"08687654321"),
                        new User("Honey","aabbcc","Honey",
                                LocalDate.of(2012,11,13),"0000000000"),
                        new User("None","none","NoName",
                                LocalDate.of(2112,1,1),"9999999999")

                ));
        assertThat(userDao.getUsers(),
                containsInAnyOrder(new User("Prayuth","1234","Tu",
                                LocalDate.of(1979,2,14),"08612345678"),
                        new User("Tucky","5675","Tuckung",
                                LocalDate.of(1999,8,30),"08687654321"),
                        new User("Honey","aabbcc","Honey",
                                LocalDate.of(2012,11,13),"0000000000"),
                        new User("None","none","NoName",
                                LocalDate.of(2112,1,1),"9999999999")

                ));


    }

    @Test
    public void testLogin(){
        UserServiceImpl userService = new UserServiceImpl();
        UserDaoImpl userDao = new UserDaoImpl();
        userService.setUserDao(userDao);
        assertThat(userService.login("Prayuth","123"),nullValue());
        assertThat(userService.login("Prayuth","1234"),is(new User("Prayuth","1234","Tu",
                LocalDate.of(1979,2,14),"08612345678")));

    }



    @Test
    public void testisAbleToGoToPub() {
        UserServiceImpl userDao = new UserServiceImpl();
        assertThat(userDao.isAbleToGoToPub(new User("None","none","NoName",
                LocalDate.of(2112,1,1),"9999999999"),LocalDate.of(2017,1,1)),is(false));
        assertThat(userDao.isAbleToGoToPub(new User("None","none","NoName",
                LocalDate.of(2112,1,1),"9999999999"),LocalDate.of(2200,1,1)),is(true));

    }

    @Test
    public void testgetPubAllowanceUser(){
        UserServiceImpl userService = new UserServiceImpl();
        UserDaoImpl userDao = new UserDaoImpl();
        userService.setUserDao(userDao);
        assertThat(userService.getPubAllowanceUser( LocalDate.of(2017,3,20)), hasItems(new User("Prayuth","1234","Tu",
                LocalDate.of(1979,2,14),"08612345678")));
    }




    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test
    public void testLoginException(){
        UserServiceImpl userService = new UserServiceImpl();
        UserDaoImpl userDao = new UserDaoImpl();
        userService.setUserDao(userDao);
        // check for the exception we expect
        thrown.expect(NullPointerException.class);
        userService.login("","");
    }



}
