public class UstawPunkt {

    public static void main(String[] args) {
//        Punkt punkt = new Punkt();
//        punkt.ustawX(10);
//        punkt.ustawY(20);
//       // System.out.println("Współrzędne punktu to (" + punkt.wspX + ", " + punkt.wspY+")");

        Punkt punkt1=new Punkt();
        punkt1.wspY=2;
        punkt1.wspX=0;

        punkt1.zwiekszX();
        punkt1.zwiekszY();
        punkt1.wyswietl();

        punkt1.zmienX(20);
        punkt1.wyswietl();

        int wartosc=punkt1.zwrocX();
        System.out.println("wartość: "+wartosc);


    }

}
