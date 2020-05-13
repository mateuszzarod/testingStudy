package com.kodilla.testing.tdd;

public class TestingMain {
    public static void main(String[] args) {
        SimpleUser simpleUser = new SimpleUser("ForumUser");
        String result = simpleUser.getUsername();
        if (result.equals("ForumUser")){
            System.out.println("test OK");
        } else {
            System.out.println("Error!");
        }
    }
}

