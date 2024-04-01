package lesson10.hw;

public class Person {
    private String name;
    private int age;
    private int height;

    public Person(String name, int age, int height) {
        setName(name);
        setAge(age);
        setHeight(height);
    }

    public void printPersonInfo() {
        System.out.println("Имя: " + getName());
        System.out.println("Возраст: " + getAge());
        System.out.println("Рост: " + getHeight() + "см");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.length() < 3 && name.length() > 15) {
            System.out.println("Длина имени должна быть больше 3 и меньше 15");
        } else {
            this.name = name;
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 0 && age > 100) {
            System.out.println("Возраст должен быть больше 0 и меньше 100");
        } else {
            this.age = age;
        }
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        if (height < 120 && height > 220) {
            System.out.println("Рост должен быть не меньше 120 и не больше 220");
        } else {
            this.height = height;
        }
    }

}
