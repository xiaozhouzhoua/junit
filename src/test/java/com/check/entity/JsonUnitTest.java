package com.check.entity;

import static net.javacrumbs.jsonunit.assertj.JsonAssertions.assertThatJson;
import org.junit.jupiter.api.Test;
import java.time.LocalDate;

/**
 * java text block语法需要JDK15
 * <a href="https://www.baeldung.com/java-text-blocks">Java Text Blocks</a>
 */
public class JsonUnitTest {
    User user = new User("z", 23, LocalDate.now().minusYears(4));

    @Test
    public void json_unit() {
        assertThatJson(user).isEqualTo("""
            {
                "name": "z",
                "age": 23,
                "createDate": [
                    2018,
                    5,
                    15
                ]
            }
        """);
    }
}
