package flower.store;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FlowerPackTest {
    private Flower flower;
    private FlowerPack flowerPack;

    private final double val1 = 10;
    private final double val2 = 5;
    private final double delta = 0.001;
    


    @BeforeEach
    public void init() {
        // Create a flower object with specific attributes
        flower = new Flower();
        flower.setPrice(val1);  // Set price per flower
        flower.setSepalLength(val2);
        flower.setFlowerType(FlowerType.ROSE);
        flower.setColor(FlowerColor.RED);

        // Create a flower pack with 5 flowers
        flowerPack = new FlowerPack(flower, (int) val2);
    }

    @Test
    public void testGetPrice() {
        // Test if the price is calculated correctly
        double expectedPrice = val1 * val2;  // Price per flower * amount
        assertEquals(expectedPrice, flowerPack.getPrice(),
         delta, "Price calculation failed");
    }

    @Test
    public void testSetAmount() {
        // Change the amount of flowers in the pack
        flowerPack.setAmount((int) val1);

        // Test if the new price reflects the updated amount
        double expectedPrice = val1 * val1;  // Price per flower * new amount
        assertEquals(expectedPrice, flowerPack.getPrice(),
         delta,
          "Updated price calculation failed");
    }
}
