
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

 public static void tasck_14(String[] args) {
        // --- Инициализация переменных с примерами значений (тип double) ---
        double x = 4.0;
        double a = 2.0;
        double R = 3.0; // Для выражения д)
        double y = 1.0;
        double alpha = Math.PI / 4; // 45 градусов в радианах
        double beta = Math.PI / 6;  // 30 градусов в радианах
        double b = 8.0;

        System.out.println("--- Результаты вычислений выражений ---");

        // а) 2x
        double result_a = 2 * x;
        System.out.println("а) " + result_a);

        // б) sin x
        double result_b = Math.sin(x);
        System.out.println("б) " + result_b);

        // в) a²
        double result_v = Math.pow(a, 2);
        System.out.println("в) " + result_v);

        // г) √x
        double result_g = Math.sqrt(x);
        System.out.println("г) " + result_g);

        // д) |R|
        double result_d = Math.abs(R);
        System.out.println("д) " + result_d);

        // е) 5 cos y
        double result_e = 5 * Math.cos(y);
        System.out.println("е) " + result_e);

        // ж) -7,5a²
        double result_zh = -7.5 * Math.pow(a, 2);
        System.out.println("ж) " + result_zh);

        // з) 3√x
        double result_z = 3 * Math.sqrt(x);
        System.out.println("з) " + result_z);

        // и) sinα cosβ + cosα sinβ
        double result_i = Math.sin(alpha) * Math.cos(beta) + Math.cos(alpha) * Math.sin(beta);
        System.out.println("и) " + result_i);

        // к) a√2b
        double result_k = a * Math.sqrt(2 * b);
        System.out.println("к) " + result_k);

        // л) 3 sin 2α cos 3β
        double result_l = 3 * Math.sin(2 * alpha) * Math.cos(3 * beta);
        System.out.println("л) " + result_l);

        // м) -5√x + √y
        double result_m = -5 * Math.sqrt(x) + Math.sqrt(y);
        System.out.println("м) " + result_m);
    }

