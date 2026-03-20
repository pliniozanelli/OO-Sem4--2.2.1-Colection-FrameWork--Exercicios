
package com.mycompany.pontuacao;
import java.util.Map;
import java.util.HashMap;


public class Pontuacao {
    
    
    public static void main(String[] args) {
        Map<String, Integer> jogadores = new HashMap<>();
        
        jogadores.put("Neymar", 3);
        jogadores.put("CR7", 2);
        jogadores.put("Messi", 4);
        
        System.out.println("-----------------------------------------");
        
        System.out.println("Tabela: ");
        for(Map.Entry<String, Integer> j : jogadores.entrySet()){
            
            System.out.println(j);
        }
        
        System.out.println("-----------------------------------------");
        
        System.out.println("Neymar marcou +2!");
        jogadores.put("Neymar", jogadores.get("Neymar")+2);
        
        System.out.println("-----------------------------------------");
        
        System.out.println("Tabela: ");
        for(Map.Entry<String, Integer> j : jogadores.entrySet()){
            
            System.out.println(j);
        }
        
    }
}
