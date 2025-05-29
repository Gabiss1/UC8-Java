/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pagamentos.exercicio;

/**
 *
 * @author GABRIELGARCEZDEOLIVE
 */
public class PagamentosExercicio {

    public static void main(String[] args) {
        CartaoCredito cartao = new CartaoCredito("084712849331", 1234);
        Paypal payPal = new Paypal("lucca@gemeiu.with");
        
        cartao.processarPagamento(2);
        System.out.println(cartao.obterDetalhes());
        
        payPal.processarPagamento(1200);
        System.out.println(payPal.obterDetalhes());
    }
}
