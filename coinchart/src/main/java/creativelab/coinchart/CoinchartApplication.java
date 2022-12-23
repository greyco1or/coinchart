package creativelab.coinchart;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableScheduling
@SpringBootApplication
public class CoinchartApplication {

	public static void main(String[] args) {
		SpringApplication.run(CoinchartApplication.class, args);
	}

}
