package homework1;

public class task1 {
//    1. Задать одномерный массив и найти в нем минимальный и максимальный элементы ;
    public static void main(String[] args) {
        int[] userArray = new int[]{1, 11, 0, 1, 3, 2, 8, 1};
        int max = userArray[0];
        int min = userArray[0];
        for (int i = 1; i < userArray.length; i++) {
            if (userArray[i] < min) {
                min = userArray[i];
            }
            if (userArray[i] > max) {
                max = userArray[i];
            }
        }
        System.out.println("Максимум: "+max);
        System.out.println("Минимум: "+min);
    }
}