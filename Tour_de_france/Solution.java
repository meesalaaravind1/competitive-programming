import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc= new Scanner(System.in);
        while(sc.hasNextLine()){
            double f= sc.nextDouble();
            if (f==0.0){
                break;
            }
            double r= sc.nextDouble();
            double [] ratios = new double [(int)(f*r)];
            int count=0;
            double [] fs=new double [(int)f];
            for (int i=0;i<(int)f;i++){
                fs[i]=sc.nextDouble();
            }
            double [] rs=new double [(int)r];
            for (int i=0;i<(int)r;i++){
                rs[i]=sc.nextDouble();
            }
            for (int i=0;i<f;i++){
                for (int j=0;j<r;j++){
                    ratios[count++]=fs[i]/rs[j];
                }
            }
            Arrays.sort(ratios);
            double max=0;
            for (int i=0;i<count-1;i++){
                double x = ratios[i+1]/ratios[i];
                if (x>max){
                    max=x;
                }
            }
            System.out.printf("%.2f%n", max);
        }
    }
}