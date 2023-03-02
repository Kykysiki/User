package me.bulkanov;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class UserTest {

    @Test
    @DisplayName("When the login and email not null, we create a user")
    void getNull() {
        User Alex = new User("Alex","alex@yandex.ru");
        Assertions.assertNotNull(Alex.login);
        Assertions.assertNotNull(Alex.email);
        Assertions.assertNotEquals(Alex.login, Alex.email);
    }
    @Test
    @DisplayName("When the login and email not equal, we create a user")
    void getNotEquals() {
        User Alex = new User("Alex","alex@yandex.ru");
        Assertions.assertNotEquals(Alex.login, Alex.email);
    }
    @Test
    @DisplayName("When an email address has an @ sign, we create a user")
    void getEmail() {
        User Alex = new User("Alex","alex@yandex.ru");
        Assertions.assertTrue(Alex.getEmail().contains("@"));
    }
    @Test
    @DisplayName("When the parameters are null, we create an object")
    void getUser() {
        User Test = new User();
        Assertions.assertNull(Test.login);
        Assertions.assertNull(Test.email);
    }
}
