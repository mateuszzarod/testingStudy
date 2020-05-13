package com.kodilla.testing.user;

import org.junit.*;

import static org.junit.Assert.*;

public class SimpleUserTest {

    @Before
    public void before(){
        System.out.println("Test Case: begin");
    }
    @After
    public void after(){
        System.out.println("Test Case: end");
    }
    @BeforeClass
    public static void beforeClass() {
        System.out.println("Test Suite: begin");
    }
    @AfterClass
    public static void afterClass() {
        System.out.println("Test Suite: end");
    }

    @Test
        public void userNameTest(){
        //Given
        SimpleUser user = new SimpleUser("Mati", "Mateusz");

        //When
        String userName=user.getUsername();
        System.out.println("Testing " + userName);
        //Then
        Assert.assertEquals("Mati", userName);
    }

    @Test
    public void userRealNameTest(){
        //Given
        SimpleUser user = new SimpleUser("Mati", "Mateusz");

        //When
        String userRealName=user.getRealName();
        System.out.println("Testing " + userRealName);
        //Then
        Assert.assertEquals("Mateusz", userRealName);
    }




}