package com.check.entity;

import org.junit.jupiter.api.Test;
import java.time.LocalDate;
import static org.junit.jupiter.api.Assertions.*;

class UserTest {
    User user = new User("x", 20, LocalDate.now().minusYears(2));

    @Test
    public void user_age_check() {
        assertTrue(user.getAge() > 16);
    }

    @Test
    public void user_name_check() {
        assertEquals(user.getName(), "x");
    }
}