package com.lankaris.spring.basics;

import com.lankaris.spring.basics.springin5steps.basic.BinarySearchImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class SpringIn5StepsApplicationBasic {

	public static void main(String[] args) {



		//BinarySearchImpl binarySearch = new BinarySearchImpl(new BubbleSortAlgorithm());

		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringIn5StepsApplicationBasic.class);
		BinarySearchImpl binarySearch = applicationContext.getBean(BinarySearchImpl.class);
		int result = binarySearch.binarySearch(new int[]{1,2,3}, 5);
		System.out.println(binarySearch);
	}


}
