package com.company;

import javax.management.monitor.MonitorMBean;
import java.util.Scanner;

public class Main {
    public static int sumaFinala;



    public static void main(String[] args) throws InterruptedException {
                // write your code here

        Scanner sc = new Scanner(System.in);
        System.out.print("Dimensiunea vectorului:");
        int n = sc.nextInt();

        System.out.println("Tasteaza elementele vectorului:");
        int v[] = new int [n];
        for (int i=0; i<n; i++)
            v[i] = sc.nextInt();



        Thread gandalf = new Thread(new Sum(v,0));
        Thread dumbledore = new Thread((new Sum(v, 1)));




        gandalf.start();
        dumbledore.start();

        gandalf.join();
        dumbledore.join();

        System.out.println("Suma Finala: " + sumaFinala);
    }
}
