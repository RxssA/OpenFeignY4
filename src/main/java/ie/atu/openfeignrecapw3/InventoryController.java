package ie.atu.openfeignrecapw3;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


import java.util.List;
@RestController
public class InventoryController {
    private final AcknowledgeService acknowledgeService;
    private final RegistrationServiceClient registrationServiceClient;
    @Autowired
    public InventoryController(AcknowledgeService acknowledgeService, RegistrationServiceClient registrationServiceClient) {
        this.acknowledgeService = acknowledgeService;
        this.registrationServiceClient = registrationServiceClient;
    }

    @PostMapping("/confirm")
    public String confirm(@RequestBody UserDetails userDetails)
    {
        String confirm = registrationServiceClient.someDetails(userDetails);
        String response = confirm + " " + acknowledgeService.ackMessage(userDetails);
        return response;
    }
}
