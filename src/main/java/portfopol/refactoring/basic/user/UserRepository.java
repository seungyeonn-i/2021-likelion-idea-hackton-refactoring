package portfopol.refactoring.basic.user;

import java.util.List;
import java.util.Optional;

public interface UserRepository {

    void save(User user);
    Optional<User> findById(Long userId);
    Optional<User> findByName(String userName);
    List<User> findAll();

}
