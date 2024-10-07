import java.util.Scanner;
import java.util.Arrays;

public class Main {

    // Задание 1: Дробная часть
    public static double fraction(double x) {
        return Math.round((x - (int) x) * 100000.0) / 100000.0;
    }

    // Задание 2: Преобразование символа в число
    public static int charToNum(char x) {
        if (x >= '0' && x <= '9') {
            return x - '0';
        } else {
            throw new IllegalArgumentException("Ошибка: символ должен быть цифрой от '0' до '9'.");
        }
    }

    // Задание 3: Проверка на двузначность
    public static boolean is2Digits(int x) {
        return x >= 10 && x <= 99;
    }

    // Задание 4: Проверка диапазона
    public static boolean isInRange(int a, int b, int num) {
        int min = Math.min(a, b);
        int max = Math.max(a, b);
        return num >= min && num <= max;
    }

    // Задание 5: Проверка равенства трех чисел
    public static boolean isEqual(int a, int b, int c) {
        return a == b && b == c;
    }

    // Задание 6: Модуль числа
    public static int abs(int x) {
        return (x < 0) ? -x : x;
    }

    // Задание 7: Проверка делимости на 3 или 5
    public static boolean is35(int x) {
        return (x % 3 == 0 || x % 5 == 0) && !(x % 3 == 0 && x % 5 == 0);
    }

    // Задание 8: Максимум из трех чисел
    public static int max3(int x, int y, int z) {
        return x >= y && x >= z ? x : (y >= x && y >= z ? y : z);
    }

    // Задание 9: Сумма двух чисел с проверкой диапазона
    public static int sum2(int x, int y) {
        int sum = x + y;
        return (sum >= 10 && sum <= 19) ? 20 : sum;
    }

