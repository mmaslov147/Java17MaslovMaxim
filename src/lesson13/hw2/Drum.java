package lesson13.hw2;

public class Drum implements Instrument {
    private int sizeOfDrum;

    Drum(int sizeOfDrum) {
        this.sizeOfDrum = sizeOfDrum;
    }

    @Override
    public void play() {
        System.out.println("Играет барабан, с такими характеристиками: " + sizeOfDrum + " дюйма");
    }
}
