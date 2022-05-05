package hotelapp.foodiesgoregistrymsapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
@EnableEurekaServer
@SpringBootApplication
public class FoodiesgoRegistryMsApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(FoodiesgoRegistryMsApiApplication.class, args);
	}

}