//1.15
    public static void tasck_15(String[] args) {
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



    

//1.16
 public static void tasck_16(String[] args) {
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

    
//1.17
public static void tasck_17(String[] args) {
        // --- Инициализация переменных ---
        // Используем double для точных вычислений с плавающей точкой
        double a = 5.0;
        double b = 3.0;
        double c = 2.0;
        double d = 1.0;
        double x = 4.0;
        double x1 = 1.0;
        double x2 = 2.0;
        double x3 = 3.0;
        double v0 = 10.0;
        double t = 2.0;
        double m = 1.0;
        double g = 9.81; // Ускорение свободного падения
        double h = 5.0;
        double R = 100.0;
        double R1 = 50.0;
        double R2 = 50.0;
        double T = 300.0; // Пример значения для температуры в последнем выражении

        System.out.println("--- Результаты вычислений выражений ---");

        // а) √x² + x²
        double result_a = Math.sqrt(Math.pow(x, 2) + Math.pow(x, 2));
        System.out.println("а) " + result_a);

        // б) x1x2 + x1x3 + x2x3
        double result_b = x1 * x2 + x1 * x3 + x2 * x3;
        System.out.println("б) " + result_b);

        // в) v0*t + at² / 2
        double result_v = v0 * t + (a * Math.pow(t, 2) / 2.0);
        System.out.println("в) " + result_v);

        // г) mv² / 2 + mgh
        double result_g = (m * Math.pow(v0, 2) / 2.0) + m * g * h;
        System.out.println("г) " + result_g);

        // д) 1/R1 + 1/R2
        double result_d = (1.0 / R1) + (1.0 / R2);
        System.out.println("д) " + result_d);

        // е) mg cos α (используем a как альфа)
        double result_e = m * g * Math.cos(a);
        System.out.println("е) " + result_e);

        // ж) 2πR
        double result_zh = 2 * Math.PI * R;
        System.out.println("ж) " + result_zh);

        // з) b² - 4ac
        double result_z = Math.pow(b, 2) - 4 * a * c;
        System.out.println("з) " + result_z);

        // и) γ m1 m2 / r² (используем a, b, R для примера)
        double result_i = g * a * b / Math.pow(R, 2);
        System.out.println("и) " + result_i);

        // к) I²R (используем a как I)
        double result_k = Math.pow(a, 2) * R;
        System.out.println("к) " + result_k);

        // л) absin c (используем a, b, c)
        double result_l = a * b * Math.sin(c);
        System.out.println("л) " + result_l);

        // м) √a² + b² - 2abcosc
        double result_m = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2) - 2 * a * b * Math.cos(c));
        System.out.println("м) " + result_m);

        // н) (ad + bc) / ad
        double result_n = (a * d + b * c) / (a * d);
        System.out.println("н) " + result_n);

        // о) √1 - sin²x
        double result_o = Math.sqrt(1 - Math.pow(Math.sin(x), 2));
        System.out.println("о) " + result_o);

        // п) 1 / √ax² + bx + c
        double result_p = 1.0 / Math.sqrt(a * Math.pow(x, 2) + b * x + c);
        System.out.println("п) " + result_p);

        // р) (√x+1 + √x-1) / 2√x
        double result_r = (Math.sqrt(x + 1) + Math.sqrt(x - 1)) / (2 * Math.sqrt(x));
        System.out.println("р) " + result_r);

        // с) |x| + |x+1|
        double result_s = Math.abs(x) + Math.abs(x + 1);
        System.out.println("с) " + result_s);

        // т) |1 - |x||
        double result_t = Math.abs(1 - Math.abs(x));
        System.out.println("т) " + result_t);
    }

    //1.18
 public static void tasck_18(String[] args) {
        // Объявление и инициализация переменной k,
        // значение которой не было указано в условии.
        // Принимаем k = 0, как обсуждалось ранее.
        double k = 0.0;

        System.out.println("--- Результаты выполнения операторов присваивания ---");

        // --- Пункт а) ---
        double s_a = 5;
        s_a = 57;
        System.out.println("а) Конечное значение s: " + s_a);

        // --- Пункт б) ---
        double s_b = 6;
        s_b = -5.2 * s_b;
        s_b = 0;
        System.out.println("б) Конечное значение s: " + s_b);

        // --- Пункт в) ---
        double s_v = -7.5;
        s_v = 2 * s_v;
        System.out.println("в) Конечное значение s: " + s_v);

        // --- Пункт г) ---
        double s_g = 45;
        s_g = -25;
        s_g = s_g + k;
        System.out.println("г) Конечное значение s: " + s_g);
    }

      //1.19
 public static void tasck_19(String[] args) {
        // --- а) ---
        // Начальное значение x = 10
        double x_a = 10;
        // Переприсваиваем x значение -10
        x_a = -10;
        System.out.println("а) Итоговое значение x: " + x_a); // Ответ: -10.0

        // --- б) ---
        // Начальное значение x = 17.5
        double x_b = 17.5;
        // x = -2 * x (-2 * 17.5 = -35.0)
        x_b = -2 * x_b;
        System.out.println("б) Итоговое значение x: " + x_b); // Ответ: -35.0

        // --- в) ---
        // Начальное значение x = 60
        double x_v = 60;
        // x = x - 1 (60 - 1 = 59)
        x_v = x_v - 1;
        // Переприсваиваем x значение 0
        x_v = 0;
        System.out.println("в) Итоговое значение x: " + x_v); // Ответ: 0.0

        // --- г) ---
        // Начальное значение x = -50
        double x_g = -50;
        // Объявляем и инициализируем переменную k (в условии не указано, какое у нее значение)
        double k = 5; 
        // Переприсваиваем x значение -25
        x_g = -25;
        // x = x + k (-25 + k)
        x_g = x_g + k;
        System.out.println("г) Итоговое значение x: " + x_g); // Ответ: -20.0 (при k=5)
    }

      //1.20
 public static void tasck_20(String[] args) {
        // --- Задание а) ---
        System.out.println("--- Задание а) ---");
        // s := 14
        double s_a = 14;
        System.out.println("s = " + s_a);
        // k := -3
        double k_a = -3;
        System.out.println("k = " + k_a);
        // d := s + 1
        double d_a = s_a + 1;
        System.out.println("d = " + d_a);
        // s := d
        s_a = d_a;
        System.out.println("s (обновлено) = " + s_a);
        // k := 2 · s
        k_a = 2 * s_a;
        System.out.println("k (обновлено) = " + k_a);
        
        System.out.println("Итоговое значение s: " + s_a); // Итоговый s = 15.0 
        System.out.println("Итоговое значение k: " + k_a); // Итоговый k = 30.0

        System.out.println(); // Пустая строка для разделения

        // --- Задание б) ---
        System.out.println("--- Задание б) ---");
        // s := 0
        double s_b = 0;
        System.out.println("s = " + s_b);
        // k := 30
        double k_b = 30;
        System.out.println("k = " + k_b);
        // d := k - 5
        double d_b = k_b - 5;
        System.out.println("d = " + d_b);
        // k := 2 · d
        k_b = 2 * d_b;
        System.out.println("k (обновлено) = " + k_b);
        // s := k - 100
        s_b = k_b - 100;
        System.out.println("s (обновлено) = " + s_b);
        
        System.out.println("Итоговое значение s: " + s_b); // Итоговый s = -50.0
        System.out.println("Итоговое значение k: " + k_b); // Итоговый k = 50.0
    }

    //1.21
