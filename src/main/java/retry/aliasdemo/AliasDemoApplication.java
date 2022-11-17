package retry.aliasdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.retry.annotation.EnableRetry;

@EnableRetry
@SpringBootApplication
public class AliasDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(AliasDemoApplication.class, args);
	}

}
