package map.rovnica;

import java.util.Arrays;
import java.util.Scanner;

public class Linearna extends Rovnica
{
    private static Scanner sc = new Scanner(System.in);

    public Linearna(int _a, int _b)
    {
        a = _a;
        b = _b;
    }

    public Linearna(int _a)
    {
        //this(_a,_a)
        a = _a;
        b = _a;
    }

    public Linearna()
    {
        System.out.println("Zadaj koeficient a: ");
        a = sc.nextFloat();
        System.out.println("Zadaj koeficient b: ");
        b = sc.nextFloat();
    }

    @Override
    public void vypisKorene()
    {
        System.out.printf("Koren: %s\n", Arrays.toString(vypocitajKorene()));
    }

    @Override
    public void vypisRovnicu()
    {
        System.out.printf("%.2fx %+.2f = 0\n",a,b);
    }

    @Override
    public float[] vypocitajKorene()
    {
        float[] arr = new float[1];
        arr[0]= -b / a;
        return arr;
    }

    @Override
    public String toString()
    {
        return String.format("%.2fx %+.2f = 0",a,b);
    }
}