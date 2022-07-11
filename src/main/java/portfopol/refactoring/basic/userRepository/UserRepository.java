package portfopol.refactoring.basic.userRepository;

import portfopol.refactoring.basic.MyUser;

import java.util.List;
import java.util.Optional;

public interface UserRepository {

    MyUser save(MyUser myUser);
    Optional<MyUser> findById(Long id);
    Optional<MyUser> findByName(String name);
    List<MyUser> findAll();

}
