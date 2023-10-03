import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String nazwa;
        int liczbludnosci;
        double powierzchnia;
        String gmina;
        double powierzchniaNieuzytkowa;

        List<Miejscowosc> miejscowoscList = new ArrayList<>();

        for(int i = 0; i < 2; i++){
            System.out.println("podaj nazwe miasta");
            nazwa = scanner.nextLine();
            System.out.println("podaj liczbe ludnosci");
            liczbludnosci = scanner.nextInt();
            scanner.nextLine();
            System.out.println("podaj powierzchnie");
            powierzchnia = scanner.nextDouble();
            scanner.nextLine();
            System.out.println("podaj nazwe gminy");
            gmina = scanner.nextLine();
            System.out.println("podaj powierzchnie nieuzytkowana");
            powierzchniaNieuzytkowa = scanner.nextDouble();
            scanner.nextLine();
            Miejscowosc miejscowosc = new Miejscowosc(nazwa, liczbludnosci, powierzchnia, gmina, powierzchniaNieuzytkowa);
            miejscowoscList.add(miejscowosc);
        }

        System.out.println(miejscowoscList);
        for(Miejscowosc miejscowosc : miejscowoscList) System.out.println(miejscowosc);

       Miejscowosc miejscowosc;
//        miejscowosc = miejscowoscList.get(1);
//        System.out.println(miejscowosc.obliczZageszczenieLudnosci());
//        System.out.println(miejscowosc.powierzchniaUzytkowa());


        System.out.println("ktore chcesz obliczyc");
        int nr = scanner.nextInt();
        miejscowosc = miejscowoscList.get(nr);
        System.out.println(" gestosc zaludnienia tego miast to " + miejscowosc.obliczZageszczenieLudnosci());
        System.out.println("obszar uzytkowy to " +miejscowosc.powierzchniaUzytkowa());


    }
}