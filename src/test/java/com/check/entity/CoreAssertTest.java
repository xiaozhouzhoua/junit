package com.check.entity;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import java.time.LocalDate;
import static org.assertj.core.api.Assertions.*;

/**
 * 使用assertj 流式断言
 */
public class CoreAssertTest {
    User user = new User("y", 23, LocalDate.now().minusYears(3));
    @Test
    @DisplayName("年龄测试")
    public void user_age_check() {
        assertThat(user.getAge()).isGreaterThan(16);
    }
    @Test
    @DisplayName("姓名测试")
    public void user_name_check() {
        assertThat(user.getName()).isEqualTo("y");
    }
    @Test
    @DisplayName("名字开头测试")
    public void user_name_check_started() {
        assertThat(user.getName()).startsWith("y");
    }

    @Test
    @DisplayName("提示信息测试")
    public void user_name_check_as() {
        assertThat(user.getAge())
                .as("User %s age should be more than 22.", user.getName())
                .isGreaterThan(22);
    }
}
