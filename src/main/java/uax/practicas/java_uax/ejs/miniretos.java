package uax.practicas.java_uax.ejs;

import java.util.ArrayList;
import java.util.Arrays;

public class miniretos {
    public void ej1() {
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        System.out.println(Arrays.toString(arr));
        System.out.println("Min: " + arr[0] + " Max: " + arr[arr.length - 1]); 
    }
    public void ej2() {
        ArrayList<Character> arr = new ArrayList<>();
        arr.add('a'); arr.add('b');arr.add('c'); arr.add('d');
        System.out.println(arr);
        for (int i = arr.size() - 1; i >= 0; i--) {
            System.out.print(arr.get(i) + " ,");
        }
    }
    public void ej3() {
        
    }
    public void ej5() {
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        int pares = 0;
        for (int i = 0; i < arr.length; i++) {
            pares = arr[i] % 2 == 0 ? ++pares : pares;
        }
        System.out.println(Arrays.toString(arr));
        System.out.println("Pares: " + pares + "\nImpares: " + (arr.length - pares));
    }
    
}
