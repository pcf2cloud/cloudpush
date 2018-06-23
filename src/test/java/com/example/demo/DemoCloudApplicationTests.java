package com.example.demo;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoCloudApplicationTests {

	
	
	@Mock
    private UserService userService;
	
	
	
	@Test
    public void testData() {
        User U = new User("POI0098", "Manvendra Singh");
        assertNotEquals(U, userService.getUser(new User("POI0098", "Manvendra Singh")));
    }

}
