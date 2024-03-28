package homework9.HW9;
/*В данном коде представлен класс Student, который является моделью студента. Он содержит следующие поля:
name - имя студента (тип String).
age - возраст студента (тип int).
mediumMark - средний балл студента (тип float).
Так же содержит методы:
Метод printStudentInfo(), который печатает всю информацию о студенте.
Метод checkMark(), проверяет больше ли у студента оценка чем 5.
Метод toString(), который возвращает строковое представление объекта студента в формате: "Student{name='имя', age=возраст, mediumMark=средний_балл}".
А так же реализованны 3 вида конструкторов*/

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
        this(studentName, studentAge, studentMediumMark);
    }

    public Student(String studentName, float studentMediumMark, int studentAge) {
        this(studentName, studentAge, studentMediumMark);
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
