package portfopol.refactoring.basic.user;

import java.util.Optional;

public interface UserService {

    void join(User user);

    Optional<User> findUser(Long UserId);
}
