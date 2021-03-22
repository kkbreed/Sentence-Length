/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sentencelength;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class SentenceLength {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        /*
        Create a Java application called “SentenceLength” (without the quotation marks)
        that requests a String from the user at the command line and finds its length. 
        Be sure to take the entire String, whitespace included, and use the suitable
        method for determining the length of the String. Your program should output:
        “Your string has a length of X characters.” Where X is the String’s length.
        */
    Scanner scnr = new Scanner(System.in);
    
    System.out.print("Enter your sentence: ");
    String sentence = scnr.nextLine();  /* using scnr.nextline lets me include spaces
    in the .length count*/ 
    
    //int StringSentence = sentence.length();
    
    System.out.println("Your string has a length of " + sentence.length() + " characters.");

    }
    
}
