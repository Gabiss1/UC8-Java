/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pagamentos.exercicio;

/**
 *
 * @author GABRIELGARCEZDEOLIVE
 */
public class CartaoCredito implements Pagamento{
    String numeroCartao;
    int codigoSeguranca;
    
    public CartaoCredito(String numeroCartao, int codigoSeguranca) {
        this.numeroCartao = numeroCartao;
        this.codigoSeguranca = codigoSeguranca;
    }

    @Override
    public void processarPagamento(double valor) {
        System.out.println("Pagamento no valor de R$"+valor+" processado no Crédito.");
    }

    @Override
    public String obterDetalhes() {
        String sensura = "";
        
        for(int i = 0; i< numeroCartao.length()-4; i++){
            sensura+="*";
        }
        
        String cartaoInfo = sensura+numeroCartao.substring(numeroCartao.length()-4);
        return cartaoInfo;
    }
}