public static void tasck_21(String[] args) {
        System.out.println("--- Результаты выполнения операторов присваивания (Задача 1.21) ---");

        // --- Пункт а) ---
        // Исходные операторы:
        // a := 5.8
        // b := -7.9
        // b := a
        // a := b
        double a_a = 5.8;
        double b_a = -7.9;
        b_a = a_a; // Теперь b_a равно 5.8
        a_a = b_a; // Теперь a_a равно 5.8
        System.out.println("а) Конечное значение a: " + a_a + ", b: " + b_a);

        // --- Пункт б) ---
        // Исходные операторы:
        // a := 0
        // b := -9.99
        // b := a
        // a := b
        double a_b = 0;
        double b_b = -9.99;
        b_b = a_b; // Теперь b_b равно 0
        a_b = b_b; // Теперь a_b равно 0
        System.out.println("б) Конечное значение a: " + a_b + ", b: " + b_b);
    }
 
    //Вычисления по известным формулам
    
    
    //1.22
    public static void tasck_22(String[] args) {
        // --- Инициализация переменных ---
    
        double x_value = 5.0;
        double a_value = 3.0;

        System.out.println("--- Вычисление функций для x = " + x_value + " и a = " + a_value + " ---");

        // --- Пункт а) Вычисление функции y = 7x² - 3x + 6 ---
        double y_result = 7 * Math.pow(x_value, 2) - 3 * x_value + 6;
        System.out.println("а) Значение y: " + y_result);

        // --- Пункт б) Вычисление функции x = 12a² + 7a - 16 ---
        double x_result = 12 * Math.pow(a_value, 2) + 7 * a_value - 16;
        System.out.println("б) Значение x: " + x_result);
    }

   //1.23
     public static void tasck_23(String[] args) {
        // --- Инициализация переменной ---
        double a = 5.0;

        System.out.println("--- Вычисление функции y для a = " + a + " ---");

        // --- Вычисление числителя ---
        double numerator = Math.pow(a, 2) + 10;
        
        // --- Вычисление знаменателя ---
        double denominator = Math.sqrt(Math.pow(a, 2) + 1);
        
        // --- Вычисление конечного значения y ---
        double y = numerator / denominator;

        System.out.println("Значение y: " + y);
    }

   //1.24
