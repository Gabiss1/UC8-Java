/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.conexaobancodados;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author GABRIELGARCEZDEOLIVE
 */
public class Conexao {
    private static Connection connection;
    
    private static final String URL = "jdbc:mysql://localhost:3306/meu_banco";
    private static final String DB_USER = "root";
    private static final String DB_PASSWORD = "root";
    
    // Conecta ao banco de dados
    public static Connection conectar(){
        try{
            if(connection == null || connection.isClosed()){
                connection = DriverManager.getConnection(URL, DB_USER, DB_PASSWORD);
                criarTabela();
                System.out.println("Conectado ao Banco!");
            }
        } catch(SQLException error){
            System.out.println(error.getMessage());
        }
        return connection;
    }
    
    // Criar tabela de usuários se ela não existir
    public static void criarTabela(){
        String sql = "CREATE TABLE IF NOT EXISTS usuarios (id INT AUTO_INCREMENT PRIMARY KEY, "
                + "usuario VARCHAR(255) NOT NULL UNIQUE,"
                + "senha VARCHAR(255) NOT NULL)";
        
        // Statements (declaração) é uma classe que permite executar comandos SQL
        try(Statement stmt = connection.createStatement()){
            // Executa o comando SQL
            stmt.execute(sql);
        } catch(SQLException error){
            System.out.println(error.getMessage());
        }
    }
}
