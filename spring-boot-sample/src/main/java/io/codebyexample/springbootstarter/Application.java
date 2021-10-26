package io.codebyexample.springbootstarter;

import io.codebyexample.springbootstarter.services.SampleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;

/**
 * @author huypva
 * */
@SpringBootApplication
public class Application {

	@Autowired
	SampleService sampleService;

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);

	}

	@EventListener(ApplicationReadyEvent.class)
	public void ready() {
		sampleService.doSample();
	}

}
