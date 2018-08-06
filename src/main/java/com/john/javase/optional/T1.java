package com.john.javase.optional;

import org.junit.Test;

import java.util.Optional;

public class T1 {

    Person personNull = null;
    Person person = new Person();
    Person personWithPet = new Person();

    {
        person.setName("john");
        Pet pet = new Pet();
        personWithPet.setPet(pet);
    }


    @Test
    /**
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
                Optional.ofNullable(personNull).orElseThrow(new NotFoundException(" no such  person ")));
    }


    @Test
    /**
     * if null return Default
     */
    public void nullOrDefault() {
        System.out.println(
                Optional.ofNullable(personNull).orElse(person));
        System.out.println(
                Optional.ofNullable(personNull).orElseGet(() -> person ));
    }


    @Test
    /**
     * if null in the stream return Default
     */
    public void nullOrDefault1() {
        System.out.println(
                Optional.ofNullable(personNull)
                        .map(person -> person.getPet())
                        .map(pet -> pet.getName())
                        .orElse("默认的宠物"));
        System.out.println(
                Optional.ofNullable(person)
                        .map(person -> person.getPet())
                        .map(pet -> pet.getName())
                        .orElse("默认的宠物"));
    }


}
