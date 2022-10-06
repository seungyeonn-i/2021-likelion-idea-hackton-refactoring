package portfopol.refactoring.basic.user;

import lombok.Data;

import java.util.List;
import java.util.Optional;

@Data
public class User {

    private Long userId;
    private String userName;
    private String email;

    public User(Long userId, String userName, String email) {
        this.userId = userId;
        this.userName = userName;
        this.email = email;
    }
}
