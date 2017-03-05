package edu.weberstate.cs3230;

public class Main {

    public static void main(String[] args) {
	// write your code here
    }

    public static int countWaysToJump(int n) {

        if (n < 0)
        {
            return -1;
        }

        if (n == 1 || n == 0)
        {
            return n;
        }

        int a = 1;
        int b = 1;
        int temp;

        for (int x = n - 1; x > 0; x--)
        {
            temp = b;
            b = b + a;
            a = temp;
        }

        return b;
    }
}
