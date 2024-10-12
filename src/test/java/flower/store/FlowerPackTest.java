package flower.store;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FlowerPackTest {
    private Flower flower;
    private FlowerPack flowerPack;

    private final double VAL = 10;
    private final double VAL1 = 5;
    private final double DELTA = 0.001;
    


    @BeforeEach
    public void init() {
        // Create a flower object with specific attributes
        flower = new Flower();
        flower.setPrice(VAL);  // Set price per flower
        flower.setSepalLength(VAL1);
        flower.setFlowerType(FlowerType.ROSE);
        flower.setColor(FlowerColor.RED);

        // Create a flower pack with 5 flowers
        flowerPack = new FlowerPack(flower, (int)VAL1);
    }

    @Test
    public void testGetPrice() {
        // Test if the price is calculated correctly
        double expectedPrice = VAL * VAL1;  // Price per flower * amount
        assertEquals(expectedPrice, flowerPack.getPrice(),
         DELTA, "Price calculation failed");
    }

    @Test
    public void testSetAmount() {
        // Change the amount of flowers in the pack
        flowerPack.setAmount((int)VAL);

        // Test if the new price reflects the updated amount
        double expectedPrice = VAL * VAL;  // Price per flower * new amount
        assertEquals(expectedPrice, flowerPack.getPrice(),
         DELTA,
          "Updated price calculation failed");
    }
}
