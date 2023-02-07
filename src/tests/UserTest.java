package tests;

import model.User;

public class UserTest {
    public static void main(String[] args) {
//        User testUser = new User(
//                "mike",
//                "my_passwd",
//                "Mike",
//                "Smith",
//                "07771234567"
//        );
//
//        System.out.println(testUser);

        String test_username = "mike";
        String test_password = "my_passwd";
        String test_first_name = "Mike";
        String test_last_name = "Smith";
        String test_mobile_number = "07771234567";

        User testUser = new User(
                test_username,
                test_password,
                test_first_name,
                test_last_name,
                test_mobile_number
        );

        Boolean passed = true;

        if (testUser.getUsername() != test_username) {
            System.out.println("TC1 failed: username did not match");
            passed = false;
        }
        if (testUser.getPassword() != test_password) {
            System.out.println("TC2 failed: password did not match");
            passed = false;
        }

        if (passed) {
            System.out.println("All TC's passed.");
        }

    }
}
