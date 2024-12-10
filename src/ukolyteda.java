import java.util.Scanner;
public class ukolyteda {
    public void ukol1() {
        for (int i = 0; i <= 30; i++) {
            System.out.println(i + ". Ahoj světe.");
        }
    }

    public void ukol2() {
        Scanner ukolik = new Scanner(System.in);
        System.out.println("Zadej sem slovicko: ");
        String slovo = ukolik.nextLine();
        System.out.println("Slovo je " + slovo);
    }

    public void ukol3() {
        Scanner ukolik = new Scanner(System.in);
        System.out.println("Zadej sem cislicko: ");
        int cislo = ukolik.nextInt();

        if (cislo < 0) {
            System.out.println("Bylo zadano zaporne cislo");
        } else if (cislo == 0) {
            System.out.println("0");
        } else if (cislo > 12) {
            System.out.println("Moc velke cislo");
        } else if (cislo == 1) {
            System.out.println("jedna"); // yanderedev programovani
        } else if (cislo == 2) {
            System.out.println("dva");
        } else if (cislo == 3) {
            System.out.println("tri");
        } else if (cislo == 4) {
            System.out.println("ctvery");
        } else if (cislo == 5) {
            System.out.println("pet");
        } else if (cislo == 6) {
            System.out.println("sest");
        } else if (cislo == 7) {
            System.out.println("sedm");
        } else if (cislo == 8) {
            System.out.println("osm");
        } else if (cislo == 9) {
            System.out.println("devat");
        } else if (cislo == 10) {
            System.out.println("deset");
        } else if (cislo == 11) {
            System.out.println("jedenact");
        }
    }

    public void ukol4() {
        for (int i = 0; i < 20; i++) {
            System.out.println(5*i);
            }
        }

    public void ukol5() {
        Scanner ukolik = new Scanner(System.in);
        System.out.println("Zadej sem cislickookoko: ");
        int prvocislo = ukolik.nextInt();

        // for (int i = 2; i < ; i++) {

        }

    public void ukol6() {
        Scanner ukolik = new Scanner(System.in);
        System.out.println("Zadej sem cislo prvni: ");
        int cislo1 = ukolik.nextInt();
        System.out.println("Zadej sem cislo druhy: ");
        int cislo2 = ukolik.nextInt();
        System.out.println("Zadej sem cislo treti: ");
        int cislo3 = ukolik.nextInt();

        int a = Math.max(cislo1, Math.max(cislo2, cislo3));
        int b = Math.min(cislo1, Math.min(cislo2, cislo3));

        System.out.println("Nejvetsi cislo je" + a);
        System.out.println("Nejmensi cislo je" + b);
        System.out.println("Zbytek po deleni vetsim a mensim cislem je " + a % b);
    }

    public void ukol7() {
        Scanner ukolik = new Scanner(System.in);
        System.out.println("Zadej sem krestni: ");
        String krestni = ukolik.nextLine();
        System.out.println("Zadej sem prijmeni: ");
        String prijmeni = ukolik.nextLine();
        System.out.println("Tvoje jmeno je " + krestni + " " + prijmeni);
    }

    public void ukol8() {
        Scanner ukolik = new Scanner(System.in);
        System.out.println("Zadej sem cislo n: ");
        int n = ukolik.nextInt();

        if (n < 0) {
            System.out.println("Zadal si zaporne cislo, prosim zopakuj");
            
            ukol8();
            return;

        } else if (n > 0) {
            for (int i = 0; i < n; n--) {
                System.out.println(n);
            }
        }
    }

    public void ukol9() {
        for (int i = 1000; i > 943; i--) {
            System.out.println(i);
        }
    }

    public void ukol10() {
        Scanner ukolik = new Scanner(System.in);

        char nejznak = ' ';
        int nejhodnota = 0;

        System.out.println("Zadej sem pismena (10): ");

        for (int i = 0; i < 10; i++) {
            char p = ukolik.next().charAt(0);

            if ((int)p > nejhodnota) {
                nejznak = p;
                nejhodnota = (int)p;
            }
        }

        System.out.println("Nejvyssi ASCII hodnota: " + nejznak);
    }



}
