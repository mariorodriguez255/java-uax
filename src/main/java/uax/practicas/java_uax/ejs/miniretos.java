package uax.practicas.java_uax.ejs;

import java.util.ArrayList;
import java.util.Arrays;

public class miniretos {
    public void ej1() {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        System.out.println(Arrays.toString(arr));
        System.out.println("Min: " + arr[0] + " Max: " + arr[arr.length - 1]);
    }

    public void ej2() {
        ArrayList<Character> arr = new ArrayList<>();
        arr.add('a');
        arr.add('b');
        arr.add('c');
        arr.add('d');
        System.out.println(arr);
        for (int i = arr.size() - 1; i >= 0; i--) {
            System.out.print(arr.get(i) + " ,");
        }
    }

    public void ej3() {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println(Arrays.toString(arr));
        System.out.println("Suma total: " + sum);
    }

    public void ej4() {
        int[] arr = { 18, 7, 29, 56, 91, 3, 27 };
        int max = arr[0], min = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println(Arrays.toString(arr));
        System.out.println("Max: " + max);
        System.out.println("Min: " + min);
    }

    public void ej5() {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int pares = 0;
        for (int i = 0; i < arr.length; i++) {
            pares = arr[i] % 2 == 0 ? ++pares : pares;
        }
        System.out.println(Arrays.toString(arr));
        System.out.println("Pares: " + pares + "\nImpares: " + (arr.length - pares));
    }

    public void ej6(){
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int[] arrx2 = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            arrx2[i] = arr[i] * 2;
        }
        System.out.println("Arr Normal: " + Arrays.toString(arr));
        System.out.println("Arr x2: " + Arrays.toString(arrx2));
    }

    public void ej7(){
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int[] arrx2 = new int[arr.length];
        for (int i = arr.length; i > 0; i--) {
            arrx2[i] = arr[i];
        }
        System.out.println("Arr Normal: " + Arrays.toString(arr));
        System.out.println("Arr Invertido: " + Arrays.toString(arrx2));
    }

    public void ej8(){
        int[] arr = { 1, -2, 3, -4, 5, 6, -7, 8, -9, 10 };
        int[] arrPos = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                arrPos[i] = arr[i];
            }
            

        }
        System.out.println("Arr Normal: " + Arrays.toString(arr));
        System.out.println("Arr Positivos: " + Arrays.toString(arrPos));
        
    }


}
