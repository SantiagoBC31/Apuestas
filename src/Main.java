import java.sql.SQLOutput;
import java.util.Random;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Random aleatorio = new Random();
        int montoInicial ;
        int resultadoApuesta;
        System.out.println("Bienvenido al juego");
        System.out.println("Reglas ");
        System.out.println("3 Pierdes todo");
        System.out.println("2 Pierdes la mitad");
        System.out.println("1 se dobla lo que tengas");
        System.out.println("inglesa lo que quieres apostar");
        montoInicial = teclado.nextInt();
        while (montoInicial !=0){
            resultadoApuesta = aleatorio.nextInt(1,4);
            System.out.println("tu resultado fue "+resultadoApuesta);

            if (resultadoApuesta == 2) {
                montoInicial = (montoInicial/2);
                System.out.println(" tu nuevo valor es "+montoInicial);

            }else if (resultadoApuesta == 1) {
                montoInicial = (montoInicial * 2);
                System.out.println(" tu nuevo valor es " + montoInicial);
            }else {
                montoInicial = 0;
                System.out.println("Perdiste todo");
                System.out.println("Fin del juego");
                break;
            }
            System.out.println("quieres seguir jugando");
            System.out.println("si = 1");
            System.out.println("no = 2");
            Scanner teclado2 = new Scanner(System.in);
            int opcion ;
            opcion = teclado2.nextInt();
            if ( opcion == 2){
                System.out.println("Se acabo el juego");
                break;
            }







        }




    }
}