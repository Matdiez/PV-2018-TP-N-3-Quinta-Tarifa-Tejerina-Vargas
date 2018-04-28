package Modelo;

import java.util.Scanner;

public class Arreglo {

    public Arreglo() {
    }
    private int[] arreglo;

    public void ingresarNum() {
        arreglo = new int[10];
        Scanner lec = new Scanner(System.in);
        int i, lim;
        for(i=0;i<10;i++) {
            System.out.println("Ingrese un número (2 veces): ");
            //jejox
            lim = lec.nextInt();
            getArreglo()[i] = lec.nextInt();
        }
    }

    /**
     * @return the arreglo
     */
    public int[] getArreglo() {
        return arreglo;
    }

    /**
     * @param arreglo the arreglo to set
     */
    public void setArreglo(int[] arreglo) {
        this.arreglo = arreglo;
    }
    
}