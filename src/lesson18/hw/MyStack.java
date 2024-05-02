package lesson18.hw;
/*Создать объект класса Stack типа String. Добавить в него 5 значений. Каждое значение вывести и удалить.*/

import java.util.Stack;

public class MyStack {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        stack.push("Mercedes-Benz");
        stack.push("BMW");
        stack.push("Renault");
        stack.push("Opel");
        stack.push("Chevrolet");
        System.out.println(stack);
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack);
    }
}
