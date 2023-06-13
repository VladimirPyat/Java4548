package lesson2;

//Дано четное число N>0 и символы с1 и с2
//Написать метод, который вернет строку длины N, которая состоит из чередующихся символов с1, с2

public class task1 {
    public static void main(String[] args) {
    int n = 6;
    char c1 = 'f';
    char c2 = 'g';
    String s = "";
    stringClue(n, c1, c2);
    }

    static void stringClue (int mult, char sign1, char sign2) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < mult/2; i++) {
            sb.append(sign1).append(sign2);
        }
        System.out.println (sb);
    }
}
