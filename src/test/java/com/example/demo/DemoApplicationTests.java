package com.example.demo;


import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.web.WebAppConfiguration;

import com.example.demo.mapper.TimeMapper;

import lombok.extern.java.Log;
import lombok.extern.slf4j.Slf4j;
@WebAppConfiguration
@Slf4j
@SpringBootTest
class DemoApplicationTests {
	@Autowired
	TimeMapper timemapper;
    @Test
	public void interface실행(){
		System.out.println("ABC" + timemapper.getTime());
	}
    @Test
	public void xml실행(){
		System.out.println("ABC" + timemapper.getTime2());
	}
}
