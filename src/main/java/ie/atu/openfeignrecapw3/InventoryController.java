package ie.atu.openfeignrecapw3;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


import java.util.List;
@RestController
public class InventoryController {
    private ProductService productService;
    @Autowired
    public InventoryController(ProductService productService) {
        this.productService = productService;
    }
    @GetMapping("/inventory")
    public List<Inventory> getInventoryList()
    {
        return ProductService.getAllInventory();
    }
}
