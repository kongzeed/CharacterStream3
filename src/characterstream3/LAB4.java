/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package characterstream3;

import java.io.*;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Student
 */
public class LAB4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            FileReader file = new FileReader("data.txt");
            Scanner input = new Scanner(file);
            String name = input.nextLine();
            System.out.println(name);
            int age = input.nextInt();
            System.out.println(age);
            double weight = input.nextDouble();
            System.out.println(weight);
            double height = input.nextDouble();
            System.out.println(height);    
        } catch (FileNotFoundException ex) {
            Logger.getLogger(LAB4.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