    // Задание 10: День недели по номеру
    public static String day(int x) {
        switch (x) {
            case 1: return "понедельник";
            case 2: return "вторник";
            case 3: return "среда";
            case 4: return "четверг";
            case 5: return "пятница";
            case 6: return "суббота";
            case 7: return "воскресенье";
            default: return "это не день недели";
        }
    }
    // Задание 11: Числа подряд
    public static String listNums(int x) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i <= x; i++) {
            result.append(i).append(" ");
        }
        return result.toString().trim();
    }

    // Задание 12: Четные числа
    public static String chet(int x) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i <= x; i += 2) {
            result.append(i).append(" ");
        }
        return result.toString().trim();
    }

    // Задание 13: Длина числа
    public static int numLen(long x) {
        int length = 0;
        while (x != 0) {
            x /= 10;
            length++;
        }
        return length;
    }

    // Задание 14: Квадрат из символов '*'
    public static void square(int x) {
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < x; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    // Задание 15: Правый треугольник
    public static void rightTriangle(int x) {
        for (int i = 1; i <= x; i++) {
            System.out.println(" ".repeat(x - i) + "*".repeat(i));
        }
    }
    
    // Задача 16: Поиск первого значения
    public static int findFirst(int[] arr, int x) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                return i;
            }
        }
        return -1;
    }
        
    // Задача 17: Поиск максимального по модулю значения
    public static int maxAbs(int[] arr) {
        int max = arr[0];
        for (int num : arr) {
            if (Math.abs(num) > Math.abs(max)) {
                max = num;
            }
        }
        return max;
    }
        
    // Задача 18: Добавление массива в массив
    public static int[] add(int[] arr, int[] ins, int pos) {
        int[] result = new int[arr.length + ins.length];
        System.arraycopy(arr, 0, result, 0, pos);
        System.arraycopy(ins, 0, result, pos, ins.length);
        System.arraycopy(arr, pos, result, pos + ins.length, arr.length - pos);
        return result;
    }
        
    // Задача 19: Возвратный реверс
    public static int[] reverseBack(int[] arr) {
        int[] reversed = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            reversed[i] = arr[arr.length - 1 - i];
        }
        return reversed;
    }
        
    // Задача 20: Все вхождения
    public static int[] findAll(int[] arr, int x) {
    int count = 0;
    for (int value : arr) {
        if (value == x) {
            count++;
        }
    }
        
    int[] indices = new int[count];
    int index = 0;
    for (int i = 0; i < arr.length; i++) {
        if (arr[i] == x) {
            indices[index++] = i;
        }
    }
        
    return indices;
    }        
    

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // Задача 1: Дробная часть числа
            System.out.print("Введите вещественное число для вычисления его дробной части: ");
            double number = scanner.nextDouble();
            System.out.println("Дробная часть числа " + number + " = " + fraction(number));

            // Задача 2: Преобразование символа в число
            System.out.print("Введите символ цифры (0-9): ");
            String input = scanner.next();
            if (input.length() != 1 || !Character.isDigit(input.charAt(0))) {
                throw new IllegalArgumentException("Ошибка: введите именно одну цифру от '0' до '9'.");
            }
            char digitChar = input.charAt(0);
            System.out.println("Число, соответствующее символу '" + digitChar + "' = " + charToNum(digitChar));

            // Задача 3: Проверка на двузначность
            System.out.print("Введите число для проверки на двузначность: ");
            int twoDigitNumber = scanner.nextInt();
            System.out.println("Является ли число " + twoDigitNumber + " двузначным? " + is2Digits(twoDigitNumber));

            // Задача 4: Проверка диапазона
            System.out.print("Введите левую границу диапазона: ");
            int rangeStart = scanner.nextInt();
            System.out.print("Введите правую границу диапазона: ");
            int rangeEnd = scanner.nextInt();
            System.out.print("Введите число для проверки в диапазоне: ");
            int numToCheck = scanner.nextInt();
            System.out.println("Число " + numToCheck + " в диапазоне [" + rangeStart + ", " + rangeEnd + "]? " + isInRange(rangeStart, rangeEnd, numToCheck));

            // Задача 5: Проверка равенства трех чисел
            System.out.print("Введите первое число для проверки равенства: ");
            int a = scanner.nextInt();
            System.out.print("Введите второе число для проверки равенства: ");
            int b = scanner.nextInt();
            System.out.print("Введите третье число для проверки равенства: ");
            int c = scanner.nextInt();
            System.out.println("Все три числа равны? " + isEqual(a, b, c));

            // Задача 6: Модуль числа
            System.out.print("Введите число для вычисления его модуля: ");
            int value = scanner.nextInt();
            System.out.println("Модуль числа " + value + " = " + abs(value));

            // Задача 7: Проверка делимости на 3 или 5
            System.out.print("Введите число для проверки делимости на 3 или 5: ");
            int divisibleNum = scanner.nextInt();
            System.out.println("Число делится на 3 или 5, но не на оба? " + is35(divisibleNum));

            // Задача 8: Максимум из трех чисел
            System.out.print("Введите три числа для поиска максимума: ");
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            int z = scanner.nextInt();
            System.out.println("Максимальное из трех чисел: " + max3(x, y, z));

            // Задача 9: Сумма двух чисел с проверкой диапазона
            System.out.print("Введите два числа для суммирования: ");
            int sumX = scanner.nextInt();
            int sumY = scanner.nextInt();
            System.out.println("Сумма чисел: " + sum2(sumX, sumY));

            // Задача 10: День недели по номеру
            System.out.print("Введите номер дня недели (1-7): ");
            int dayNumber = scanner.nextInt();
            System.out.println("День недели: " + day(dayNumber));
            
            // Задача 11: Числа подряд
            System.out.print("Введите число для последовательности (задача 11): ");
            int num11 = scanner.nextInt();
            System.out.println("Числа подряд: " + listNums(num11));

            // Задача 12: Четные числа
            System.out.print("Введите число для четных чисел (задача 12): ");
            int num12 = scanner.nextInt();
            System.out.println("Четные числа: " + chet(num12));
    
            // Задача 13: Длина числа
            System.out.print("Введите длинное число для подсчета длины (задача 13): ");
            long num13 = scanner.nextLong();
            System.out.println("Длина числа: " + numLen(num13));
            
            // Задача 14: Квадрат
            System.out.print("Введите размер квадрата (задача 14): ");
            int size14 = scanner.nextInt();
            square(size14);
    
            // Задача 15: Правый треугольник
            System.out.print("Введите размер правого треугольника (задача 15): ");
            int size15 = scanner.nextInt();
            rightTriangle(size15);
            
             // Задача 16: Поиск первого значения
            System.out.print("Введите длину массива для задачи 16: ");
            int len16 = scanner.nextInt();
            int[] array16 = new int[len16];
            System.out.println("Введите элементы массива:");
            for (int i = 0; i < len16; i++) {
                array16[i] = scanner.nextInt();
            }
            System.out.print("Введите число для поиска его первого вхождения: ");
            int findVal = scanner.nextInt();
            System.out.println("Первое вхождение числа " + findVal + " = " + findFirst(array16, findVal));

            // Задача 17: Поиск максимального по модулю значения
            System.out.print("Введите длину массива для задачи 17: ");
            int len17 = scanner.nextInt();
            int[] array17 = new int[len17];
            System.out.println("Введите элементы массива:");
            for (int i = 0; i < len17; i++) {
                array17[i] = scanner.nextInt();
            }
            System.out.println("Максимальное по модулю значение: " + maxAbs(array17));

            // Задача 18: Добавление массива в массив
            System.out.print("Введите длину основного массива: ");
            int len18 = scanner.nextInt();
            int[] array18 = new int[len18];
            System.out.println("Введите элементы основного массива:");
            for (int i = 0; i < len18; i++) {
                array18[i] = scanner.nextInt();
            }
            System.out.print("Введите длину массива для вставки: ");
            int insLen = scanner.nextInt();
            int[] insArray = new int[insLen];
            System.out.println("Введите элементы массива для вставки:");
            for (int i = 0; i < insLen; i++) {
                insArray[i] = scanner.nextInt();
            }
            System.out.print("Введите позицию для вставки: ");
            int pos = scanner.nextInt();
            System.out.println("Результат добавления: " + Arrays.toString(add(array18, insArray, pos)));

            // Задача 19: Возвратный реверс
            System.out.print("Введите длину массива для задачи 19: ");
            int len19 = scanner.nextInt();
            int[] array19 = new int[len19];
            System.out.println("Введите элементы массива:");
            for (int i = 0; i < len19; i++) {
                array19[i] = scanner.nextInt();
            }
            System.out.println("Реверс массива: " + Arrays.toString(reverseBack(array19)));

            // Задача 20: Все вхождения
            System.out.print("Введите длину массива для задачи 20: ");
            int len20 = scanner.nextInt();
            int[] array20 = new int[len20];
            System.out.println("Введите элементы массива:");
            for (int i = 0; i < len20; i++) {
                array20[i] = scanner.nextInt();
            }
            System.out.print("Введите число для поиска всех его вхождений: ");
            int searchVal = scanner.nextInt();
            System.out.println("Все вхождения числа " + searchVal + ": " + Arrays.toString(findAll(array20, searchVal)));
            

        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        scanner.close();
    }
}
