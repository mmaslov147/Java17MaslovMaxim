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
            System.err.println();
        } else {
            this.name = name;
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 0 && age > 100) {
            System.err.println();
        } else {
            this.age = age;
        }
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        if (height < 120 && height > 220) {
            System.err.println();
        } else {
            this.height = height;
        }
    }

}
