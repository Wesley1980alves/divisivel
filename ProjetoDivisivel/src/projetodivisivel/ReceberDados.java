/*
 * Desenvolva um algoritmo no qual o usuário digite um valor inteiro e lhe é retornado se
esse valor é ou não divisível por 2.
 */
package projetodivisivel;

import java.util.Scanner;

/**
 *
 * @author Wesley
 */
public class ReceberDados {

    public int receberdados(int valor) {

     
        System.out.println("Digite um valor para teste ");
        Scanner n = new Scanner(System.in);
        valor = n.nextInt();
        if (valor % 2 == 0) {
            System.out.println("Numero e divisivel ");
        } else {
            System.out.println(" Numero nao e divisivel");
        }
        return valor;
        

    }
}
