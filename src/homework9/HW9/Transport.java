package homework9.HW9;
/*В данном коде представлен класс Transport, который представляет собой модель транспортного средства. Он содержит следующие поля:

carBrand - марка автомобиля (тип String).
colour - цвет автомобиля (тип String).
weight - вес автомобиля в килограммах (тип float).
speed - скорость автомобиля в километрах в час (тип int).
Класс также содержит следующие методы:

Метод setValues(String carBrand, String colour, float weight, int speed), который устанавливает значения для марки автомобиля, цвета, веса и скорости на основе переданных аргументов.
Метод getValues(), который возвращает строку, содержащую информацию о транспортном средстве, включая марку, цвет, вес и скорость.*/
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
