/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package manipulaficheiros;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author lneto
 */
class Ficheiro {

    static void criarFicheiro() {
         String nome;
        System.out.println("insira o nome do ficheiro a criar ");
        nome = ManipulaFicheiros.ler.nextLine();
        nome = ManipulaFicheiros.ler.next();
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
        nome = ManipulaFicheiros.ler.nextLine();
        nome = ManipulaFicheiros.ler.next();
         File ficheiro = new File (nome);
        if(!ficheiro.exists()){
            System.out.println("O ficheiro não existe");
        }else{
            System.out.println("O ficheiro existe");
        }
    }

    static void escrevefinalFicheiro() {
        String nome;
        System.out.println("insira o nome do ficheiro a criar ");
        nome = ManipulaFicheiros.ler.nextLine();
        nome = ManipulaFicheiros.ler.next();
        File ficheiro = new File (nome);
            try {
                if(!ficheiro.exists()){    
                ficheiro.createNewFile();
                }
                FileWriter fw = new FileWriter(ficheiro,true);
                BufferedWriter bw = new BufferedWriter(fw);
                String texto;
                System.out.println("insira o conteudo");
                texto = ManipulaFicheiros.ler.nextLine();
                texto = ManipulaFicheiros.ler.nextLine();
                bw.write(texto);
                bw.newLine();
                bw.close();
                fw.close();
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
            }

    

    static void mostraconteudoFicheiro() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    static void mostraListafichiero() {
         File ficheiro = new File("C:\\Users\\lneto\\Desktop\\Ficheiros java\\Ficheiros");
       File [] lista = ficheiro.listFiles();
       for(int x=0;x<lista.length;x++){
           System.out.println(lista[x].getName());
           
    }
    }

    static void escreveFicheiroNovo() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
