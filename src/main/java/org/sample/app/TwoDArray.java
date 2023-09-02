package org.sample.app;

public class TwoDArray {

    private int[][] twoDArr;
    private final int ROWS;
    private final int COLUMNS;
    TwoDArray(int rows, int columns){
        this.ROWS = rows;
        this.COLUMNS = columns;
    }

    public static void main(String[] args){
        TwoDArray twoDArray = new TwoDArray(2,2);
        twoDArray.initialize();
        twoDArray.print();
    }

    public void initialize(){
        twoDArr = new int[this.ROWS][this.COLUMNS];
        int value = 1;
        for(int i = 0; i< twoDArr.length; i++){
            for(int j = 0; j< twoDArr[i].length; j++){
                twoDArr[i][j] = value;
                value++;
            }
        }
    }

    public void print(){
        for(int i = 0; i< twoDArr.length; i++){
            for(int j = 0; j< twoDArr[i].length; j++){
                System.out.println("["+i +" "+ j+"] => "+ twoDArr[i][j]);
            }
        }
    }

}
