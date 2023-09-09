package br.com.unimater.aed2023;
import java.util.Random;
import java.util.Scanner;
public class Projeto_Banco_31_03_23 {
    public static void main(String[] args) {
        Scanner ms = new Scanner(System.in);
        Scanner msl = new Scanner(System.in);
        String nome = ("");
        String bairro = ("");
        String rua = ("");
        String numero = ("");
        int num;
        int j = 0;
        int i = 0;
        int repetir;
        int perg = 0;
        double saq;
        double deposito;
        
        System.out.println("Olá, seja bem vindo, por favor siga os passos seguintes:");
       
        do{
        System.out.println("Digite seu nome completo:");
        nome = msl.nextLine();
        if (nome == ""){
            System.out.println("Nome inválido, tente novamente:");
        }
        }while (nome == "");
        
        System.out.println("Digite o bairro que você mora:");
        bairro = msl.nextLine();
        
        System.out.println("Escreva o nome da rua que você mora:");
        rua = msl.nextLine();
        
        System.out.println("Qual o numero da sua casa?");
        numero = ms.nextLine();
        
        
        // ADICIONANDO SALDO ALEATORIO:
        
        Random random = new Random();
        double saldo = random.nextInt(23001) + 2000;
        
        System.out.println("Olá "+nome+", Siga os passos seguintes:");
        
        do {
           
    // LISTA DE COMANDOS A EXECUTAR:
 
    
    
        do {    
            System.out.println("Digite o número a operação que deseja executar:");
            
            System.out.println("1. Consultar seu saldo");
            System.out.println("2. Sacar");
            System.out.println("3. Depositar");
            System.out.println("4. Extrato");
            System.out.println("5. Consultar seu endereço");
            System.out.println("6. Alterar endereço");
            System.out.println("9. Sair");
            num = ms.nextInt();
            
            if (num < 1 || num >6 && num < 9 || num > 9){
            System.out.println("Comando inválido, tente novamente:");
        }
            
        } while (num < 1 || num >6 && num < 9 || num > 9);
        
        switch(num){
           
    //COMANDO Nº1:        
            
            case 1:
                System.out.println("Seu saldo atual é: R$"+saldo);
                
    //COMANDO FINAL DE PERGUNTA Nº1           
                
                do {
                System.out.println("Deseja realizar outra operação?");
                System.out.println("1. sim");
                System.out.println("2. não");
                repetir = ms.nextInt();
                if (repetir == 2) {
                    num = 9;
              }if (repetir != 1 && repetir != 2){
                    System.out.println("Comando inválido, tente novamente:");
              }
                
                }while (repetir != 1 && repetir != 2);
                break;
    
    //COMANDO Nº2:            
                
            case 2:
                do { System.out.println("seu saldo é: R$"+saldo+", quanto deseja sacar?");
                System.out.print("R$");
                saq = ms.nextDouble();
                    if (saq > saldo) {
                        System.out.println("Valor do saque maior que o saldo, quer tentar novamente?");
                        System.out.println("1. Sim"+"\n"+"2. Não");
                        perg = ms.nextInt();
                    }
                }while (perg == 1);
                saldo = saldo - saq;                  
                i++;
                
    //COMANDO FINAL DE PERGUNTA Nº2
                
                do {
                System.out.println("Deseja realizar outra operação?");
                System.out.println("1. sim");
                System.out.println("2. não");
                repetir = ms.nextInt();
                if (repetir == 2) {
                    num = 9;
              }if (repetir != 1 && repetir != 2){
                    System.out.println("Comando inválido, tente novamente:");
              }
                
                }while (repetir != 1 && repetir != 2);
                break;
                
    //COMANDO Nº3:            
                
            case 3:
                System.out.println("Digite a quantia que deseja depositar:");
                deposito = ms.nextDouble();
                j++;
                if (deposito <= 0) {
                    System.out.println("Deposito inválido!");
                }
                saldo = saldo + deposito;
                System.out.println("Agora seu saldo é: R$"+saldo);
                
    //COMANDO FINAL DE PERGUNTA Nº3:
                
                do {
                System.out.println("Deseja realizar outra operação?");
                System.out.println("1. sim");
                System.out.println("2. não");
                repetir = ms.nextInt();
                if (repetir == 2) {
                    num = 9;
              }if (repetir != 1 && repetir != 2){
                    System.out.println("Comando inválido, tente novamente:");
              }
                
                }while (repetir != 1 && repetir != 2);
                break;
             
    //COMANDO Nº4:            
                
            case 4:
                System.out.println("Você realizou um total de: "+i+" operações de saida e "+j+" de entrada.");
                
    //COMANDO FINAL DE PERGUNTA Nº4           
                
                do {
                System.out.println("Deseja realizar outra operação?");
                System.out.println("1. sim");
                System.out.println("2. não");
                repetir = ms.nextInt();
                if (repetir == 2) {
                    num = 9;
              }if (repetir != 1 && repetir != 2){
                    System.out.println("Comando inválido, tente novamente:");
              }
                
                }while (repetir != 1 && repetir != 2);
                break;
                
    //COMANDO Nº5:            
                
            case 5:
                System.out.println("Seu endereço é:"+"\n"
                                +"Bairro: "+bairro+"\n"
                                        +"Rua: "+rua+"\n"
                                                +"Número: "+numero+"\n");
            
    //COMANDO FINAL DE PERGUNTA Nº5            
                
                do {
                System.out.println("Deseja realizar outra operação?");
                System.out.println("1. sim");
                System.out.println("2. não");
                repetir = ms.nextInt();
                if (repetir == 2) {
                    num = 9;
              }if (repetir != 1 && repetir != 2){
                    System.out.println("Comando inválido, tente novamente:");
              }
                
                }while (repetir != 1 && repetir != 2);
                break;
            
    //COMANDO Nº6:            
                
            case 6:
                System.out.println("Digite seu novo endereço:");
                System.out.println("Bairro:");
                bairro = msl.nextLine();
                System.out.println("Rua:");
                rua = msl.nextLine();
                System.out.println("Numero:");
                numero = msl.nextLine();
                System.out.println("Endereço alterado com sucesso!");
                
    //COMANDO FINAL DE PERGUNTA Nº6           
                
                do {
                System.out.println("Deseja realizar outra operação?");
                System.out.println("1. sim");
                System.out.println("2. não");
                repetir = ms.nextInt();
                if (repetir == 2) {
                    num = 9;
              }if (repetir != 1 && repetir != 2){
                    System.out.println("Comando inválido, tente novamente:");
              }
                
                }while (repetir != 1 && repetir != 2);
                break;
                
    //COMANDO PARA SAIR:            
                
            case 9:
                break;          
                }

 } while (num >= 1 && num <= 6);
        
        System.out.println("Fico muito grato por ter usado nosso chat bot");
        
    }
}
