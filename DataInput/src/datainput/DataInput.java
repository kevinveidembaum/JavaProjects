
package datainput;

import java.util.Scanner;

/**
 *
 * @author Nikolai
 */
public class DataInput {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite o nome do aluno: ");
        String nome = teclado.nextLine();
        System.out.print("Informe a nota do aluno: ");
        float nota = teclado.nextFloat();
        System.out.format("O aluno %s teve a nota %.1f \n", nome, nota);
        if(nota >= 6){
            System.out.printf("Excelente %s, APROVADO! \n", nome);
        }else{
            System.out.printf("Tente novamente %s, REPROVADO! \n", nome);
        }
    }
}
