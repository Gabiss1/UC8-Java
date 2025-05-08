/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.primeiroprojeto;
import java.util.Scanner;

/**
 *
 * @author GABRIELGARCEZDEOLIVE
 */
public class Escrever {
    public void escrever(){
        // Cria um objeto Scanner para ler a entrada do usuário
        Scanner sc = new Scanner(System.in);

        // Declara duas variáveis inteiras para armazenar os números digitados pelo usuário
        int numero1, numero2;

        // Solicita ao usuário que digite o primeiro número
        System.out.println("Digite um número: ");
        numero1 = sc.nextInt(); // Lê o próximo inteiro digitado pelo usuário e o armazena em numero1

        // Solicita ao usuário que digite o segundo número
        System.out.println("Digite outro número: ");
        numero2 = sc.nextInt(); // Lê o próximo inteiro digitado pelo usuário e o armazena em numero2

        // Exibe uma mensagem para indicar que o resultado será mostrado
        
        System.out.println("Resultado: " + ((numero1 - numero2)* numero2));
        
        // Ou
        
        int expressao = numero1 + numero2;
        System.out.println("Resultado: "+ expressao);
        
        

        // Fecha o objeto Scanner para liberar os recursos utilizados
    }
    
    // Usando Static não preciso instanciar um objeto da classe no main
    // Para acessar váriáveis de fora do método stsr
    
    public static void escreverNome(){
        Scanner sc = new Scanner(System.in);
        
        String nome;
        
        System.out.println("Digite seu Nome: ");
        nome = sc.nextLine();
        
        System.out.println("Seu nome é: "+ nome);
    }
}
