
//1. Создать пустой проект в IntelliJ IDEA и прописать метод main().
public class MainHW {
    public static void main(String[] args) {
        //2. Создать переменные всех пройденных типов данных и инициализировать их значения.

        byte byteExample = -119;
        short shortExample = 31307;
        int intExample = 100;
        long longExample = 307000L;
        float floatExample = 30.7f;
        double doubleExample = -307.307;
        char charExample = '\u0000';
        boolean boolExample = true;

        //Вывод решенных задач
        System.out.println(calculate(3,4,5,6));
        System.out.println(between10and20(7,17));
        isPositiveOrNegative(8);
        System.out.println(isNegative(-5));
        hello("Кеша");

    }


    /*3. Написать метод вычисляющий выражение a * (b + (c / d)) и возвращающий результат,
    где a, b, c, d – аргументы этого метода, имеющие тип float.*/
    public static float calculate(float a, float b, float c, float d) {
        return a * (b + (c / d));

    }

    /*4. Написать метод, принимающий на вход два целых числа и проверяющий,
     что их сумма лежит в пределах от 10 до 20 (включительно),
     если да – вернуть true, в противном случае – false.*/

    public static boolean between10and20(int a, int b) {
        int sum = a + b;
        return (10<=sum && sum <=20);
    }

    /*Написать метод, которому в качестве параметра передается целое число, метод должен напечатать в консоль,
    положительное ли число передали или отрицательное. Замечание: ноль считаем положительным числом.
     */

    public static void isPositiveOrNegative(int a) {
        if (a >= 0)
            System.out.println("Число положительное");
         else
            System.out.println("Число отрицательное");
        }
     /*6. Написать метод, которому в качестве параметра передается целое число.
     Метод должен вернуть true, если число отрицательное, и вернуть false если положительное.
      */
    public static boolean isNegative (int a) {
        if (a >=0)
            return false;
         else
            return true;
    }
    /* 7. Написать метод, которому в качестве параметра передается строка, обозначающая имя.
    Метод должен вывести в консоль сообщение «Привет, указанное_имя!».
     */

    public static void hello(String name) {
        System.out.println("Привет, " + name + "!");
    }


    }

