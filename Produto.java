package com.mycompany.produto;
import java.util.HashMap;
import java.util.Map;

public class Produto {
    

    public static void main(String[] args) {
        Map<String, Double> produtos = new HashMap<>();
        
        produtos.put("Arroz 5kg", 20.00);
        produtos.put("Feijão 5kg", 15.00);
        produtos.put("Café 500g", 30.00);
        produtos.put("Leite 1L", 8.00);
        
        for(Map.Entry<String, Double> p : produtos.entrySet()){
            System.out.println("Produto: " + p.getKey() + " | R$ " + p.getValue());
        }
        
        produtos.put("Arroz 5kg", 22.00);
        System.out.println("--------------------------------------------");
        System.out.println("Preço do arroz atualizado!");
        System.out.println("--------------------------------------------");
        
        for(Map.Entry<String, Double> p : produtos.entrySet()){
            System.out.println("Produto: " + p.getKey() + " | R$ " + p.getValue());
        }
        
        if(produtos.containsKey("Leite 1L")){
            produtos.remove("Leite 1L");
        }
        
        System.out.println("--------------------------------------------");
        System.out.println("Leite removido!");
        System.out.println("--------------------------------------------");

        for(Map.Entry<String, Double> p : produtos.entrySet()){
            System.out.println("Produto: " + p.getKey() + " | R$ " + p.getValue());
        }
        
        
        
        
        
    }
}
