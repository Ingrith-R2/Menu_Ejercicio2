import java.util.Scanner;
import conicas2.circunferencia_grupo2;
import conicas2.Elipse;
import conicas2.hiperbole;
import conicas2.Parabola_Equipo2;
public class Menu_principal {
    public Menu_principal() {
    }

    public static void main(String[] args) {
        Scanner opcion = new Scanner(System.in);
        int opci;

        System.out.println("---------Bienvenidos--------");
        System.out.println("1.Circunferencia");
        System.out.println("2.Elipse");
        System.out.println("3.Hiperbole");
        System.out.println("4.Parabola");
        System.out.println("Por favor ingrse una opcion: ");
        int op = opcion.nextInt();

        do {

            switch (op) {
                case 1:
                    conicas2.circunferencia_grupo2 circu1 = new conicas2.circunferencia_grupo2(3.0F, 23.0F);
                    System.out.println("Area de la circunferencia: " + circu1.area_cir());

                    break;
                case 2:
                    conicas2.Elipse elipse1 = new conicas2.Elipse(3.0, 4.0);
                    System.out.println("Area de la elipse: " + elipse1.area_elipse());
                    break;
                case 3:
                    conicas2.hiperbole hip = new conicas2.hiperbole(5, 2);
                    System.out.println(hip.variables());
                    break;
                case 4:
                    conicas2.Parabola_Equipo2 parab = new conicas2.Parabola_Equipo2(4.3F, 4.4F, 5.3F, 3.2F, 2.1F);
                    System.out.println(parab.Parabola_Equipo2_ImpVer());
                    break;
            }

            System.out.println("Desea seguir con el programa 1. Si y 2. No");
            System.out.println("Eliga una opcion: ");
            opci = opcion.nextInt();

        }while (opci == 1);

        System.out.println("Gracias por usar el programa......");


    }
}


