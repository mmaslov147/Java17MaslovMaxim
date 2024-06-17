package lesson26.hw;

public class Main {
    public static void main(String[] args) {
        Moon moon = Moon.getInstance();
        System.out.println(moon.whoIsFirstManOnMe());
        System.out.println(moon.checkTemperature());

        Voldemort voldemort = Voldemort.getInstance();
        System.out.println(voldemort.isAlive());
        voldemort.avadaKedavra();
        System.out.println(voldemort.isAlive());
    }
}
