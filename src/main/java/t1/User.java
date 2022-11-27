package t1;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
public class User {
    private int id;
    private String name;
    private String email;
    private int age;

    public void saveUser() {
        DBConnection dbConnection = DBConnection.getInstance();
        dbConnection.parseQuery("insert into user values ('" + name + "', '" + email + "', " + age + ")");
    }
}
