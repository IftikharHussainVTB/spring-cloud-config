package config.cloud.local;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class CloudConfigLocalApplication {

	public static void main(String[] args) {
		SpringApplication.run(CloudConfigLocalApplication.class, args);
	}

}

