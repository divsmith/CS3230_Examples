package edu.weberstate.cs3230;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        FooBar<Integer> myInts = new FooBar<Integer>();

        myInts.set(1);
        System.out.println(myInts.get());

        Biz biz = new Biz();
        FooBar<Fiz> myBiz = new FooBar<>();
        myBiz.set(biz);
        System.out.println(biz.equals(myBiz.get()));
    }

    double getDouble()
    {
        double result;

        for (int i = 0; i < 10; i++);
        {
            result += i;
        }

        return result;
    }
}
