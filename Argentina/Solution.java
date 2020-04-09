import java.io.*;
import java.util.*;
class Player implements Comparable<Player>{
    String name;
    int attack;
    int defend;

    Player(String n, int a,int d){
        this.name = n;
        this.attack = a;
        this.defend = d;
    }

    public int compareTo(Player that){
        if (this.attack>that.attack){
            return 1;
        }
        else if (this.attack<that.attack){
            return -1;
        }
        else{
            if (this.defend>that.defend){
                return -1;
            }
            else if (this.defend<that.defend){
                return 1;
            }
            else{
                return 0;
            }
        }
    }
}

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc= new Scanner(System.in);
        while (sc.hasNextLine()){
            int t= Integer.parseInt(sc.nextLine());
            Player[] team = new Player[10];
            for (int j=0;j<t;j++){
                for (int i=0;i<10;i++){
                String[] n = sc.nextLine().split(" ");
                String na=n[0];
                int a= Integer.parseInt(n[1]);
                int d= Integer.parseInt(n[2]);
                team[i]=new Player(na,a,d);
                }
                Arrays.sort(team);
                String [] attackers = new String [5];
                String [] defenders = new String [5];
                for (int i=0;i<5;i++){
                    attackers[i] = team[i].name;
                    defenders[i] = team[i+5].name;
                }

                Arrays.sort(attackers);
                Arrays.sort(defenders);
                String sb1= "(";
                String sb2= "(";
                for (int i=0;i<5;i++){
                    if (i!=0){
                        sb1+=(", ");
                        sb2+=(", ");
                    }
                    sb1+=attackers[i];
                    sb2+=defenders[i];
                }
                sb1+=(")");
                sb2+=(")");
                System.out.println("Case "+(j+1)+":");
                System.out.println(sb2);
                System.out.println(sb1);
            }
        }
    }
}