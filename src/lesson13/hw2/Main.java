package lesson13.hw2;

public class Main {
    public static void main(String[] args) {
        Instrument[] instruments = new Instrument[3];
        instruments[0] = new Guitar(6);
        instruments[1] = new Drum(24);
        instruments[2] = new Trumpet(2);

        for (Instrument i : instruments) {
            i.play();
        }
    }
}
