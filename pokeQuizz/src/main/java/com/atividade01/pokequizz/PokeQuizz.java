/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.atividade01.pokequizz;

/**
 *
 * @author GABRIEL
 */
public class PokeQuizz {

    public static void main(String[] args) {
        
        Question[] questions = new Question[10];

        questions[0] = new Question(
            "<html>Which Pokémon has the highest <br>base stat total among all non-legendary Pokémon (as of Gen 9)?</html>", 1,
            new String[]{"Garchomp", "Slaking", "Dragapult", "Mega Tyranitar"}, 3);

        questions[1] = new Question(
            "<html>In the mainline games, which move has the <br>highest base power (excluding special conditions)?</html>", 2,
            new String[]{"Explosion", "Hyper Beam", "Z-Move", "V-Create"}, 0);

        questions[2] = new Question(
            "<html>What is the only Pokémon that can <br>naturally learn the move 'Oblivion Wing'?</html>", 3,
            new String[]{"Lugia", "Yveltal", "Darkrai", "Hoopa"}, 1);

        questions[3] = new Question(
            "<html>Which Pokémon was the first to be designed, <br>even before Rhydon and Arceus?</html>", 4,
            new String[]{"Bulbasaur", "Clefairy", "Lapras", "Rhydon"}, 3);

        questions[4] = new Question(
            "<html>Which Ability doubles the Speed stat <br>in Electric Terrain?</html>", 5,
            new String[]{"Speed Boost", "Electric Surge", "Surge Surfer", "Levitate"}, 2);

        questions[5] = new Question(
            "<html>Which of the following Pokémon is NOT <br>part of the 'Ultra Beasts' group?</html>", 6,
            new String[]{"Celesteela", "Kartana", "Zeraora", "Xurkitree"}, 2);

        questions[6] = new Question(
            "<html>Which move can only be used <br>if the user is asleep?</html>", 7,
            new String[]{"Dream Eater", "Sleep Talk", "Sleep Powder", "Nightmare"}, 1);

        questions[7] = new Question(
            "<html>What is the signature move of <br>Marshadow?</html>", 8,
            new String[]{"Shadow Force", "Spectral Thief", "Phantom Force", "Shadow Sneak"}, 1);

        questions[8] = new Question(
            "<html>In competitive play, which item <br>allows a Pokémon to use a move without consuming PP?</html>", 9,
            new String[]{"Leftovers", "Leppa Berry", "PP Max", "Metronome"}, 1);

        questions[9] = new Question(
            "<html>Which NPC character created the Pokémon <br>storage system in the Hoenn region?</html>", 10,
            new String[]{"Lanette", "Bill", "Bebe", "Celio"}, 0);
        
        new QuizzQuestions(questions).setVisible(true);
    }
    
}
