package ie.atu.openfeignrecapw3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class OpenFeignRecapW32Application {

    public static void main(String[] args) {
        SpringApplication.run(OpenFeignRecapW32Application.class, args);
    }

}
