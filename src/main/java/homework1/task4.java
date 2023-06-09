package homework1;

public class task4 {
    public static void main(String[] args) {
        int userArray[] = new int[] {6, 1, 3, 5};
        int shift = -1;
        stringShift (userArray, shift);

    }

    static void stringShift(int [] userArr, int n){     //циклический сдвиг массива userArr на n разрядов
        boolean right = n > 0;                          //если n > 0 - сдвиг вправо
        int len = userArr.length;

        for (int i = 0; i < Math.abs(n); i++) {         //сдвигаем на 1 разряд n раз
            if (right) {
                int temp = userArr[len-1];              //сдвиг вправо
                for (int j = len-1; j > 0; j--) {
                    userArr[j] = userArr[j-1];
                }
                userArr[0] = temp;
            }
            else {
                int temp = userArr[0];                  //сдвиг влево
                for (int j = 1; j < len; j++) {
                    userArr[j-1] = userArr[j];
                }
                userArr[len-1] = temp;
            }
        }
        for (int j = 0; j < len; j++) {
            System.out.printf("%d ", userArr[j]);
        }
    }


}
