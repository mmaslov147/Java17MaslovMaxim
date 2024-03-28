package homework9.HW9;

public class Student {
    public String name;
    public int age;
    public float mediumMark;

    public Student(String studentName, int studentAge, float studentMediumMark) {
        this.name = studentName;
        this.age = studentAge;
        this.mediumMark = studentMediumMark;
    }

    public Student(int studentAge, String studentName, float studentMediumMark) {
        new Student(studentName, studentAge, studentMediumMark);
    }

    public Student(String studentName, float studentMediumMark) {
        new Student(studentName, studentMediumMark);
    }

    public void printStudentInfo() {
        System.out.println("Имя: " + name);
        System.out.println("Возраст: " + age);
        System.out.println("Средний бал: " + mediumMark);
    }

    public boolean checkMark() {
        return mediumMark > 5.0;
    }

    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", mediumMark=" + mediumMark +
                '}';
    }

}