public static void tasck_24(String[] args) {
        // --- Инициализация переменных ---
        double a = 2.0;
        double x = 4.0;

        System.out.println("--- Вычисление функций для a = " + a + " и x = " + x + " ---");

        // --- а) Вычисление значения функции x = sqrt(abs(2a + sin(3a)) / 3.56) ---
        double x_numerator = Math.abs(2 * a + Math.sin(3 * a));
        double x_denominator = 3.56;
        double x_result = Math.sqrt(x_numerator / x_denominator);
        System.out.println("а) Значение первой функции (x): " + x_result);

        // --- б) Вычисление значения функции y = sin((3.2 + sqrt(1 + x)) / abs(5x)) ---
        double y_numerator = 3.2 + Math.sqrt(1 + x);
        double y_denominator = Math.abs(5 * x);
        double y_argument = y_numerator / y_denominator;
        double y_result = Math.sin(y_argument);
        System.out.println("б) Значение второй функции (y): " + y_result);
    }

   //1.25

   public static void tasck_25(String[] args) {
        // Создаем объект Scanner для чтения ввода с консоли
        Scanner scanner = new Scanner(System.in);

        // Запрашиваем длину стороны квадрата
        System.out.print("Введите длину стороны квадрата (например, 10.5): ");

        // Считываем введенное значение (используем double для дробных чисел)
        double sideLength = scanner.nextDouble();

        // Вычисляем периметр по формуле P = 4 * a
        double perimeter = 4 * sideLength;

        // Выводим результат
        System.out.println("Периметр квадрата равен: " + perimeter);
        
        // Закрываем Scanner
        scanner.close();
    }


    //1.26

    public static void tasck_26(String[] args) {
        // Создаем объект Scanner для чтения ввода с консоли
        Scanner scanner = new Scanner(System.in);

        // Запрашиваем длину радиуса окружности
        System.out.print("Введите длину радиуса окружности (например, 5.0): ");

        // Считываем введенное значение (используем double для дробных чисел)
        double radius = scanner.nextDouble();

        // Вычисляем диаметр по формуле D = 2 * R
        double diameter = 2 * radius;

        // Выводим результат
        System.out.println("Диаметр окружности равен: " + diameter);
        
        // Закрываем Scanner
        scanner.close();
    }

     //1.27
    public static void tasck_27(String[] args) {
        // Заданный радиус Земли в километрах
        final double EARTH_RADIUS_KM = 6350.0;
        
        // Создаем объект Scanner для чтения ввода с консоли
        Scanner scanner = new Scanner(System.in);

        // Запрашиваем у пользователя высоту над Землей
        System.out.print("Введите высоту над Землей в км (например, 0.1 для 100 м): ");

        // Считываем введенное значение высоты (используем double)
        double height_h = scanner.nextDouble();

        // Вычисляем расстояние до горизонта по формуле Пифагора: d = sqrt(h^2 + 2*R*h)
        // Используем Math.sqrt и Math.pow
        double distance_d = Math.sqrt(Math.pow(height_h, 2) + 2 * EARTH_RADIUS_KM * height_h);

        // Выводим результат, округленный для удобства восприятия
        System.out.println("Расстояние до линии горизонта: " + distance_d + " км");
        
        // Закрываем Scanner
        scanner.close();
    }

     //1.28

     public static void tasck_28(String[] args) {
        // Создаем объект Scanner для чтения ввода с консоли
        Scanner scanner = new Scanner(System.in);

        // Запрашиваем длину ребра куба
        System.out.print("Введите длину ребра куба (например, 5.0): ");

        // Считываем введенное значение (используем double для дробных чисел)
        double edgeLength = scanner.nextDouble();

        // Вычисляем объем куба: V = a³
        double volume = Math.pow(edgeLength, 3);

        // Вычисляем площадь боковой поверхности: S = 4 * a²
        double lateralSurfaceArea = 4 * Math.pow(edgeLength, 2);

        // Выводим результаты
        System.out.println("Объем куба (V) равен: " + volume);
        System.out.println("Площадь боковой поверхности (S) равна: " + lateralSurfaceArea);
        
        // Закрываем Scanner
        scanner.close();
    }

  //1.29

  public static void tasck_299(String[] args) {
        // Создаем объект Scanner для чтения ввода с консоли
        Scanner scanner = new Scanner(System.in);

        // Запрашиваем длину ребра куба
        System.out.print("Введите длину ребра куба (например, 5.0): ");

        // Считываем введенное значение (используем double для дробных чисел)
        double edgeLength = scanner.nextDouble();

        // Вычисляем объем куба: V = a³
        double volume = Math.pow(edgeLength, 3);

        // Вычисляем площадь боковой поверхности: S = 4 * a²
        double lateralSurfaceArea = 4 * Math.pow(edgeLength, 2);

        // Выводим результаты
        System.out.println("Объем куба (V) равен: " + volume);
        System.out.println("Площадь боковой поверхности (S) равна: " + lateralSurfaceArea);
        
        // Закрываем Scanner
        scanner.close();
    }

      //1.30

