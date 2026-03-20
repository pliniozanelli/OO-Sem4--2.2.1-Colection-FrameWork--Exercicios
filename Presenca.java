

package com.mycompany.presenca;
import java.util.Set;
import java.util.HashSet;
import java.util.Scanner;


public class Presenca {

    public static void main(String[] args) {
        Set<String> lista = new HashSet<>();
        
        lista.add("pz");
        lista.add("marcao");
        lista.add("diogo");
        lista.add("pedrin");
        lista.add("diogo");
        
        System.out.println("Alunos presentes: " + lista.size());
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Verificar presença: ");
        String pesquisaAluno = scan.nextLine();
        
        if(lista.contains(pesquisaAluno)){
            System.out.println("O aluno está presente");
        }
        else{
            System.out.println("o aluno está ausente");
        }
        
        
        
        
    }
}
