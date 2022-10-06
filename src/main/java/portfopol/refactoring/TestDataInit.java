package portfopol.refactoring;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import portfopol.refactoring.basic.user.User;
import portfopol.refactoring.basic.user.UserRepository;

import javax.annotation.PostConstruct;

@Slf4j
@Component
@RequiredArgsConstructor
public class TestDataInit {

    private final UserRepository userRepository;

    @PostConstruct
    public void init() {
        userRepository.save(new User(0L,"userA","@.com"));
        userRepository.save(new User(0L+1,"userB","@.com"));

        log.warn(String.valueOf(userRepository.findById(0L).toString()));
    }
}
