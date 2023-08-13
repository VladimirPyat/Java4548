package _final_test;

public class Toys {
    private static int copyCounter=0;
    private static int randWeight;
    private static int id;
    private String name;

    public String getName() {
        return name;
    }

    public static int getId() {
        return id;
    }

    public static int getRandWeight() {
        return randWeight;
    }

    public static void setRandWeight(int randWeightValue) {
        randWeight = randWeightValue;
    }
}

