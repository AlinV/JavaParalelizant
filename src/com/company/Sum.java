package com.company;

public class Sum implements Runnable {
    private int[] v;
    private int id;

    Sum(int v[], int id)
    {
        this.v = v;
        this.id = id;
    }

    @Override
    public void run() {

        int s = 0;

        if (id==0) {
            for (int i=0; i<v.length/2; i++) {
                s = s + v[i];
            }
            Main.sumaFinala =   Main.sumaFinala  + s;
        }

        int s1=0;
        if (id==1) {
            for (int i=v.length/2; i<v.length; i++) {
                s1 = s1 + v[i];
            }
            Main.sumaFinala =   Main.sumaFinala  + s1;
        }



    }
}
