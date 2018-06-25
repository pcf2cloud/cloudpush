package com.example.demo;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoCloudApplicationTests {

	@Mock
	private UserService userService;

	@Test
	public void testFindUserData() {
		User user = new User("POI0098", "Manvendra Singh");
		when(userService.getUser(user)).thenReturn(user);
		assertEquals(user, userService.getUser(user));
	}
	

}

