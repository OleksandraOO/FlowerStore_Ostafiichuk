package flower.store;

import lombok.Setter;

@Setter
public class FlowerPack {
    private Flower flower;
    private int amount;

    public FlowerPack(Flower flower, int amount) {
        this.flower = new Flower(flower);
        this.amount = amount;
    }

    public double getPrice() {
        return flower.getPrice() * amount;
    }
}