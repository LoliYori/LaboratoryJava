import java.util.Scanner;
import java.util.Arrays;

public class Main {

    // Задание 1: Дробная часть
    public double fraction(double x) {
        return Math.round((x - (int) x) * 100000.0) / 100000.0;
    }

    // Задание 2: Преобразование символа в число
    public int charToNum(char x) {
        if (x >= '0' && x <= '9') {
            return x - '0';
        } else {
            throw new IllegalArgumentException("Ошибка: символ должен быть цифрой от '0' до '9'.");
        }
    }

    // Задание 3: Проверка на двузначность
    public boolean is2Digits(int x) {
        return x >= 10 && x <= 99;
    }

    // Задание 4: Проверка диапазона
    public boolean isInRange(int a, int b, int num) {
        int min = Math.min(a, b);
        int max = Math.max(a, b);
        return num >= min && num <= max;
    }

    // Задание 5: Проверка равенства трех чисел
    public boolean isEqual(int a, int b, int c) {
        return a == b && b == c;
    }

    // Задание 6: Модуль числа
    public int abs(int x) {
        return (x < 0) ? -x : x;
    }

    // Задание 7: Проверка делимости на 3 или 5
    public boolean is35(int x) {
        return (x % 3 == 0 || x % 5 == 0) && !(x % 3 == 0 && x % 5 == 0);
    }

    // Задание 8: Максимум из трех чисел
    public int max3(int x, int y, int z) {
        return Math.max(x, Math.max(y, z));
    }

    // Задание 9: Сумма двух чисел с проверкой диапазона
    public int sum2(int x, int y) {
        int sum = x + y;
        return (sum >= 10 && sum <= 19) ? 20 : sum;
    }

