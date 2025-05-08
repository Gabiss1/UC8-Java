/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.primeiroprojeto;

/**
 *
 * @author GABRIELGARCEZDEOLIVE
 */
public class Animal {
    String name;
    String species;
    double weight;
    
    // O método construtor, em java, deve ser declarado como public
    // Não deve ter nenhum tipo de retorno
    // Deve ter o mesmo nome exato da classe
    // Não precisa usar o this se os atributos tiverem nomes diferentes
    // Alt + insert = cria automaticamente constructor, getters e setters

    public Animal(String name, String species, double weight) {
        this.name = name;
        this.species = species;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public String getSpecies() {
        return species;
    }

    public double getWeight() {
        return weight;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
    
    public void emitirSom(){
        System.out.println("O animal emitiu um som");
    }
}
