/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.atividade01.pokequizz;

/**
 *
 * @author GABRIEL
 */
public class Question {
    String text;
    int number;
    String options[];
    int correct;

    public Question(String text, int number, String[] options, int correct) {
        this.text = text;
        this.number = number;
        this.options = options;
        this.correct = correct;
    }

    public String getText() {
        return text;
    }

    public int getNumber() {
        return number;
    }

    public String[] getOptions() {
        return options;
    }

    public int getCorrect() {
        return correct;
    }

    public Boolean verifyCorrect(String choosen){
        if(choosen.equals(options[correct])){
            return true;
        }
        return false;
    }
}
