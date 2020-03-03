package map.rovnica;

public class Main
{

    public static void main(String[] args)
    {
//        int x = 1;
//        int y = 2;
//
//        x = vymen(y,y = x);
//
//        System.out.printf("X: %d",x);

        Linearna Prva;
        Prva = new Linearna(2,4);
        Linearna Druha = new Linearna (5);

        Druha.vypisRovnicu();
        Druha.vypisKorene();



        Rovnica Moja = new Linearna(3,4);
        Moja.vypisRovnicu();
        Moja.vypisKorene();


        Rovnica [] rovnice = new Rovnica[5];

        rovnice[0] = new Linearna(1,-2);
        rovnice[1] = new Kvadraticka(1,-5, 6);
        rovnice[2] = new Linearna(1,-2);
        rovnice[3] = new Kvadraticka(1,-4,4);
        rovnice[4] = new Linearna(20,-8);

        int i = 0;

        for(Rovnica nejaka:rovnice)
        {
            System.out.printf("\n%d:",++i);
            nejaka.vypisRovnicu();
            nejaka.vypisKorene();
        }

    }

    public static int vymen(int a, int b)
    {
        return a;
    }


}