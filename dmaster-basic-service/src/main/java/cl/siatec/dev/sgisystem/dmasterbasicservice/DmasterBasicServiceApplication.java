package cl.siatec.dev.sgisystem.dmasterbasicservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

import javax.annotation.PostConstruct;
import java.util.TimeZone;

@SpringBootApplication
@EnableEurekaClient
public class DmasterBasicServiceApplication {

	@PostConstruct
	void started() { TimeZone.setDefault(TimeZone.getTimeZone("UTC")); }
	public static void main(String[] args) {
		SpringApplication.run(DmasterBasicServiceApplication.class, args);
	}

}