    // Задание 10: День недели по номеру
    public String day(int x) {
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
    public String listNums(int x) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i <= x; i++) {
            result.append(i).append(" ");
        }
        return result.toString().trim();
    }

    // Задание 12: Четные числа
    public String chet(int x) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i <= x; i += 2) {
            result.append(i).append(" ");
        }
        return result.toString().trim();
    }

    // Задание 13: Длина числа
    public int numLen(long x) {
        return String.valueOf(x).length();
    }

    // Задание 14: Квадрат из символов '*'
    public void square(int x) {
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < x; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    // Задание 15: Правый треугольник
    public void rightTriangle(int x) {
        for (int i = 1; i <= x; i++) {
            System.out.println(" ".repeat(x - i) + "*".repeat(i));
        }
    }

    // Задание 16: Поиск первого значения
    public int findFirst(int[] arr, int x) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                return i;
            }
        }
        return -1;
    }

    // Задание 17: Поиск максимального по модулю значения
    public int maxAbs(int[] arr) {
        int max = arr[0];
        for (int num : arr) {
            if (Math.abs(num) > Math.abs(max)) {
                max = num;
            }
        }
        return max;
    }

    // Задание 18: Добавление массива в массив
    public int[] add(int[] arr, int[] ins, int pos) {
        int[] result = new int[arr.length + ins.length];
        System.arraycopy(arr, 0, result, 0, pos);
        System.arraycopy(ins, 0, result, pos, ins.length);
        System.arraycopy(arr, pos, result, pos + ins.length, arr.length - pos);
        return result;
    }

    // Задание 19: Возвратный реверс
    public int[] reverseBack(int[] arr) {
        int[] reversed = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            reversed[i] = arr[arr.length - 1 - i];
        }
        return reversed;
    }

    // Задание 20: Все вхождения
    public int[] findAll(int[] arr, int x) {
        return Arrays.stream(arr).filter(n -> n == x).toArray();
    }

    public static void main(String[] args) {
        Main app = new Main();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Введите номер задачи: ");
            int task = scanner.nextInt();

            if (task == 0) {
                System.out.println("Завершение программы...");
                break;
            }

            switch (task) {
                case 1:
                    System.out.print("Введите вещественное число: ");
                    double number = scanner.nextDouble();
                    System.out.println("Дробная часть: " + app.fraction(number));
                    break;
                case 2:
                    System.out.print("Введите символ цифры (0-9): ");
                    String input = scanner.next();
                    if (input.length() != 1 || !Character.isDigit(input.charAt(0))) {
                        System.out.println("Ошибка: введите одну цифру.");
                    } else {
                        System.out.println("Число: " + app.charToNum(input.charAt(0)));
                    }
                    break;
                case 3:
                    System.out.print("Введите число: ");
                    int num = scanner.nextInt();
                    System.out.println("Число двузначное? " + app.is2Digits(num));
                    break;
                case 4:
                    System.out.print("Введите левую границу диапазона: ");
                    int startRange = scanner.nextInt();
                    System.out.print("Введите правую границу диапазона: ");
                    int endRange = scanner.nextInt();
                    System.out.print("Введите число для проверки: ");
                    int numberToCheck = scanner.nextInt();
                    System.out.println("Число в диапазоне? " + app.isInRange(startRange, endRange, numberToCheck));
                    break;
                case 5:
                    System.out.print("Введите три числа: ");
                    int a = scanner.nextInt();
                    int b = scanner.nextInt();
                    int c = scanner.nextInt();
                                        System.out.println("Все числа равны? " + app.isEqual(a, b, c));
                    break;
                case 6:
                    System.out.print("Введите число: ");
                    int x = scanner.nextInt();
                    System.out.println("Модуль числа: " + app.abs(x));
                    break;
                case 7:
                    System.out.print("Введите число: ");
                    x = scanner.nextInt();
                    System.out.println("Делится на 3 или 5 (но не на оба)? " + app.is35(x));
                    break;
                case 8:
                    System.out.print("Введите три числа: ");
                    int x1 = scanner.nextInt();
                    int y1 = scanner.nextInt();
                    int z1 = scanner.nextInt();
                    System.out.println("Максимум из трех чисел: " + app.max3(x1, y1, z1));
                    break;
                case 9:
                    System.out.print("Введите два числа: ");
                    int num1 = scanner.nextInt();
                    int num2 = scanner.nextInt();
                    System.out.println("Сумма: " + app.sum2(num1, num2));
                    break;
                case 10:
                    System.out.print("Введите номер дня недели (1-7): ");
                    int day = scanner.nextInt();
                    System.out.println("День недели: " + app.day(day));
                    break;
                case 11:
                    System.out.print("Введите число: ");
                    x = scanner.nextInt();
                    System.out.println("Числа от 0 до " + x + ": " + app.listNums(x));
                    break;
                case 12:
                    System.out.print("Введите число: ");
                    x = scanner.nextInt();
                    System.out.println("Четные числа от 0 до " + x + ": " + app.chet(x));
                    break;
                case 13:
                    System.out.print("Введите число: ");
                    long longNum = scanner.nextLong();
                    System.out.println("Количество цифр в числе: " + app.numLen(longNum));
                    break;
                case 14:
                    System.out.print("Введите размер квадрата: ");
                    x = scanner.nextInt();
                    app.square(x);
                    break;
                case 15:
                    System.out.print("Введите высоту треугольника: ");
                    x = scanner.nextInt();
                    app.rightTriangle(x);
                    break;
                case 16:
                    System.out.print("Введите длину массива: ");
                    int len = scanner.nextInt();
                    int[] array = new int[len];
                    System.out.println("Введите элементы массива: ");
                    for (int i = 0; i < len; i++) {
                        array[i] = scanner.nextInt();
                    }
                    System.out.print("Введите число для поиска: ");
                    x = scanner.nextInt();
                    int index = app.findFirst(array, x);
                    System.out.println("Индекс первого вхождения числа: " + (index == -1 ? "Не найдено" : index));
                    break;
                case 17:
                    System.out.print("Введите длину массива: ");
                    len = scanner.nextInt();
                    array = new int[len];
                    System.out.println("Введите элементы массива: ");
                    for (int i = 0; i < len; i++) {
                        array[i] = scanner.nextInt();
                    }
                    System.out.println("Максимальное по модулю значение: " + app.maxAbs(array));
                    break;
                case 18:
                    System.out.print("Введите длину основного массива: ");
                    len = scanner.nextInt();
                    array = new int[len];
                    System.out.println("Введите элементы основного массива: ");
                    for (int i = 0; i < len; i++) {
                        array[i] = scanner.nextInt();
                    }
                    System.out.print("Введите длину массива для вставки: ");
                    int insLen = scanner.nextInt();
                    int[] insArray = new int[insLen];
                    System.out.println("Введите элементы массива для вставки: ");
                    for (int i = 0; i < insLen; i++) {
                        insArray[i] = scanner.nextInt();
                    }
                    System.out.print("Введите позицию для вставки: ");
                    int pos = scanner.nextInt();
                    int[] newArray = app.add(array, insArray, pos);
                    System.out.println("Новый массив: " + Arrays.toString(newArray));
                    break;
                case 19:
                    System.out.print("Введите длину массива: ");
                    len = scanner.nextInt();
                    array = new int[len];
                    System.out.println("Введите элементы массива: ");
                    for (int i = 0; i < len; i++) {
                        array[i] = scanner.nextInt();
                    }
                    int[] reversedArray = app.reverseBack(array);
                    System.out.println("Перевернутый массив: " + Arrays.toString(reversedArray));
                    break;
                case 20:
                    System.out.print("Введите длину массива: ");
                    len = scanner.nextInt();
                    array = new int[len];
                    System.out.println("Введите элементы массива: ");
                    for (int i = 0; i < len; i++) {
                        array[i] = scanner.nextInt();
                    }
                    System.out.print("Введите число для поиска всех вхождений: ");
                    x = scanner.nextInt();
                    int[] occurrences = app.findAll(array, x);
                    System.out.println("Все вхождения числа: " + Arrays.toString(occurrences));
                    break;
                default:
                    System.out.println("Неверный номер задачи. Попробуйте снова.");
            }
        }
    }
}

