package ie.atu.openfeignrecapw3;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(name = "confirmationService", url = "http://localhost:808 ")
public interface RegistrationServiceClient {
    @PostMapping("/confirm")
    String someDetails(@RequestBody UserDetails userDetails);
}
