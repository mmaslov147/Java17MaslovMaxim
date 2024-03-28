package homework9.HW9;

public class ManageStudent {
    public static void main(String[] args) {
        Student irina = new Student("Irina", 19, 6f);
        System.out.println(irina);

        boolean mark = irina.checkMark();
        System.out.println("Оценка: " + mark);

        irina.printStudentInfo();

        Transport transport = new Transport();
        transport.setValues("BMW", "Red", 1100.5f, 158);
        String result = transport.getValues();
        System.out.println(result);
    }
}
