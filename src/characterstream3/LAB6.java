/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package characterstream3;

import java.util.Scanner;

/**
 *
 * @author Student
 */
public class LAB6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter name: ");
        String name = input.nextLine();
        System.out.println(name);
        System.out.println("Enter age: ");
        int age = input.nextInt();
        System.out.println(age);
        System.out.println("Enter height: ");
        double height = input.nextDouble();
        System.out.println(height);
    }
    
    
}
