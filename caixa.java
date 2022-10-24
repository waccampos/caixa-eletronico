package caixaeletronico;

import java.util.Scanner;

public class Caixa {
    int escolha;
    double saldo;
    double depositar;
    double retirada;
    public String continuar;
    
    public void Conta(){
        
        Scanner dados = new Scanner(System.in);
        
        do{
            
        System.out.println("---------------- banco ----------------");
        System.out.println("para depositar digite 1");
        System.out.println("para retirar dinheiro digite 2");
        System.out.println("para ver o saldo digite 3");
        escolha = dados.nextInt();
        System.out.println("---------------------------------------");
        
        switch (escolha) {
            case 1 -> {
                System.out.print("digite o valor que deseja depositar na conta: ");
                depositar = dados.nextDouble();
                saldo = saldo + depositar;
                System.out.println("o seu saldo atual e de: "+saldo);
            }
            
            case 2 -> {
                System.out.print("digite o valor que deseja retirar da conta: ");
                retirada = dados.nextDouble();
                if (saldo < retirada){
                    System.out.println("saldo insuficiente");
                }
                else{
                saldo = saldo - retirada;
                System.out.print("o seu saldo atual e de:"+saldo);
                }
                break;
            }
            case 3 -> {
                System.out.print("o seu saldo e de "+ saldo);
                break;
            }
            default -> {
                System.out.print("opiçao invalida tente novamente");
                    }            
            }
            System.out.println(" ");
            System.out.println("quer continuar? [s/n]");
            continuar = dados.next();
        
        }while(continuar.equals("s"));
    }
} 
