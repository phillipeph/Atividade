

package atividade;

import java.util.Scanner;


public class AtividadePhillipe {
   
    public static void main(String[] args) {
       int menu;
       int [] valor; 
       System.out.println("Digite 1 para cadastrar um novo valor");
        System.out.println("Digite 2 para buscar o valor maior");
        System.out.println("Digite 3 para busca o menor valor");
        System.out.println("Digite 4 para para ver a média dos valores");
        System.out.println("Digite 5 para sair");
       
        Scanner scan = new Scanner(System.in);         
    menu = scan.nextInt();
        switch(menu){
            case 1:
                System.out.println("Quer digitar quantos valores?");
                    int n = scan.nextInt();
                     valor = new int [n];
                     for(int x=0;x<n; x++){
                         int numero = x+1;
                         System.out.println("Digite os valores"+ numero+ ":");
                         valor[x] = scan.nextInt();
                     }
                op.AdicionarNovoValor();
              break;
            case 2:
                op.VerificarMaior();
              break;
            case 3:
                op.VerificarMenor();
              break;
            case 4:
                op.VerificarMedia();
            case 5:
                System.out.println("saindo");
                break;
        }
        }
          
    }
   

