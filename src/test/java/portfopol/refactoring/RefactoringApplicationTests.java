package portfopol.refactoring;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import portfopol.refactoring.basic.AppConfig;
import portfopol.refactoring.basic.user.*;

import java.util.Optional;

@SpringBootTest
class RefactoringApplicationTests {


	UserService userService = new UserServiceImpl(new MemoryUserRepository());
//	@BeforeEach
//	public void beforeEach() {
//		AppConfig appConfig = new AppConfig();
//		userService = appConfig.userService();
//	}

	@Test
	void join() {
		User user = new User(1L, "memberA", "aaa@a.com");

		userService.join((User)user);
		User findUser =  userService.findUser(1L).get();

		Assertions.assertThat(user).isEqualTo(findUser);

	}

}
