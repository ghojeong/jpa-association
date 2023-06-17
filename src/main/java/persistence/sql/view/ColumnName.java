package persistence.sql.view;

import jakarta.persistence.Column;

import java.lang.reflect.Field;

public final class ColumnName {

    private ColumnName() {}

    public static String render(Field field) {
        final Column column = field.getDeclaredAnnotation(Column.class);
        return column == null || column.name().isBlank()
                ? field.getName()
                : column.name();
    }
}
