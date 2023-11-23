package hw_nr_21;

public enum SQLQueries {
    INSERT_NEW_STUDENT("insert into students2(name, age, grade) values(?,?,?)") ,
    REFRESH_GRADE("update students2 set grade = ? where id = ?"),
    DELETE_STUDENT("delete from students2 where id = ? "),
    SHOW_ALL_STUDENTS("select * from students2");

    final String query;
    SQLQueries(String query) {
        this.query = query;
    }
}
