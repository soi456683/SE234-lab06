package camt.se234.unittest.dao;

import camt.se234.unittest.entity.User;
import camt.se234.unittest.service.UserServiceImpl;

import java.util.*;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;

import static org.hamcrest.Matchers.contains;
import static org.hamcrest.Matchers.containsInAnyOrder;

import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsCollectionContaining.hasItems;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;


public class UserDaoImplTest {
    @Test
    public void testGetUsers(){
        UserDao userDao = mock(UserDao.class);
        when(userDao.getUsers())
                .thenReturn(Arrays.asList(
                        new User("Prayuth","1234","Tu",
                                LocalDate.of(1979,2,14),"08612345678"),
                        new User("Tucky","5675","Tuckung",
                                LocalDate.of(1999,8,30),"08687654321")
                ));
        UserServiceImpl userService = new UserServiceImpl();
        userService.setUserDao(userDao);
        /*assertThat(userDao.getUsers(),
                hasItems(new User("Prayuth","1234","Tu",
                                LocalDate.of(1979,2,14),"08612345678"),
                        new User("Tucky","5675","Tuckung",
                                LocalDate.of(1999,8,30),"08687654321"),
                        new User("Honey","aabbcc","Honey",
                                LocalDate.of(2012,11,13),"0000000000"),
                        new User("None","none","NoName",
                                LocalDate.of(2018,2,2),"9999999999"),

                        new User("Kanjanaroot","1234","Fluke",
                                LocalDate.of(1980,2,14),"08612341678"),
                        new User("Kittipan","5675","James",
                                LocalDate.of(1998,8,30),"08687654311"),
                        new User("Kanatip","1134","Max",
                                LocalDate.of(1979,2,24),"08612345671"),
                        new User("Thapakorn","5615","OAT",
                                LocalDate.of(2000,8,30),"08187654321"),

                        new User("KKK","1235","AFK",
                                LocalDate.of(1989,12,14),"08512341678"),
                        new User("Kimpan","5676","J",
                                LocalDate.of(1999,4,30),"09687654311"),
                        new User("Katip","1034","Xax",
                                LocalDate.of(1977,12,4),"08622345671"),
                        new User("Thapanis","5415","GOAT",
                                LocalDate.of(2017,5,10),"09187654321")

                ));

        assertThat(userDao.getUsers(),
                contains(new User("Prayuth","1234","Tu",
                                LocalDate.of(1979,2,14),"08612345678"),
                        new User("Tucky","5675","Tuckung",
                                LocalDate.of(1999,8,30),"08687654321"),
                        new User("Honey","aabbcc","Honey",
                                LocalDate.of(2012,11,13),"0000000000"),
                        new User("None","none","NoName",
                                LocalDate.of(2018,2,2),"9999999999"),
                        new User("Kanjanaroot","1234","Fluke",
                                LocalDate.of(1980,2,14),"08612341678"),
                        new User("Kittipan","5675","James",
                                LocalDate.of(1998,8,30),"08687654311"),
                        new User("Kanatip","1134","Max",
                                LocalDate.of(1979,2,24),"08612345671"),
                        new User("Thapakorn","5615","OAT",
                                LocalDate.of(2000,8,30),"08187654321"),
                        new User("KKK","1235","AFK",
                                LocalDate.of(1989,12,14),"08512341678"),
                        new User("Kimpan","5676","J",
                                LocalDate.of(1999,4,30),"09687654311"),
                        new User("Katip","1034","Xax",
                                LocalDate.of(1977,12,4),"08622345671"),
                        new User("Thapanis","5415","GOAT",
                                LocalDate.of(2017,5,10),"09187654321")

                ));

        assertThat(userDao.getUsers(),
                contains(new User("Prayuth","1234","Tu",
                                LocalDate.of(1979,2,14),"08612345678"),
                        new User("Tucky","5675","Tuckung",
                                LocalDate.of(1999,8,30),"08687654321"),
                        new User("Honey","aabbcc","Honey",
                                LocalDate.of(2012,11,13),"0000000000"),
                        new User("None","none","NoName",
                                LocalDate.of(2018,2,2),"9999999999"),
                        new User("Kanjanaroot","1234","Fluke",
                                LocalDate.of(1980,2,14),"08612341678"),
                        new User("Kittipan","5675","James",
                                LocalDate.of(1998,8,30),"08687654311"),
                        new User("Kanatip","1134","Max",
                                LocalDate.of(1979,2,24),"08612345671"),
                        new User("Thapakorn","5615","OAT",
                                LocalDate.of(2000,8,30),"08187654321"),
                        new User("KKK","1235","AFK",
                                LocalDate.of(1989,12,14),"08512341678"),
                        new User("Kimpan","5676","J",
                                LocalDate.of(1999,4,30),"09687654311"),
                        new User("Katip","1034","Xax",
                                LocalDate.of(1977,12,4),"08622345671"),
                        new User("Thapanis","5415","GOAT",
                                LocalDate.of(2017,5,10),"09187654321")

                ));

        assertThat(userDao.getUsers(),
                containsInAnyOrder((new User("Prayuth","1234","Tu",
                                LocalDate.of(1979,2,14),"08612345678")),
                        new User("Tucky","5675","Tuckung",
                                LocalDate.of(1999,8,30),"08687654321"),
                        new User("Honey","aabbcc","Honey",
                                LocalDate.of(2012,11,13),"0000000000"),
                        new User("None","none","NoName",
                                LocalDate.of(2018,2,2),"9999999999"),
                        new User("Kanjanaroot","1234","Fluke",
                                LocalDate.of(1980,2,14),"08612341678"),
                        new User("Kittipan","5675","James",
                                LocalDate.of(1998,8,30),"08687654311"),
                        new User("Kanatip","1134","Max",
                                LocalDate.of(1979,2,24),"08612345671"),
                        new User("Thapakorn","5615","OAT",
                                LocalDate.of(2000,8,30),"08187654321"),
                        new User("KKK","1235","AFK",
                                LocalDate.of(1989,12,14),"08512341678"),
                        new User("Kimpan","5676","J",
                                LocalDate.of(1999,4,30),"09687654311"),
                        new User("Katip","1034","Xax",
                                LocalDate.of(1977,12,4),"08622345671"),
                        new User("Thapanis","5415","GOAT",
                                LocalDate.of(2017,5,10),"09187654321")

                ));*/
    }

