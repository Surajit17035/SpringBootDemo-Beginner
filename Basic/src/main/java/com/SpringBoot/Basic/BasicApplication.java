package com.SpringBoot.Basic;

import com.SpringBoot.Basic.Service.LaptopService;
import com.SpringBoot.Basic.model.Laptop;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class BasicApplication {

	public static void main(String[] args) {

		ApplicationContext context = SpringApplication.run(BasicApplication.class, args);

		LaptopService service = context.getBean(LaptopService.class);
		Laptop lap = context.getBean(Laptop.class);
		service.addLaptop(lap);


		//		Alien obj = context.getBean(Alien.class);
//		System.out.println(obj.getAge());
//		obj.feature();
	}

}
