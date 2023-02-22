import java.util.Scanner;

public class tarea1 {
    public static void main (String[] args){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Escribe tu nombre, seguido escribe tu profesion y tu pais de origen");
        String entrada = teclado.nextLine();
        String[] separado = entrada.toUpperCase().split(" ");

        System.out.println("nombre: "+separado[0]);
        System.out.println("profesion: "+separado[1]);
        System.out.println("pais: "+ separado[2]);

    }
}