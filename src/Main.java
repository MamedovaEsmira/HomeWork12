public class Main {


    public static void isLeap(int year) {
        System.out.println("Задача 1");
        /* Реализуйте метод, который получает в качестве параметра год,
 а затем проверяет, является ли он високосным, и выводит результат в консоль.
Теперь проверку нужно обернуть в метод и использовать год, который приходит в виде параметра.
Результат программы выведите в консоль. Если год високосный, то должно быть выведено
 “*номер года —* високосный год”. Если год не високосный, то, соответственно:
  “*номер года —* не **високосный год”. */
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println("Год является високосным");
        } else {
            System.out.println("Год не является високосным");
        }
    }

    public static void chanceClientOS(int ClientOS, int clientDeviceYear) {
        System.out.println("Задача 2");
    /* К нам пришли коллеги и сообщили, что нам нужно знать не только операционную систему телефона,
   но и год его создания: от этого зависит,
   подойдет ли приложение для телефона или оно просто не установится
   Если телефон произведен с 2015 по нынешний год, то приложение будет работать корректно.
   Если телефон произведен ранее 2015 года, то клиенту нужно посоветовать установить облегченную версию приложения.
   Ваша задача: написать программу, которая выдает соответствующее сообщение клиенту при наличии двух условий —
   операционной системы телефона (iOS или Android) и года производства.
   Если год выпуска ранее 2015 года, то к сообщению об установке нужно добавить информацию об облегченной версии.
   Например, для iOS оно будет звучать так:
   «Установите облегченную версию приложения для iOS по ссылке».
   А для Android так:
   «Установите облегченную версию приложения для Android по ссылке».
   При этом для пользователей с телефоном с 2015 года выпуска нужно вывести обычное предложение об установке приложения.
   Для обозначения года создания используйте переменную clientDeviceYear, где необходимо указать 2015 год.
   **Важно**: вложенность больше двух этажей не допускается (условный оператор внутри условного оператора).
   Напишите метод, куда подаются два параметра: тип операционной системы (ОС) ( 0 — iOS или 1 — Android) и год выпуска устройства.
   Если устройство старше текущего года, предложите ему установить lite-версию (облегченную версию).
   В результате программа должна выводить в консоль в зависимости от исходных данных,
   какую версию приложения (обычную или lite) и для какой ОС (Android или iOS) нужно установить пользователю.*/
        if (ClientOS == 0) {
            if (clientDeviceYear < 2015) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            } else {
                System.out.println("Установите версию приложения для iOS по ссылке");
            }
        } else {
            if (clientDeviceYear < 2015) {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            } else {
                System.out.println("Установите  версию приложения для Android по ссылке");
            }
        }
    }

    public static void DeliveryDays(int deliveryDistance) {
        System.out.println("Задача 3");
        /*Вернемся к делам банковским. У нас хороший банк,
поэтому для наших клиентов мы организуем доставку банковских карт на дом с четкой датой доставки.
Чтобы известить клиента о том, когда будет доставлена его карта, нам нужно знать расстояние от нашего офиса до адреса доставки.
Правила доставки такие:
Доставка в пределах 20 км занимает сутки.
Доставка в пределах от 20 км до 60 км добавляет еще один день доставки.
Доставка в пределах 60 км до 100 км добавляет еще одни сутки.
То есть с каждым следующим интервалом доставки срок увеличивается на 1 день.
Напишите программу, которая выдает сообщение в консоль:
"Потребуется дней: " + срок доставки
Объявите целочисленную переменную deliveryDistance = 95, которая содержит дистанцию до клиента.
Наша задача — доработать код, а именно написать метод, который
на вход принимает дистанцию и возвращает итоговое количество дней доставки. */
        int DeliveryDays = 1;
        if (deliveryDistance < 20) {
            System.out.println("Потребуется дней:" + DeliveryDays);
            DeliveryDays++;
        } else if (deliveryDistance < 60) {
            DeliveryDays++;
            System.out.println("Потребуется дней:" + DeliveryDays);
        } else if (deliveryDistance < 100) {
            DeliveryDays++;
            System.out.println("Потребуется дней:" + DeliveryDays);
        } else {
            System.out.println("Потребуется больше 3 дней");
        }
    }

    public static void reversArray(int[] arr) {
        System.out.println("Задача 4 (повышенная сложность)");
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
    }
public static void findDuplicatesOfLetters(String abc){
    System.out.println("Задача 5");
    abc = abc.replaceAll(" ", " ");
    int [] a1 = new int [26];
    for (int i = 0; i < abc.length(); i++) {
        char b = abc.charAt(i);
        int pos = (int) b - (int) 'a';
        a1[pos] = a1[pos] + 1;
    }
    for (int i = 0; i < a1.length; i++) {


        System.out.println((char) (i + 'a') + " " + a1[i]);
    }
    }
    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }
    public static int sum (int[] arr) {
        int total = 0;
        for (int i = 0; i < arr.length; i++) {
            total += arr[i];

        }
        return total;
    }
    public static double average(int []arr){

        return (double) sum (arr)/arr.length;
    }

    public static void main(String[] args) {

        System.out.println("Задача 1");
        isLeap(2021);
        System.out.println("Задача 2");
        chanceClientOS(0, 2018);
        System.out.println("Задача 3");
        DeliveryDays(395);
        System.out.println("Задача 4, повышенная сложность");
        int [] reversArray=  {3, 2, 1, 6, 5};
        reversArray(reversArray);
        System.out.println("Задача 5");
        findDuplicatesOfLetters("aabccddefgghiijjkk");
        System.out.println("Задача 6");
        System.out.println("Средняя сумма трат за месяц равна: " +  average(generateRandomArray()) + " рублей");

    }
}