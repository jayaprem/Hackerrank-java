prblm:
Given an array of  n Player objects, write a comparator that sorts them in order of decreasing score;
if 2 or more players have the same score, sort those players alphabetically by name. To do this, you must create a Checker class that implements the Comparator interface,
then write an int compare(Player a, Player b) method implementing the Comparator.compare(T o1, T o2) method.
Input:
5
amy 100
david 100
heraldo 50
aakansha 75
aleksa 150

Output:
aleksa 150
amy 100
david 100
aakansha 75
heraldo 50

import java.util.*;

class Checker implements Comparator<Player>
{
    @Override
  public int compare(Player a,Player b)
   {
       if(a.score==b.score) return a.name.compareTo(b.name);
       else return b.score-a.score;
   } 
}

class Player{
    String name;
    int score;
    
    Player(String name, int score){
        this.name = name;
        this.score = score;
    }
}

class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        Player[] player = new Player[n];
        Checker checker = new Checker();
        
        for(int i = 0; i < n; i++){
            player[i] = new Player(scan.next(), scan.nextInt());
        }
        scan.close();
     
        Arrays.sort(player, checker);
        for(int i = 0; i < player.length; i++){
            System.out.printf("%s %s\n", player[i].name, player[i].score);
        }
    }
}
