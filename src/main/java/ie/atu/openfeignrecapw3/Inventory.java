package ie.atu.openfeignrecapw3;

import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Inventory {
    private Long id;
    @NotBlank(message = "name cannot null")
    private String name;
    @Positive(message = "price must be positive")
    private double price;
}
