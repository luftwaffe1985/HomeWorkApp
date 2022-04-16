package Lesson001;
// 1. Создайте пустой проект, класс HomeWorkApp, и создайте в нем метод main.
// 2. Создайте метод printThreeWords(), который при вызове должен отпечатать три слова: Orange, Banana, Apple.
// 3. Создайте метод checkSumSign(), в теле которого объявите две int переменные a и b, и иниализиируйте их любыми значениями,
// которыми заходите далее метод должен просуммировать эти переменные,
// если их сумма больше или равна 0, вывести в консоль сообщение "Сумма положительная",
// в противном случае - "Сумма отрицательная".
// 4. Создайте метод printColor(), в теле которого задайте int переменную value и инициализируйте ее любым значением.
// если value меньше 0 (0 включительно), то в консоль метод должен вывести "Красный",
// если лежит в пределах от 0 (0 включительно) до 100 (100 включительно), то "Желтый",
// если больше 100 (100 исключительно) - "Зеленый".
// Создайте метод compareNumbers(), в теле которого объявите две int переменные a и b,
// и инициализируйте их любыми значениями. Если a больше или равно b, то необходимо вывести в консоль сообщение
// "a >= b", в противном случае "a <= b".
// Методы из пунктов 2-5 выззовите из метода main() и посмотрите корректно ли они работают.


public class HomeWorkApp {

    public static void main(String[] args) {
        printThreeWords();
        checkSumSign(-10, 6);
        printColor(0);
        compareNumbers(0, 0);

    }

    public static void printThreeWords() {
        System.out.println("Orange, Banana, Apple");
    }

    public static void checkSumSign(int a, int b) {
        System.out.println(a + b);
        if ((a + b) >= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
    }

    public static void printColor(int value) {
        if (value < 0) {
            System.out.println("Красный");
        } else if (value >= 0 && value <= 100) {
            System.out.println("Жёлтый");
        } else if (value > 100) {
            System.out.println("Зелёный");
        }

    }

    public static void compareNumbers(int a, int b) {
        if (a >= b) {
            System.out.println("a >= b");
        } else {
            System.out.println("a <= b");

        }
    }
}






















