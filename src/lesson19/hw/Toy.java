package lesson19.hw;
/*класс Toy(weight int, String color, double  price )*/
public class Toy {
    private int weight;
    private String color;
    private double price;

    public Toy(int weight, String color, double price) {
        this.weight = weight;
        this.color = color;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Toy{" +
                "weight=" + weight +
                ", color='" + color + '\'' +
                ", price=" + price +
                '}';
    }
}