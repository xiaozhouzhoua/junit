package com.check.entity;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.ValueSource;
import static org.assertj.core.api.Assertions.*;

public class ParameterTest {

    @ParameterizedTest
    @ValueSource(ints={20, 30, 40, 50})
    void check_params(int age) {
        assertThat(age).isGreaterThanOrEqualTo(18);
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/age.csv", numLinesToSkip = 1)
    void check_csv(String name, int age) {
        assertThat(age).isGreaterThanOrEqualTo(18);
    }
}
