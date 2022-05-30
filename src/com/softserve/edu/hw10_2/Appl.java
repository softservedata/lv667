package com.softserve.edu.hw10_2;

import java.util.Arrays;
import java.util.Scanner;

public class Appl {
    public static int[] readNumber(int a, int b) {
        int[] arr=new int[10];
        int sc1 = 0;
        int count=10;
        try (Scanner sc = new Scanner(System.in)) {
            for (int i = 0; i < 10; i++) {
                System.out.println("Enter "+count+ " int number from the range from 1 to 100");
                sc1 = Integer.parseInt(sc.nextLine());
                count--;
                arr[i]=sc1;

                if (sc1 < a | sc1 > b) {
                    throw new IndexOutOfBoundsException("This number is out of the range [a,b] ->"+sc1);
                }
            }
        } catch (NumberFormatException e1) {
            System.out.println("Not string value " + e1);
           // e1.printStackTrace();
            return new int[]{-1};
        }catch (ArrayIndexOutOfBoundsException e2){
            System.out.println(e2);
         //   e2.printStackTrace();
            return new int[]{-2};
        } catch (IndexOutOfBoundsException e3){
            System.out.println(e3);
         //   e3.printStackTrace();
            return new int[]{-3};
        }finally {
            System.out.println("finnaly");

        }
        return arr;
    }

    public static void main(String[] args) {
        int x1=1;
        int x2=100;
        int[] arr1=readNumber(x1,x2);
        System.out.println(Arrays.toString(arr1));
    }

}
