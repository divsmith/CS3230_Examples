package edu.weberstate.cs3230;

/**
 * Created by parker on 3/2/17.
 */
public interface Demo {
    default String defaultMethod()
    {
        return "stuff";
    }
}
