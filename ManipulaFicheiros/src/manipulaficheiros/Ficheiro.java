/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package manipulaficheiros;

import java.io.File;
import java.io.IOException;

/**
 *
 * @author lneto
 */
class Ficheiro {

    static void criarFicheiro() {
         String nome;
        System.out.println("insira o nome do ficheiro a criar ");
        nome = ManipulaFicheiros.ler.next();
        nome = ManipulaFicheiros.ler.nextLine();
        File ficheiro = new File (nome);
        if(!ficheiro.exists()){
            try {
                ficheiro.createNewFile();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }

    static void verificarSeExiste() {
        String nome;
        System.out.println("insira o nome do ficheiro a criar ");
        nome = ManipulaFicheiros.ler.next();
        nome = ManipulaFicheiros.ler.nextLine();
        File ficheiro = new File (nome);
        if(!ficheiro.exists()){
            System.out.println("O ficheiro não existe");
        }else{
            System.out.println("O ficheiro existe");
        }
    }

    static void escrevefinalFicheiro() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    static void escreveFicheiroNovo() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    static void mostraconteudiFicheiro() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    static void mostraListafichiero() {
         File ficheiro = new File("C:\\Users\\lneto\\Desktop\\Ficheiros java\\Ficheiros");
       File [] lista = ficheiro.listFiles();
       for(int x=0;x<lista.length;x++){
           System.out.println(lista[x].getName());
           
    }
    }
    
}
