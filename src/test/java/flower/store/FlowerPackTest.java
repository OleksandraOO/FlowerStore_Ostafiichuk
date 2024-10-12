package flower.store;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FlowerPackTest {
    private Flower flower;
    private FlowerPack flowerPack;

    private final double vall = 10;
    private final double valk = 5;
    private final double delta = 0.001;
    


    @BeforeEach
    public void init() {
        // Create a flower object with specific attributes
        flower = new Flower();
        flower.setPrice(vall);  // Set price per flower
        flower.setSepalLength(valk);
        flower.setFlowerType(FlowerType.ROSE);
        flower.setColor(FlowerColor.RED);

        // Create a flower pack with 5 flowers
        flowerPack = new FlowerPack(flower, (int) valk);
    }

    @Test
    public void testGetPrice() {
        // Test if the price is calculated correctly
        double expectedPrice = vall * valk;  // Price per flower * amount
        assertEquals(expectedPrice, flowerPack.getPrice(),
         delta, "Price calculation failed");
    }

    @Test
    public void testSetAmount() {
        // Change the amount of flowers in the pack
        flowerPack.setAmount((int) vall);

        // Test if the new price reflects the updated amount
        double expectedPrice = vall * vall;  // Price per flower * new amount
        assertEquals(expectedPrice, flowerPack.getPrice(),
         delta,
          "Updated price calculation failed");
    }
}
