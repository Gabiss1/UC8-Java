/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package harrypotterjtable;

/**
 *
 * @author GABRIELGARCEZDEOLIVE
 */
public class HarryPotterJTable {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Student student1 = new Student("Gabiss", "Leal");
        Student student2 = new Student("Lucas", "Inteligente");
        Student student3 = new Student("Maria", "Astuta");
        Student student4 = new Student("Pedro", "Ousado");
        Student student5 = new Student("João", "Leal");
        Student student6 = new Student("Ana", "Inteligente");
        Student student7 = new Student("Carlos", "Astuto");
        Student student8 = new Student("Fernanda", "Ousada");
        Student student9 = new Student("Tiago", "Leal");
        Student student10 = new Student("Juliana", "Inteligente");
        Student student11 = new Student("Gabriel", "Astuto");
        Student student12 = new Student("Isabela", "Ousada");
        Student student13 = new Student("Rafael", "Leal");
        Student student14 = new Student("Beatriz", "Inteligente");
        Student student15 = new Student("Luís", "Astuto");
        Student student16 = new Student("Carla", "Ousada");
        
        Student[] students = {
            student1, student2, student3, student4, student5, 
            student6, student7, student8, student9, student10, 
            student11, student12, student13, student14, student15, student16
        };
        
        new School(students).setVisible(true);
    }
    
}
