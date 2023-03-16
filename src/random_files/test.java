package random_files;

import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class test {

    public int water ;
    public int milk;
    public int coffee ;


    public void init(int w, int m , int c){

        this.water = w ;
        this.milk = m ;
        this.coffee = c;
    }


    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        // spaties

        int d1 = scanner.nextInt();
        int d2 = scanner.nextInt();
        int d3 = scanner.nextInt();
        int d4 = scanner.nextInt();
        System.out.println("number that was inputted " + d1  + d2 + d3 +  d4 );

        // zonder spaties
        int num = scanner.nextInt();
        System.out.println("number that was inputted " + num );

        int d11 = num/1000;
        int d22 = (num / 100) % 10;
        int d33 = (num / 10 ) % 10 ;
        int d44 = (num %10);

        System.out.println(d11 + d22  + d33  + d44 );

        if((d11 == d44) && (d22 == d33 )){
            System.out.println("1");
        }else{
            System.out.println("false ");
        }

        /*
        String gfg[] = {"Geeks", "for", "Geeks"};
        System.out.println(Arrays.toString(gfg));

        int size = gfg.length; // 3
        System.out.print("[");
        for(int i = 0 ; i < size ; i++ ){
            // i = 0
            // i = 1
            // i = 2
            // i = 3
            System.out.print(gfg[i] + ", ");
        }
        System.out.print("]"); */
    }
}

