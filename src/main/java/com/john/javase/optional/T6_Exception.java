package com.john.javase.optional;

import org.junit.Test;

import java.util.Optional;

public class T6_Exception {

    Person personNull = null;
    Person person = new Person();

    {
        person.setName("john");
    }


    @Test
    /**
     * of()
     * if null return  NullPointException
     */
    public void null1() {
        System.out.println(
                Optional.of(personNull).orElse(person));
    }

   @Test
    /**
     * get()
     * if null return  NoSuchElementException
     */
    public void nullAndGet() {
        System.out.println(
                Optional.ofNullable(personNull).get());
    }

    @Test
    /**
     * if null return  Exception
     */
    public void nullAndThrow() {
        System.out.println(
                Optional.ofNullable(person).orElseThrow(new NotFoundException(" no such  person ")));
    }

}
