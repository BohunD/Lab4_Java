import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Cosmetics[] cosmetics = {
                new Cosmetics("Помада", "бренд1", 9.99,  "Ukraine", 15, "Makeup"),
                new Cosmetics("Шампунь", "бренд2", 4.49,  "Germany", 850, "Hair Care"),
                new Cosmetics("Гель для душу", "бренд3", 8.99, "France", 1000, "Skincare"),
                new Cosmetics("Крем для обличчя", "бренд4", 12.99,  "China", 150, "Skincare"),
                new Cosmetics("Крем після гоління", "бренд5", 3.99,  "USA", 140, "Shaving")
        };

        // Сортуємо масив за полем "price" за зростанням
        Arrays.sort(cosmetics, java.util.Comparator.comparingDouble(Cosmetics::getPrice));

        System.out.println("Сортування за ціною за зростанням:");
        for (Cosmetics cosmetic : cosmetics) {
            System.out.println(cosmetic);
        }

        // Сортуємо масив за полем "weight" за спаданням
        Arrays.sort(cosmetics, java.util.Comparator.comparingInt(Cosmetics::getWeight).reversed());

        System.out.println("\nСортування за вагою за спаданням:");
        for (Cosmetics cosmetic : cosmetics) {
            System.out.println(cosmetic);
        }
    }
}
