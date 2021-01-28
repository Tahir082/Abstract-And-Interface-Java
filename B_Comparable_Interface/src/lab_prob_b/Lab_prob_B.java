/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab_prob_b;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author amtah
 */

class Player implements Comparable<Player>{
    String Name;
    int score;

    Player(String Name, int score) {
        this.Name = Name;
        this.score = score;
    }

    @Override
    public int compareTo(Player p) {
         if(score==p.score){
             return 0;
         }
         else if(score<p.score){
             return 1;
         }
         else{
             return -1;
         }
    }
}
public class Lab_prob_B {

    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        ArrayList<Player>playerList=new ArrayList<>(); 
        System.out.println("How many Players?");
        int n= in.nextInt();
        for(int i=0; i<n; i++){
            System.out.println("Type Player "+ (i+1)+" name:");
            in.nextLine();
            String name=in.nextLine();
            System.out.println("Type Player "+ (i+1)+" score:");
            int score= in.nextInt();
            playerList.add(new Player(name, score));
        }
        System.out.println("By sorting the scores of the players: ");
        Collections.sort(playerList);
        for(Player p: playerList){
            System.out.println(p.Name+ " "+ p.score);
        }
    }
    
}
