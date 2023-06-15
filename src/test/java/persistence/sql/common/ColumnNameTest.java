package persistence.sql.common;

import domain.Person;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class ColumnNameTest {

    @Test
    @DisplayName("name 이 명시되지 않으면, 변수명이 ColumnName 이 된다.")
    void columnWithoutName() throws NoSuchFieldException {
        String actual = new ColumnName(
                Person.class.getDeclaredField("email")
        ).toString();
        assertThat(actual).isEqualTo("email");
    }

    @Test
    @DisplayName("name 이 명시되어 있다면, 변수명이 ColumnName 이 된다.")
    void columnWithName() throws NoSuchFieldException {
        String actual = new ColumnName(
                Person.class.getDeclaredField("name")
        ).toString();
        assertThat(actual).isEqualTo("nick_name");
    }
}
