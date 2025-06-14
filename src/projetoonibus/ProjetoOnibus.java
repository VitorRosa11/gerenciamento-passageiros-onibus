
package projetoonibus;

import java.util.Scanner;


public class ProjetoOnibus {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
      
        // Declarando as variáveis
        int passageiros = 0;
        String entrou_passageiro;
        
        // Aviso inicial para inserir um passageiro
        System.out.println("Para cada entrada de um novo passageiro, digite 'P'.");
        
        // Permitindo ao usuário inserir passageiros
        entrou_passageiro = entrada.nextLine();
        
        while(entrou_passageiro.equalsIgnoreCase("P")){
            
            System.out.println("Novo passageiro.");
            System.out.println("Total: " + ++passageiros + " passageiro(s).");
            System.out.println("Para cada entrada de um novo passageiro, digite 'P'.");
  
            entrou_passageiro = entrada.nextLine();
            
        
            // Limitando a capacidade para 15 passageiros
            if(passageiros == 15){
               System.out.println("Sem capacidade disponível.");
               
               // Fechando o Scanner
               entrada.close();
              
               // Interrompendo o laço de repetição
               break;
              
           }
       
        }
       
    }
    
}
