/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package manipulaficheiros;

import java.util.Scanner;

/**
 *
 * @author lneto
 */
public class ManipulaFicheiros {
 public static Scanner ler = new Scanner ( System.in);
    public static void main(String[] args) {


        int op;
        do{
            System.out.println("1 - Criar Ficheiro");
            System.out.println("2 - verificar se ficheiro existe ");
            System.out.println("3 - Escrever em ficheiros mantendo dados caso exista");
            System.out.println("4 - Escreva um novo ficheiro");
            System.out.println("5 - ler um ficheiro ");
            System.out.println("6 - Mostrar lista de ficheiros");
            System.out.println("0 - Sair");
            System.out.println("Selecione a opção pretendida");
            op = ler.nextInt();
            switch (op){
                case 1: Ficheiro.criarFicheiro(); break;
                case 2: Ficheiro.verificarSeExiste(); break;
                case 3: Ficheiro.escrevefinalFicheiro(); break;
                case 4: Ficheiro.escreveFicheiroNovo(); break;
                case 5: Ficheiro.mostraconteudoFicheiro(); break;
                case 6: Ficheiro.mostraListafichiero(); break;
                case 0: break;
            }
        }while(op!=0);
    }
    
    
}