public static void tasck_30(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("--- Вычисление функций (Задача 1.30) ---");

        // --- Пункт а) Вычисление функции z = x³ - 2.5xy + 1.78x² - 2.5y + 1 ---
        System.out.print("Введите значение x для функции а): ");
        double x = scanner.nextDouble();
        System.out.print("Введите значение y для функции а): ");
        double y = scanner.nextDouble();

        double z_result = Math.pow(x, 3) - 2.5 * x * y + 1.78 * Math.pow(x, 2) - 2.5 * y + 1;
        System.out.println("а) Значение функции z: " + z_result);

        System.out.println("-------------------------------------------------");

        // --- Пункт б) Вычисление функции x = 3.56a + b³ - 5.8b² + 3.8 - 1.5 ---
        System.out.print("Введите значение a для функции б): ");
        double a = scanner.nextDouble();
        System.out.print("Введите значение b для функции б): ");
        double x1 = scanner.nextDouble();

        double result_x1 = 3.56 * a + Math.pow(x1, 3) - 5.8 * Math.pow(x1, 2) + 3.8 * a - 1.5;
        System.out.println("б) Значение функции x: " + result_x1);
        
        scanner.close();
    }

//1.31
    public static void tasck_31(String[] args) {
        // Создаем объект Scanner для чтения ввода с консоли
        Scanner scanner = new Scanner(System.in);

        // Запрашиваем два целых числа
        System.out.print("Введите первое целое число (a): ");
        int a = scanner.nextInt();
        System.out.print("Введите второе целое число (b): ");
        int b = scanner.nextInt();

        // --- а) Вычисление среднего арифметического ---
        // Используем тип double для результата деления, чтобы получить точный ответ
        double arithmeticMean = (double) (a + b) / 2;

        // --- б) Вычисление среднего геометрического ---
        // Используем Math.sqrt для корня и double для точности результата
        double geometricMean = Math.sqrt((double) a * b);

        // Выводим результаты
        System.out.println("--- Результаты вычислений ---");
        System.out.println("а) Среднее арифметическое: " + arithmeticMean);
        System.out.println("б) Среднее геометрическое: " + geometricMean);
        
        // Закрываем Scanner
        scanner.close();
    }

    //1.32
     public static void tasck_32(String[] args) {
        // Создаем объект Scanner для чтения ввода с консоли
        Scanner scanner = new Scanner(System.in);

        // Запрашиваем массу тела
        System.out.print("Введите массу тела в кг (например, 10.5): ");
        double mass_kg = scanner.nextDouble();

        // Запрашивае объем тела
        System.out.print("Введите объем тела в м³ (например, 2.0): ");
        double volume_m3 = scanner.nextDouble();

        // Вычисляем плотность по формуле ρ = m / V
        double density = mass_kg / volume_m3;

        // Выводим результат
        System.out.println("--- Результат вычисления ---");
        System.out.println("Плотность материала равна: " + density + " кг/м³");
        
        // Закрываем Scanner
        scanner.close();
    }

      //1.33

      public static void tasck_33(String[] args) {
        // Создаем объект Scanner для чтения ввода с консоли
        Scanner scanner = new Scanner(System.in);

        // Запрашиваем количество жителей
        System.out.print("Введите количество жителей (например, 1000000): ");
        // Используем long, так как количество жителей может быть большим целым числом
        long residents = scanner.nextLong();

        // Запрашиваем территории
        System.out.print("Введите площадь территории в км² (например, 5000.0): ");
        // Используем double для площади, так как она может быть дробной
        double area_sq_km = scanner.nextDouble();

        // Вычисляем плотность населения по формуле ρ = жители / площадь
        // Результат будет double, так как площадь double
        double density = (double) residents / area_sq_km;

        // Выводим результат
        System.out.println("--- Результат вычисления ---");
        System.out.println("Плотность населения: " + density + " чел./км²");
        
        // Закрываем Scanner
        scanner.close();
    }

    //1.34

     public static void tasck_34(String[] args) {
        // Создаем объект Scanner для чтения ввода с консоли
        Scanner scanner = new Scanner(System.in);

        System.out.println("--- Решение линейного уравнения ax + b = 0 ---");

        // Запрашиваем коэффициент 'a'
        System.out.print("Введите коэффициент a (a ≠ 0): ");
        double a = scanner.nextDouble();

        // Запрашиваем коэффициент 'b'
        System.out.print("Введите коэффициент b: ");
        double b = scanner.nextDouble();

        // Вычисляем x по формуле x = -b / a
        double x = -b / a;

        // Выводим результат
        System.out.println("--- Результат вычисления ---");
        System.out.println("Для уравнения " + a + "x + " + b + " = 0");
        System.out.println("Корень уравнения x = " + x);
        
        // Закрываем Scanner
        scanner.close();
    }

    //1.35

    public static void tasck_35(String[] args) {
        // Создаем объект Scanner для чтения ввода с консоли
        Scanner scanner = new Scanner(System.in);

        System.out.println("--- Вычисление гипотенузы прямоугольного треугольника ---");

        // Запрашиваем длину первого катета (a)
        System.out.print("Введите длину первого катета (a): ");
        double leg_a = scanner.nextDouble();

        // Запрашиваем длину второго катета (b)
        System.out.print("Введите длину второго катета (b): ");
        double leg_b = scanner.nextDouble();

        // Вычисляем длину гипотенузы по теореме Пифагора: c = sqrt(a² + b²)
        double hypotenuse_c = Math.sqrt(Math.pow(leg_a, 2) + Math.pow(leg_b, 2));

        // Выводим результат
        System.out.println("--- Результат вычисления ---");
        System.out.println("Длина гипотенузы (c) равна: " + hypotenuse_c);
        
        // Закрываем Scanner
        scanner.close();
    }

    //1.36
