package ie.atu.openfeignrecapw3;

import org.springframework.cloud.openfeign.FeignClient;

import java.util.ArrayList;
import java.util.List;

@FeignClient(value = "Micro1", url = "http://localhost:8080")
public interface ProductService {
    List<Inventory> InventoryList = new ArrayList<Inventory>();
    public static List<Inventory> getAllInventory() {
        return InventoryList;
    }
    public static Inventory addInventory(Inventory inventory) {
        InventoryList.add(inventory);
        return inventory;
    }
}