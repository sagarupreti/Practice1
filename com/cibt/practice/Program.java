package com.cibt.practice;

public class Program{

    public static void print(int end){
        for(int i=1;i<=end;i++){
            System.out.println(i);
        }
    }

    public static void printRecursive(int start,int end){
        System.out.println(start);
        if(start<end){
            printRecursive(++start,end);
        }
    }

    public static int sum(int end){
        int total=0;
        for(int i=1;i<=end;i++){
            total +=i;
        }
        return total;
    }

    public static int sumRecursive(int end){
        if(end==1){
            return 1;
        }
        return end + sumRecursive(--end);
    }
    public static void main(String[] args){
        print(5);
        System.out.println("----------------------------");
        printRecursive(1,9);
        System.out.println("----------------------------");
        System.out.println(sum(5));
        System.out.println("----------------------------");
        System.out.println(sumRecursive(6));
    }
}