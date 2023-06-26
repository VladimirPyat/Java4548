package homework6;
import java.util.Random;

public class Notebook {
    private static int nextId = 1;
    private int id;
    private String brand;
    private Double screen_diag;
    private String cpu;
    private String video;
    private int ram_size;
    private int hdd_size;
    private int sdd_size;

    public  Notebook (String brand, Double screen_diag, String cpu, String video, int ram_size, int hdd_size, int sdd_size) {                   //конструктор
        this.id = nextId++;
        this.brand = brand;
        this.screen_diag = screen_diag;
        this.cpu = cpu;
        this.video = video;
        this.ram_size = ram_size;
        this.hdd_size = hdd_size;
        this.sdd_size = sdd_size;
    }

//    public Notebook() {}



    public  void write() {                                                                  //печать характеристик
        System.out.println("Артикул: "+this.id);
        System.out.println("Производитель: "+this.brand);
        System.out.println("Диагональ экрана, дюйм: "+this.screen_diag);
        System.out.println("Центральный процессор: "+this.cpu);
        System.out.println("Видеокарта: "+this.video);
        System.out.println("Оперативная память, Гб: "+this.ram_size);
        System.out.println("Емкость HDD, Гб: "+this.hdd_size);
        System.out.println("Емкость SDD, Гб: "+this.sdd_size);
        System.out.println();

    }

    private static  Object randField (Object[] array) {                                 //выбор случайной позиции из списка
        Random random = new Random();
        int pos = random.nextInt(array.length);
        return  array[pos];
    }

    public static Notebook generate() {

        String[] brandOptions = {"ASUS", "HP", "Lenovo", "Dell"};
        Double[] screen_diagOptions = {14.0, 14.5, 15.0, 15.6, 16.0, 17.0};
        String[] cpuOptions = {"i3", "i5", "i7", "Ryzen "};
        String[] videoOptions = {"Nvidia", "ATI", "int"};
        Integer[] ram_sizeOptions = {4, 6, 8, 12, 16, 32};
        Integer[] hdd_sizeOptions = {0, 500, 700, 1000, 1500, 2000};
        Integer[] sdd_sizeOptions = {0, 100, 200, 250, 500};

        String brand = (String) randField(brandOptions);
        Double screen_diag = (Double) randField(screen_diagOptions);
        String cpu = (String) randField(cpuOptions);
        String video = (String) randField(videoOptions);
        int ram_size = (int) randField(ram_sizeOptions);
        int hdd_size = (int) randField(hdd_sizeOptions);
        int sdd_size = (int) randField(sdd_sizeOptions);


        return new Notebook(brand, screen_diag, cpu, video, ram_size, hdd_size, sdd_size);
    }

    public String toString() {
        return brand + screen_diag + cpu + video + ram_size + hdd_size + sdd_size;
    }

    public boolean filter(Object value) {
        String combinedFields = toString();
        return combinedFields.contains(value.toString());
    }







}
