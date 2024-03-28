package homework9.HW9;

public class Transport {
    public String carBrand;
    public String colour;
    public float weight;
    public int speed;

    public void setValues(String carBrand, String colour, float weight, int speed){
        this.carBrand = carBrand;
        this.colour = colour;
        this.weight = weight;
        this.speed = speed;
    }
    public String getValues(){
        String info = "Car brand: " + carBrand + "\n Colour: " + colour + "\n Weight: " + weight + " kg" + "\n Speed: " + speed + " km/h";
        return info;
    }

}
