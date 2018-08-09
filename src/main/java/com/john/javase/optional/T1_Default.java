package com.john.javase.optional;

import org.junit.Test;

import java.util.Optional;

public class T1_Default {

    Person personNull = null;
    Person person = new Person();

    {
        person.setName("john");
    }


    @Test
    /**
     * if null return Default
     */
    public void nullOrDefault() {
        System.out.println(
                Optional.ofNullable(personNull).orElse(person));
        System.out.println(
                Optional.ofNullable(personNull).orElseGet(() -> person));
    }



    @Test
    /**
     * 不会逻辑短路
     */
    public void nullOrDefaultDo() {
        System.out.println(
                Optional.
                        ofNullable(getNull())
                        .orElse(getDefault()));
    }

    private Object getNull() {
        return new Object();
    }

    private Object getDefault() {
        System.out.println(" do default ");
        return new Object();
    }

}