public static void tasck_36(String[] args) {
        // Создаем объект Scanner для чтения ввода с консоли
        Scanner scanner = new Scanner(System.in);

        System.out.println("--- Вычисление площади кольца ---");

        // Запрашиваем  внешний радиус (R)
        System.out.print("Введите внешний радиус (R): ");
        double outerRadius_R = scanner.nextDouble();

        // Запрашиваем внутренний радиус (r)
        System.out.print("Введите внутренний радиус (r): ");
        double innerRadius_r = scanner.nextDouble();

        // Проверяем условие, что внешний радиус должен быть больше внутреннего
        if (outerRadius_R <= innerRadius_r) {
            System.out.println("Ошибка: Внешний радиус должен быть больше внутреннего.");
            scanner.close();
            return; // Завершаем выполнение программы
        }

        // Вычисляем площадь кольца по формуле S = PI * (R² - r²)
        // Используем Math.PI для числа Пи
        double area = Math.PI * (Math.pow(outerRadius_R, 2) - Math.pow(innerRadius_r, 2));

        // Выводим результат
        System.out.println("--- Результат вычисления ---");
        System.out.println("Площадь кольца равна: " + area);
        
        // Закрываем Scanner
        scanner.close();
    }
    
    //1.37

    public static void tasck_37(String[] args) {
        // Создаем объект Scanner для чтения ввода с консоли
        Scanner scanner = new Scanner(System.in);

        System.out.println("--- Вычисление периметра прямоугольного треугольника ---");

        // Запрашиваем длину первого катета (a)
        System.out.print("Введите длину первого катета (a): ");
        double leg_a = scanner.nextDouble();

        // Запрашиваем длину второго катета (b)
        System.out.print("Введите длину второго катета (b): ");
        double leg_b = scanner.nextDouble();

        // --- Этап 1: Вычисление длины гипотенузы (c) по теореме Пифагора ---
        // c = sqrt(a² + b²)
        double hypotenuse_c = Math.sqrt(Math.pow(leg_a, 2) + Math.pow(leg_b, 2));

        // --- Этап 2: Вычисление периметра (P) ---
        // P = a + b + c
        double perimeter = leg_a + leg_b + hypotenuse_c;

        // Выводим результаты
        System.out.println("--- Результат вычисления ---");
        System.out.println("Длина гипотенузы (c) равна: " + hypotenuse_c);
        System.out.println("Периметр треугольника равен: " + perimeter);
        
        // Закрываем Scanner
        scanner.close();
    }

    

}