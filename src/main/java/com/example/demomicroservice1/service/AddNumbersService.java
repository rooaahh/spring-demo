package com.example.demomicroservice1.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class AddNumbersService {

	public Integer addStringAsNumber(String numbersText) {
		if(numbersText.isEmpty())return 0;
		else {
			List<String> numbers = Arrays.asList(numbersText.split(","));
			
			if(numbers.size()==1)return Integer.valueOf(numbers.get(0));
			else {
				Integer sum=0;
				for(String number:numbers)
					sum+=Integer.valueOf(number);
				return sum;
			}
		}
	}
}
