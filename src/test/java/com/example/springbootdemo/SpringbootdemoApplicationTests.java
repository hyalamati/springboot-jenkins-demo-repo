package com.example.springbootdemo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

//@SpringBootTest
@WebMvcTest(SpringbootdemoApplication.class)
class SpringbootdemoApplicationTests {

	/*
	 * @Test void contextLoads() { }
	 */

	@Autowired
	private MockMvc mockMvc;

	@Test
	public void helloEndpointReturnsExpectedHtml() throws Exception {
		mockMvc.perform(get("/")).andExpect(status().isOk())
				.andExpect(content().string("<h1>Hello There!!! Welcome to my project</h1>"));
	}

}
