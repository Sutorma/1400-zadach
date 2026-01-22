
import java.util.Scanner;

public class Programm {

    public static void main(String[] args) {
        System.out.println("--- Запуск всех решений Главы 1 ---");
        
        // Ввод данных для задач с вводом с клавиатуры будет запрошен последовательно
        // Если вы хотите запускать только конкретные задачи, закомментируйте ненужные вызовы ниже
        
        task1_1();
        task1_2();
        task1_3();
        task1_4();
        task1_5();
        task1_6();
        task1_7();
        task1_8();
        task1_9();
        task1_10();
        task1_11();
        task1_12();
        task1_13();
        task1_14();
    }

    // Задача 1.1: Вывести число e с точностью до сотых
    public static void task1_1() {
        System.out.println("\n--- Задача 1.1 ---");
        double number = Math.E; 
        System.out.printf("e с точностью до сотых: %.2f%n", number); 
    }

    // Задача 1.2: Вывести число e с точностью до десятых
    public static void task1_2() {
        System.out.println("\n--- Задача 1.2 ---");
        double e = Math.E; 
        System.out.printf("e с точностью до десятых: %.1f%n", e);
    }

    // Задача 1.3: Вывести введенное число с сообщением "Вы ввели число:"
    public static void task1_3() {
        System.out.println("\n--- Задача 1.3 (Требуется ввод) ---");
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите число для 1.3: ");
        int inputNumber = sc.nextInt();
        System.out.println("Вы ввели число: " + inputNumber);
        // Примечание: Сканер не закрываем здесь, чтобы использовать его в следующих задачах
    }

    // Задача 1.4: Вывести введенное число с сообщением " — вот какое число."
    public static void task1_4() {
        System.out.println("\n--- Задача 1.4 (Требуется ввод) ---");
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите число для 1.4: ");
        int number = sc.nextInt();
        System.out.println(number + " — вот какое число.");
    }

    // Задача 1.5: Вывести на одной строке числа 1, 13 и 49 с одним пробелом
    public static void task1_5() {
        System.out.println("\n--- Задача 1.5 ---");
        System.out.println("1 13 49");
    }

    // Задача 1.6: Вывести на одной строке числа 7, 15 и 100 с двумя пробелами
    public static void task1_6() {
        System.out.println("\n--- Задача 1.6 ---");
        System.out.println("7  15  100");
    }

    // Задача 1.7: Вывести в одну строку три любых числа с двумя пробелами (ввод с клавиатуры)
    public static void task1_7() {
        System.out.println("\n--- Задача 1.7 (Требуется ввод 3-х чисел) ---");
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n3 = sc.nextInt();
        System.out.println(n1 + "  " + n2 + "  " + n3);
    }

    // Задача 1.8: Вывести в одну строку четыре любых числа с одним пробелом
    public static void task1_8() {
        System.out.println("\n--- Задача 1.8 (Требуется ввод 4-х чисел) ---");
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n3 = sc.nextInt();
        int n4 = sc.nextInt();
        System.out.println(n1 + " " + n2 + " " + n3 + " " + n4);
    }

    // Задача 1.9: Вывести числа 50 и 10 одно под другим
    public static void task1_9() {
        System.out.println("\n--- Задача 1.9 ---");
        System.out.println(50);
        System.out.println(10);
    }

    // Задача 1.10: Вывести числа 5, 10 и 21 одно под другим
    public static void task1_10() {
        System.out.println("\n--- Задача 1.10 ---");
        System.out.println(5);
        System.out.println(10);
        System.out.println(21);
    }

    // Задача 1.11: Вывести "столбиком" четыре любых числа
    public static void task1_11() {
        System.out.println("\n--- Задача 1.11 (Требуется ввод 4-х чисел) ---");
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n3 = sc.nextInt();
        int n4 = sc.nextInt();
        System.out.println(n1);
        System.out.println(n2);
        System.out.println(n3);
        System.out.println(n4);
    }

    // Задача 1.12: Вывести фиксированную информацию
    public static void task1_12() {
        System.out.println("\n--- Задача 1.12 ---");
        System.out.println("5 10");
        System.out.println("7 см");
    }

    // Задача 1.13: Вывести фиксированную информацию
    public static void task1_13() {
        System.out.println("\n--- Задача 1.13 ---");
        System.out.println("2 кг");
        System.out.println("13 17");
    }
    
    // Задача 1.14: Вывести переменные x, y в формате 'x = ...'
    public static void task1_14() {
        System.out.println("\n--- Задача 1.14 (Требуется ввод 2-х чисел) ---");
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите x: ");
        int x = sc.nextInt();
        System.out.print("Введите y: ");
        int y = sc.nextInt();
        System.out.println("x = " + x);
        System.out.println("y = " + y);
        // Закрываем Scanner только в конце последней задачи, чтобы избежать ошибок
        sc.close();
    }
}