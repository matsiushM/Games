package org.example.service;

import java.util.Stack;

public class Solution {

    public void getResult(){
        Fields fields = new Fields();
        Stack
        int[][] cells = fields.cell();
        int num = 0;
        int x = 0;
        int y = 0;

        int x1 = 1;
        int y1 = 1;

        do{
            if(cells[y][x] > cells[y1][x]) {
                System.out.println(cells[y1][x]);
                num += cells[y1][x];
                y = y1;
                y1++;
            }else if(cells[y][x] > cells[y][x1]) {
                System.out.println(cells[y][x1]);
                num += cells[y][x1];
                x = x1;
                x1++;
            }else if(cells[y1][x] == cells[y][x1]){
                System.out.println(cells[y][x1]);
                num += cells[y][x1];
                x = x1;
                x1++;
            }
        } while (x != 3 && y != 3);
         num += cells[3][3];
        System.out.println(num);

    }

}
