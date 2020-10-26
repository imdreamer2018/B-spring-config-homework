package com.thoughtworks.capability.gtb.demospringconfig;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.util.ReflectionTestUtils;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class DemoSpringConfigApplicationTests {

	@InjectMocks
	private LevelController levelController;

	@Test
	void contextLoads() {
	}

	@Test
	void should_return_basic_when_level_number_less_than_1() {
		ReflectionTestUtils.setField(levelController, "levelNumber", 0);
		assertEquals("basic", levelController.getLevel());
	}

	@Test
	void should_return_advanced_when_level_number_equals_1() {
		ReflectionTestUtils.setField(levelController, "levelNumber", 1);
		assertEquals("advanced", levelController.getLevel());
	}

	@Test
	void should_return_advanced_when_level_number_greater_than_1() {
		ReflectionTestUtils.setField(levelController, "levelNumber", 2);
		assertEquals("advanced", levelController.getLevel());
	}
}
