package ex1;

public class Main {
    public static void main(String[] args) {


        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println(checkLength(array, 3));

    }
        public static int checkLength ( int[] array, int minLength){
            if (array.length < minLength) {
                return -1;

            }else {
                return array.length;
            }
        }

}
