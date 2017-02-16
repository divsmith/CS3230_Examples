package edu.weberstate.cs3230;

/**
 * Created by parker on 2/13/17.
 */
public class FooBar<E extends Fiz> {

    private E obj;

    public void set(E obj)
    {
        this.obj = obj;
    }

    public E get()
    {
        return obj;
    }
}
