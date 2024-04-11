package lesson13.hw2;

public class Trumpet implements Instrument {
    private int diameterOfTrumpet;

    Trumpet(int diameterOfTrumpet) {
        this.diameterOfTrumpet = diameterOfTrumpet;
    }

    @Override
    public void play() {
        System.out.println("Играет труба, с такими характеристиками: " + diameterOfTrumpet + " см");
    }
}
