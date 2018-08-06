package com.john.javase.optional;

import org.junit.Test;

import java.util.Optional;

public class T1 {

    Person personNull = null;
    Person personDefault = new Person();

    {
        personDefault.setName("john");
    }


    @Test
    public void nullOrDefault() {
        System.out.println(
                Optional.ofNullable(personNull)
                        .orElse(personDefault).getName());
    }


}
