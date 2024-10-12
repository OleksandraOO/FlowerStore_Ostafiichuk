package flower.store;

import lombok.Getter;
import lombok.Setter;

@Setter
public class Flower {
    @Getter
    private double sepalLength;
    private FlowerColor color;
    @Getter
    private double price;
    @Getter
    private FlowerType flowerType;

    // No-argument constructor
    public Flower() {
        // You can initialize default values if needed
        this.flowerType = FlowerType.DEFAULT_TYPE;
        this.price = 0.0;
        this.sepalLength = 0.0;
        this.color = FlowerColor.DEFAULT_COLOR;
    }

    // Copy constructor
    public Flower(Flower flower) {
        this.flowerType = flower.flowerType;
        this.price = flower.price;
        this.sepalLength = flower.sepalLength;
        this.color = flower.color;
    }

    public String getColor() {
        return color.toString();
    }
}
