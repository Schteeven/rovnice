package map.rovnica;

import java.util.Scanner;
import java.util.Arrays;

public class Kvadraticka extends Rovnica
{
    float c;

    private static Scanner sc = new Scanner(System.in);

    public Kvadraticka(int _a, int _b, int _c)
    {
        a = _a;
        b = _b;
        c = _c;
    }

    public Kvadraticka(int _a)
    {
        //this(_a,_a,_a)
        a = b = c = _a;
    }

    public Kvadraticka()
    {
        System.out.println("Zadaj koeficient a: ");
        a = sc.nextFloat();
        System.out.println("Zadaj koeficient b: ");
        b = sc.nextFloat();
        System.out.println("Zadaj koeficient c: ");
        c = sc.nextFloat();
    }


    @Override
    protected void vypisKorene()
    {
        System.out.printf("Korene: %s\n",Arrays.toString(vypocitajKorene()));
    }

    @Override
    public String toString()
    {
        return String.format("%.2fx^2 + %+.2fx %+.2f = 0", a, b, c);
    }

    @Override
    protected void vypisRovnicu()
    {
        System.out.printf("%.2fx^2 + %+.2fx %+.2f = 0\n", a, b, c);
    }

    @Override
    protected float[] vypocitajKorene() //vynimka shit
    {
        if(b*b - 4*a*c > 0)
        {
            float x1 = (-b - (b*b - 4*a*c)) / 2 * a;
            float x2 = (-b + (b*b - 4*a*c)) / 2 * a;
            return new float[] {x1,x2};
        }
        else if(b*b - 4*a*c == 0)
        {
            float x = -b / 2 * a;
            return new float[] {x};
        }
        else if(b*b - 4*a*c < 0)
        {
            float[] arr = new float[0];
            System.out.println("Rovnica nema riesenie v mnozine realnych cisel.");
            return new float[] { };
        }
        return new float[] { };
    }

}