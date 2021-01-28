/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab_prob_c;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author amtah
 */
public class Lab_prob_C {
    public static void main(String[] args) {
        System.out.println("Type how many lines:");
        Scanner in= new Scanner(System.in);
        int lines= in.nextInt();
        ArrayList<Integer> list= new ArrayList<>();
        ArrayList<ArrayList> list_2=new ArrayList<>();
        for(int i=0; i<lines; i++){
            System.out.println("Line "+(i+1)+": ");
            System.out.println("How Many numbers?");
            int nums=in.nextInt();
            System.out.println("Type the numbers: ");
            for(int j=0; j<lines; j++){
                list.add(new Integer(in.nextInt()));
            }
            list_2.add(list);
        }
        
        while(true){
            System.out.println("Run a query!! [Line Position, number position]");
            int line_pos= in.nextInt();
            int num_pos= in.nextInt();
            int get_size=list_2.get(line_pos).size();
            if(num_pos>get_size){
                System.out.println("ERROR!!!");
            }
            else{
                System.out.println(list_2.get(line_pos).get(num_pos));
            }
            
        }
        
        
        
    }
    
}
