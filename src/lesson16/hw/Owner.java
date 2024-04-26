package lesson16.hw;
/*Для поля owner создать класс Owner, который будет содержать поля: name, age, expirienceAge (опыт вождения).*/
public class Owner {
    String name;
    int age;
    int expirienceAge;

    public Owner (String name, int age, int expirienceAge){
        this.name = name;
        this.age = age;
        this.expirienceAge = expirienceAge;
    }

    @Override
    public String toString() {
        return
                "name='" + name + '\'' +
                ", age=" + age +
                ", expirienceAge=" + expirienceAge;
    }
}
