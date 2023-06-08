package homework1;

public class task2 {
//    2. Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое), и с помощью
//    цикла(-ов) заполнить его диагональные элементы единицами (можно только одну из диагоналей, если обе сложно).
//    Определить элементы одной из диагоналей можно по следующему принципу: индексы таких элементов равны,
//    то есть [0][0], [1][1], [2][2], …, [n][n];
    public static void main(String[] args) {
        int[][] userArray = new int[4][4];
        for (int i = 0; i < userArray.length; i++) {
            for (int j = 0; j < userArray[i].length; j++) {
                userArray[i][j] = i == j ? 1 : 0;
                System.out.printf("%d ", userArray[i][j]);
            }
            System.out.println("");
        }

    }
}
