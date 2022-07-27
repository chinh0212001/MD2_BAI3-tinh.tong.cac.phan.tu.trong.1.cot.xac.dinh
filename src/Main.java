import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap size cua Mang");
        int n = scanner.nextInt();
        double[] array = new double[n];
        double total = 0;
        for (int i = 0; i < array.length; i++) {
            System.out.printf("nhap gia tri cac phan tu : "+(i+1)+":" );
            array[i] = scanner.nextDouble();
        }
        scanner.close();
        for (int i = 0; i < array.length; i++) {
            total = total + array[i];
        }
        System.out.format("ket qua la : %.3f",total);
    }
}