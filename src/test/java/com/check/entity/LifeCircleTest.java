package com.check.entity;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

public class LifeCircleTest {

    User user;

    @BeforeEach
    void setup() {
        user = new User("z", 22, LocalDate.now().minusYears(2));
        System.out.println("数据准备就绪!");
    }

    @Test
    public void middle_test() {
        System.out.println("测试中...");
    }

    @AfterEach
    void cleanup() {
        user = null;
        System.out.println("数据清理完毕!");
    }
}
