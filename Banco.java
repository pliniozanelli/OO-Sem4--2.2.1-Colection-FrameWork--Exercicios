

package com.mycompany.banco;
import java.util.Scanner;
import java.util.Queue;
import java.util.LinkedList;




public class Banco {
    
    private String nome;
    
    public Banco(){
        this.nome = "";
    }
    private Scanner scan = new Scanner(System.in);
    
    public void Preenhcer(){
        System.out.println("Informe o nome do cliente");
        this.setNome(scan.nextLine());
        
        
    }
    
    @Override
    public String toString(){
        return "Nome do cliente: " + this.nome;
    }
    
    public void Imprimir(){
        System.out.println(this.toString());
    }
    
    
   

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    
    
    public static void main(String[] args) {
        Queue<Banco> clientes = new LinkedList<>();
        
        Banco c1 = new Banco();
        Banco c2 = new Banco();
        
        c1.Preenhcer();
        c2.Preenhcer();
        
        clientes.add(c1);
        clientes.add(c2);
        
        while(!clientes.isEmpty()){
            System.out.println("Atendendo: " + clientes.poll());
            System.out.println("Aguardando: " + clientes.size());
            System.out.println("Próximo: " + clientes.peek());
            System.out.println("-------------------------------");
            
        }
        
        
        
        
        
    }
}
