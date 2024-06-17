package lesson26.hw;

public class Moon {
    private static volatile Moon instance;

    private Moon() {
    }

    public static Moon getInstance() {
        if (instance == null) {
            synchronized (Moon.class) {
                if (instance == null) {
                    instance = new Moon();
                }
            }
        }
        return instance;
    }

    public String whoIsFirstManOnMe() {
        return "Neil Armstrong";
    }

    public String checkTemperature() {
        return "My surface temperature ranges from +120 degrees Celsius on the day side to -100 degrees Celsius on the night side.";
    }
}
