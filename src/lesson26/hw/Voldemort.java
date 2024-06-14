package lesson26.hw;

public class Voldemort {
    private static final Voldemort INSTANCE = new Voldemort();
    private boolean alive = true;

    private Voldemort(){}

    public static Voldemort getInstance(){
        return INSTANCE;
    }

    public void avadaKedavra(){
        System.out.println("Avada Kedavra!");
        this.alive = false;
    }

    public String isAlive(){
        if (alive){
            return "Voldemort is alive";
        }else {
            return "Voldemort is dead";
        }
    }


}