    @Test
    public void testLoginException()  {
        UserServiceImpl userService = new UserServiceImpl();
        UserDaoImpl userDao = new UserDaoImpl();
        userService.setUserDao(userDao);
        // check for the exception we expect
        thrown.expect(NullPointerException.class);
        userService.login("","");
        User user = new User("Prayuth","1234","Tu", LocalDate.of(1979,2,14),"08612345678");
        assertThat(userService.login("Prayuth","1234"),null);
    }
    
    @Test
    public void testisAbleToGoToPub(User inputUser,LocalDate date,boolean expected){
        UserServiceImpl userService = new UserServiceImpl();
        UserDaoImpl userDao = new UserDaoImpl();
        userService.setUserDao(userDao);
        assertThat(userService.isAbleToGoToPub(inputUser,date),is(expected));


    }
    @Test
    public void testgetPubAllowanceUser(){
        List<User> list = new ArrayList<>();
        UserServiceImpl userService = new UserServiceImpl();
        UserDao userDao = mock(UserDao.class);
        userService.setUserDao((UserDao) userDao);
        assertThat(userService.getPubAllowanceUser(LocalDate.of(2017,3,20)), is(list));
//2.2 naja
    }

    @Test
    public void testLogin(){
        UserDao userDao = mock(UserDao.class);
        when(userDao.getUsers())
                .thenReturn(Arrays.asList(
                        new User("Prayuth","1234","Tu",
                                LocalDate.of(1979,2,14),"08612345678"),
                        new User("Tucky","5675","Tuckung",
                                LocalDate.of(1999,8,30),"08687654321")
                ));
        UserServiceImpl userService = new UserServiceImpl();
        userService.setUserDao(userDao);
    }
    @Test
    public void testFindById(){
        UserDao userDao = mock(UserDao.class);
        when(userDao.findById(1))
                .thenReturn( new User("Prayuth","1234","Tu",
                        LocalDate.of(1979,2,14),"08612345678"));
        when(userDao.findById(10))
            .thenReturn( new User("Tucky","5675","Tuckung",
                         LocalDate.of(1999,8,30),"08687654321"));
        when(userDao.findById(org.mockito.Matchers.any()))
                .thenReturn( new User("","","",
                        null,""));
    }






    @Rule
    public ExpectedException thrown = ExpectedException.none();



}