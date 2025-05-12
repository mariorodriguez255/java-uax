package uax.practicas.java_uax.ejs;

public class ej5 {
    public void e(int[] arr) {

        int pares = 0;
        for (int i = 0; i < arr.length; i++) {
            pares = arr[i] % 2 == 0 ? ++pares : pares;
        }
        System.out.println("Pares: " + pares + "\nImpares: " + (arr.length - pares));
    }
    
}
