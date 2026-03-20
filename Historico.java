
package com.mycompany.historico;
import java.util.Stack;
import java.util.HashSet;
import java.util.Set;



public class Historico{
    public static void main(String[] args) {
        Stack<String> sites = new Stack<>();
        sites.push("LinkedIn");
        sites.push("YouTube");
        sites.push("Facebook");
        sites.push("Twitter");
        
        Set<String> historico = new HashSet<>();
        
        while(!sites.isEmpty()){
            historico.add(sites.peek());
   
            System.out.println("Site atual: " + sites.pop());
            
        }  
        System.out.println(historico);
        
    }
}
