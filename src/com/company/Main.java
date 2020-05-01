package com.company;

public class Main {

    public static void main(String[] args) {
        int[][] array = new int[10][10];
        array[4][7] = 1;
        int a=0;
        for (int i = 1; i < array.length-1; i++) {
            for (int j = 1; j < array[i].length - 1; j++) {

                    if (array[i][j - 1] == 0 & array[i][j + 1] == 0 & array[i + 1][j] == 0 & array[i - 1][j] == 0 &
                            array[i+1][j+1]==0 & array[i-1][j-1]==0 & array[i-1][j+1]==0 & array[i+1][j-1]==0 & a<9) {
                        array[i][j] = 1;
                        a=a+1;
                    }

            }
        }
                for (int b=0; b<array.length; b++){
                    for(int t=0; t<array[b].length;t++) {
                        System.out.print(array[b][t] + " ");
                    }
                    System.out.println();
                }



    }
}