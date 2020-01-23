/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projecttest;

import java.util.Scanner;

/**
 *
 * @author Anjali Panchal
 */
public class ProjectTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner(System.in);
        System.out.println("HI");
		String movie[] = new String[3];
		for (int i = 0; i < movie.length ; i++) {
			System.out.println("Enter 3 movies");
			movie[i] = in.nextLine();
		}
		for (int i = 0; i < movie.length; i++) {
			System.out.println("The movies given are : " + movie[i]);
		}
    }
    
}
