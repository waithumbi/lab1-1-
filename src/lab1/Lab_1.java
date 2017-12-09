/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1;

import java.util.Scanner;

/**
 *
 * @author NjeriWaithumbi
 * 
 */
public class Lab_1 {
    public static class printer{
        public static String printerout(String text){    
System.out.println("Your text is "+text);
return text;}
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try{
        String input ="is";
        int user_input=Integer.parseInt(input);
    }catch(NumberFormatException NFE){
            System.err.println(NFE.getMessage());
            System.out.println("wrong input");
    }catch(Exception ex){
            System.err.println(ex.getMessage());
            System.out.println("wrong input");
    }
 
                Scanner scan = new Scanner(System.in);
System.out.println("Please input text to output: ");
printer.printerout(scan.nextLine());
    
    }
}

