/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pagamentos.exercicio;

/**
 *
 * @author GABRIELGARCEZDEOLIVE
 */
public class Paypal implements Pagamento{
    String email;

    public Paypal(String email) {
        this.email = email;
    }

    @Override
    public void processarPagamento(double valor) {
        System.out.println("Pagamento no valor de R$"+valor+" processado via PayPal");                
    }

    @Override
    public String obterDetalhes() {
        return "O Email vinculado a está compra é "+ email + " seu besta.";
    }
    
}
