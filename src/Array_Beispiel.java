import java.util.Scanner;
import java.lang.Math;
public class Array_Beispiel {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int laenge = sc.nextInt();
        int[] array = new int[laenge];
        int[] aufruf1 = Array_Beispiel.teilbarkeit_durch_2(array);
    }
    public static int[] teilbarkeit_durch_2(int[] array) {
        int[] arrayZwischen = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            array[i] = i;
            arrayZwischen[i] = array[i];
            if (arrayZwischen[i] % 2 == 0) {
                System.out.println(arrayZwischen[i]);
            }
        }
        return arrayZwischen;
    }
}