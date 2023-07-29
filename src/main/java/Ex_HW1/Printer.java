package Ex_HW1;


public class Printer {
    public static void main(String[] args) {
        Answer ans = new Answer();
        try {
            ans.arrayOutOfBoundsException();
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Выход за пределы массива");
        }

        try {
            ans.divisionByZero();
        } catch (ArithmeticException e) {
            System.out.println("Деление на ноль");
        }

        try {
            ans.numberFormatException();
        } catch (NumberFormatException e) {
            System.out.println("Ошибка преобразования строки в число");
        }

    }
}

class Answer {
    public static void arrayOutOfBoundsException() {
        int[] myIntArray = {1, 3, 5};
        int a = myIntArray.length;
        System.out.println(myIntArray[4]);
    }

    public static void divisionByZero() {
        int number = 1;
        int divider = 0;
        int result = number / divider;

    }

    public static void numberFormatException() {
        String someString = "not a number";
        int result = Integer.parseInt(someString);

    }



}

