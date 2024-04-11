package lesson13.hw1;

public class Main {
    public static void main(String[] args) {
        Printable[] printable = new Printable[2];
        printable[0] = new Book("Head FirstJava");
        printable[1] = new Magazine("Codemotion");

        for (Printable p : printable) {
            p.print();
        }
        Magazine.printMagazines(printable);
        Book.printBooks(printable);
    }
}
