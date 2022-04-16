package ru.geekbrains.lesson1;

public class Main {

    public static void main(String[] args) {
        // вызов метода напечатает результат в консоль
        printSomething();
        // если метод что-то возвращает, его вызов лучше закинуть в
        // System.out.println(), чтобы увидеть результат работы в консоли
        System.out.println(mulBy2(10));
        // ...
    }

    // метод ничего не возвращает
    public static void printSomething() {
        System.out.println("Java");  // печатается результат работы метода
    }

    // метод обязан вернуть целое число
    public static int mulBy2(int value) {
        // метод возвращает результат без печати
        return value * 2;
    }

    public static void doSeven(int year) {

    // ...
}

