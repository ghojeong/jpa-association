package persistence.sql.ddl;

import persistence.sql.view.TableName;

public class DropQueryBuilder<T> {
    private final Class<T> clazz;

    public DropQueryBuilder(Class<T> clazz) {this.clazz = clazz;}

    public String build() {
        return new StringBuilder()
                .append("DROP TABLE IF EXISTS ")
                .append(TableName.render(clazz))
                .toString();
    }
}
