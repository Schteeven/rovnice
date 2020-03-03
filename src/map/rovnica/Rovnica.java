package map.rovnica;

import java.util.InputMismatchException;
import java.util.Scanner;

abstract public class Rovnica
{
    protected float a;
    protected float b;

    abstract protected void vypisRovnicu();
    abstract protected float [] vypocitajKorene();
    abstract protected void vypisKorene();
    abstract public String toString();
    float getFloat(boolean ajNula, String text)
    {
        Scanner sc = new Scanner (text);
        Scanner sc1 = new Scanner (System.in);
        float cislo;
        while(true)
        {
            try {
                cislo = sc.nextFloat();

                if(cislo == 0 && !ajNula)
                {
                    throw new ArithmeticException();
                }
                //TODO: dorob + skus si spravit vlastnu vynimku
            }catch (InputMismatchException ime)
            {
                System.out.println("Zadana hodnota musi byt cislo...");
                sc = new Scanner (sc1.nextLine());
            }
            catch (ArithmeticException ae)
            {
                System.out.println("Zadana hodnota nesmie byt nula...");
                sc = new Scanner (sc1.nextLine());
            }
        }

    }

}

//