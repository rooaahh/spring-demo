package com.example.demomicroservice1;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.demomicroservice1.service.AddNumbersService;

@RunWith(SpringRunner.class)
@ContextConfiguration(classes=ServiceLayerTestConfiguration.class)
public class AddNumbersServiceTests {

	@Autowired
	AddNumbersService addNumbersService;
	
	@Test
	public void addStringAsNumber_emptyString_shouldReturnZero() {
		assertThat(addNumbersService.addStringAsNumber("")).isEqualTo(0);
	}
	
	@Test
	public void addStringAsNumber_onlyOneNumber_shouldReturnTheNumber() {
		assertThat(addNumbersService.addStringAsNumber("9")).isEqualTo(9);
	}
	
	@Test 
	public void addStringAsNumber_whenTwoNumbers_shouldReturnTheirSum() {
		assertThat(addNumbersService.addStringAsNumber("9,1")).isEqualTo(10);
	}
}
