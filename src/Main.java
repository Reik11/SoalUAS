import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        ArrayList<Integer> kecepatanKendaraan = new ArrayList<>();


        for (int i = 0; i < 200; i++) {
            int kecepatan = generateRandom();
            kecepatanKendaraan.add(kecepatan);
        }


        System.out.println("Kecepatan antara 80 dan 100 km/jam:");
        for (int kecepatan : kecepatanKendaraan) {
            if (kecepatan >= 80 && kecepatan <= 100) {
                System.out.println(kecepatan + " km/jam");
            }
        }


        System.out.println("\nKecepatan di bawah 80 km/jam:");
        for (int kecepatan : kecepatanKendaraan) {
            if (kecepatan < 80) {
                System.out.println(kecepatan + " km/jam");
            }
        }
    }


    private static int generateRandom() {
        Random random = new Random();
        return random.nextInt(61) + 60;
    }
}
