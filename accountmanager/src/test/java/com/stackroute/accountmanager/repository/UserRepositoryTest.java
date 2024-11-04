package com.stackroute.accountmanager.repository;


import static org.assertj.core.api.Assertions.assertThat;

import java.util.Date;
import java.util.Optional;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
//import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import com.stackroute.accountmanager.AccountmanagerApplication;
import com.stackroute.accountmanager.model.User;

@RunWith(SpringRunner.class)
@AutoConfigureTestDatabase(replace=Replace.NONE)
@SpringBootTest
@ComponentScan(basePackages = "com.stackroute.accountmanager")
@ContextConfiguration(classes = AccountmanagerApplication.class)
public class UserRepositoryTest {

	@Autowired
	private UserRepository userRepo;
	
	private User user;
	
	
	@Before
	public void setUp() throws Exception {
		user = new User("brijesh123", "brijesh", "vishwakarma", "Pass@1234",new Date());
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testRegisterUserSuccess() {
		userRepo.save(user);
		Optional<User> option = userRepo.findById(user.getUserId());
		assertThat(option.equals(user));
	}
	

	@Test
	public void findByUserIdAndPassword() {
		userRepo.save(user);
		User testUser = userRepo.findByUserIdAndPassword("brijesh123", "Pass@1234");
		System.out.println(user+ "   "+testUser);
		assertThat(testUser.equals(user));
	}
	
	@Test
	public void findById() {
		Optional<User> testUser = userRepo.findById("brijesh123");
		assertThat(testUser.equals(user));
	}

}
