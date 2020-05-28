package com.day6;

public class Array_2D {
    public static void main(String[] args) {
        int twoD[][]=new int[4][5];
        for (int i=0;i<4;i++)
        {
            for (int j=0;j<5;j++)
            {
                twoD[i][j]=i*j+i*67+j^2;
            }
        }
        for (int i=0;i<4;i++)
        {
            for (int j=0;j<5;j++)
            {
                System.out.print(twoD[i][j]+"\t");
            }
            System.out.println();
        }

    }
}
