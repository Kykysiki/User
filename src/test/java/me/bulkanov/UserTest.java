package me.bulkanov;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class UserTest {

    @Test
    @DisplayName("When the login not null, we create a user")
    void getLogin() {
        User Alex = new User("Alex","alex@yandex.ru");
        Assertions.assertNotNull(Alex.login);
    }
    @Test
    @DisplayName("When the email noy null, we create a user")
    void getEmail() {
        User Alex = new User("Alex","alex@yandex.ru");
        Assertions.assertNotNull(Alex.email);
    }
}
