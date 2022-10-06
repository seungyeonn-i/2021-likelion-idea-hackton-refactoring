package portfopol.refactoring.basic;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import portfopol.refactoring.basic.user.MemoryUserRepository;
import portfopol.refactoring.basic.user.UserService;
import portfopol.refactoring.basic.user.UserServiceImpl;

@Configuration
public class AppConfig {

    @Bean
    public UserService userService() {
        return new UserServiceImpl((userRepository()));
    }

    @Bean
    public MemoryUserRepository userRepository() {
        return new MemoryUserRepository();
    }
}
