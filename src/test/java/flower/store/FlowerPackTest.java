package flower.store;

import flower.store.Flower;
import flower.store.FlowerColor;
import flower.store.FlowerPack;
import flower.store.FlowerType;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FlowerPackTest {
    private Flower flower;
    private FlowerPack flowerPack;

    @BeforeEach
    public void init() {
        // Create a flower object with specific attributes
        flower = new Flower();
        flower.setPrice(10.0);  // Set price per flower
        flower.setSepalLength(5.0);
        flower.setFlowerType(FlowerType.ROSE);
        flower.setColor(FlowerColor.RED);

        // Create a flower pack with 5 flowers
        flowerPack = new FlowerPack(flower, 5);
    }

    @Test
    public void testGetPrice() {
        // Test if the price is calculated correctly
        double expectedPrice = 10.0 * 5;  // Price per flower * amount
        assertEquals(expectedPrice, flowerPack.getPrice(), 0.001, "Price calculation failed");
    }

    @Test
    public void testSetAmount() {
        // Change the amount of flowers in the pack
        flowerPack.setAmount(10);

        // Test if the new price reflects the updated amount
        double expectedPrice = 10.0 * 10;  // Price per flower * new amount
        assertEquals(expectedPrice, flowerPack.getPrice(), 0.001, "Updated price calculation failed");
    }
}
