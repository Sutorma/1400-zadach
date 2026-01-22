
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


//1.13
    public static void tasck_16(String[] args) {
        // --- Инициализация переменных для всех выражений ---
        // Для а), б), в), г), д), е), ж), з)
        double a = 10.0;
        double b = 5.0;
        double c = 2.0;
        double x = 3.0; // Для а)
        
        // Для к)
        double m = 2.0;
        double n = 3.0;

        System.out.println("--- Результаты вычислений ---");

        // а) (-1.0 / x^2)
        double result_a = (-1.0 / Math.pow(x, 2));
        System.out.println("а) " + result_a);

        // б) (a / (b * c))
        double result_b = (a / (b * c));
        System.out.println("б) " + result_b);

        // в) ((a / b) * c)
        double result_v = ((a / b) * c);
        System.out.println("в) " + result_v);

        // г) ((a + b) / 2.0)
        double result_g = ((a + b) / 2.0);
        System.out.println("г) " + result_g);

        // д) (5.45 * ((a + 2 * b) / (2 - a)))
        double result_d = (5.45 * ((a + 2 * b) / (2 - a)));
        System.out.println("д) " + result_d);

        // е) ((-b + sqrt(b^2 - 4ac)) / (2 * a))
        double result_e = ((-b + Math.sqrt(Math.pow(b, 2) - 4 * a * c)) / (2 * a));
        System.out.println("е) " + result_e);

        // ж) ((-b + (1.0 / a)) / (2.0 / c))
        double result_zh = ((-b + (1.0 / a)) / (2.0 / c));
        System.out.println("ж) " + result_zh);

        // з) (1.0 / (1 + ((a + b) / 2.0)))
        double result_z = (1.0 / (1 + ((a + b) / 2.0)));
        System.out.println("з) " + result_z);

        // и) Сложная дробь
        double result_i = (1.0 / (1 + (1.0 / (2 + (1.0 / (2 + (3.0 / 5.0)))))));
        System.out.println("и) " + result_i);

        // к) 2^(m^n)
        double result_k = Math.pow(2, Math.pow(m, n));
        System.out.println("к) " + result_k);
    }



//1.14
 public static void tasck_17(String[] args) {
        double a = 10.0;
        double b = 5.0;
        double c = 2.0;
        double R = 1.0;
        double x = 1.5; // Значение для тригонометрических функций

        System.out.println();

        // а) a / b / c; -> (a / b) / c
        double result_a = (a / b) / c;
        System.out.println("а) " + result_a);

        // б) a · b / c; -> (a * b) / c
        double result_b = (a * b) / c;
        System.out.println("б) " + result_b);

        // в) a / b · c; -> (a / b) * c
        double result_v = (a / b) * c;
        System.out.println("в) " + result_v);

        // г) a + b / c; -> a + (b / c)
        // Примечание: порядок операций в Java сам выполнит деление первым, но скобки для наглядности
        double result_g = a + (b / c);
        System.out.println("г) " + result_g);
        
        // д) a + b / c; (Аналогично г)
        double result_d = a + (b / c);
        System.out.println("д) " + result_d);

        // е) a + b / b + c; -> a + (b / b) + c
        double result_e = a + (b / b) + c;
        System.out.println("е) " + result_e);

        // ж) a + b / b + c; (Аналогично е)
        double result_zh = a + (b / b) + c;
        System.out.println("ж) " + result_zh);

        // з) a / sin b; -> a / Math.sin(b)
        // Аргументы тригонометрических функций в Java должны быть в радианах
        double result_z = a / Math.sin(b);
        System.out.println("з) " + result_z);

        // и) 1 / 2 - a - b - sin x; -> 1.0 / 2 - a - b - Math.sin(x)
        double result_i = 1.0 / 2 - a - b - Math.sin(x);
        System.out.println("и) " + result_i);

        // к) 2 · b · c · cos a / 2 / b + c; -> (2 * b * c * Math.cos(a / 2.0)) / b + c
        double result_k = (2 * b * c * Math.cos(a / 2.0)) / b + c;
        System.out.println("к) " + result_k);

        // л) 4 · R · sin a / 2 · sin b / 2 · sin c / 2; -> 4 * R * Math.sin(a / 2.0) * Math.sin(b / 2.0) * Math.sin(c / 2.0)
        double result_l = 4 * R * Math.sin(a / 2.0) * Math.sin(b / 2.0) * Math.sin(c / 2.0);
        System.out.println("л) " + result_l);

        // м) a · x + b / c · x + d; -> a * x + (b / (c * x)) + d (если d объявить)
        // Предполагаем, что d - это переменная, объявим её
        double d = 3.0;
        double result_m = a * x + (b / (c * x)) + d;
        System.out.println("м) " + result_m);

        // н) 2 · sin a + b / 2 · cos a - b / 2; -> 2 * Math.sin((a + b) / 2.0) * Math.cos((a - b) / 2.0)
        double result_n = 2 * Math.sin((a + b) / 2.0) * Math.cos((a - b) / 2.0);
        System.out.println("н) " + result_n);

        // о) abs 2 - sin 3 - abs x / 2; -> Math.abs(2 - Math.sin(3 - Math.abs(x / 2.0))) (Интерпретация выражения из учебника)
        double result_o = Math.abs(2 - Math.sin(3 - Math.abs(x / 2.0)));
        System.out.println("о) " + result_o);

        
        // Вывод результатов
        System.out.println("Результат 1 (дробь): " + result_a);
        System.out.println("Результат 2 (корень): " + result_b);
        System.out.println("Результат 3 (модуль/синус): " + result_v);
        System.out.println("Результат 4 (экспонента): " + result_g);
        System.out.println("Результат 2 (корень): " + result_d);
        System.out.println("Результат 3 (модуль/синус): " + result_e);
        System.out.println("Результат 4 (экспонента): " + result_zh);
         System.out.println("Результат 1 (дробь): " + result_g);
        System.out.println("Результат 2 (корень): " + result_z);
        System.out.println("Результат 3 (модуль/синус): " + result_i);
        System.out.println("Результат 4 (экспонента): " + result_k);
    }

    

}