package com.openclassrooms.bobapp;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class BobappApplicationTests {

	@Test
	void contextLoads() {
	}

	@Test
	void testquivarater(){
		assertEquals(1, 2);
	}

}
