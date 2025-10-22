import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    private static Scanner sc = new Scanner(System.in);
    private static String cadena;
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!");

        for (int i = 1; i <= 5; i++) {
            //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
            System.out.println("i = " + i);
        }
    }
    public static void funcion1() {
        System.out.println("funcion1");
    }

    public static void SolicitarCadena(){
        System.out.println("Escribeme una cadena de caracteres: ");
        cadena = sc.nextLine();
    }
    public static void VisualizarCadena(){
        if (cadena==null || cadena.isEmpty()) {
            System.out.println("La cadena esta vacia");
            SolicitarCadena(); //salir del metodo
        }

        System.out.println("Dada la cadena: '" + cadena + "' ¿De que posición quieres ver el caracter?");
        int posicion = sc.nextInt();
        char caracter = cadena.charAt(posicion-1);
        System.out.println("El caracter es: " + caracter);

    }

}