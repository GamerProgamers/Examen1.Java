import java.util.Scanner;
import javax.swing.*;

public class Examen1 {
    //una función que tome un entero y devuelva un array del mismo largo,
    // donde todos sus valores sean el mismo numero
    Scanner scanner = new Scanner(System.in);

    public static int Funcion (int i,int Valor) {
        int[] mi_matriz = new int[Valor];
        for (i = 0; i < Valor; i++) {
            mi_matriz[i] = Valor;
            System.out.println(mi_matriz[i]);
        }
        return  mi_matriz[0] = Valor;
    }
    public static int Sumar(int Numeros )
    {
        int Suma = 0;
        Suma = Numeros * Numeros - Numeros;
        return Suma;
    }
    public static int FuncionFinal () {
        int Valores = 0 ;
        int result = Funcion(0, 10);
        int ResSuma = Sumar(result);

        Valores = result + ResSuma;
        int Fin = 0;
        Fin = Valores;
        return Fin;

    }

    public static void main(String[] args) {

        System.out.println("La suma de todo es "+ FuncionFinal());

    }


    }








