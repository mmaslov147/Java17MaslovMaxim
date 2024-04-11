package lesson13.hw2;

public class Guitar implements Instrument {
    private int quantityOfStrings;

    Guitar(int quantityOfStrings) {
        this.quantityOfStrings = quantityOfStrings;
    }

    @Override
    public void play() {
        System.out.println("Играет гитара, с такими характеристиками: " + quantityOfStrings + " струн");
    }
}
