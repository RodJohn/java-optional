package com.john.javase.optional;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Optional;

public class T3_Map {

    Person personNull = null;
    Person person = new Person();
    Person personWithPet = new Person();

    {
        person.setName("john");
        Pet pet = new Pet();
        pet.setName("alf");
        personWithPet.setPet(pet);
    }


    @Test
    /**
     * if null in the stream return Default
     */
    public void nullOrDefaultMap() {
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
        System.out.println(
                Optional.ofNullable(personWithPet)
                        .map(person -> person.getPet())
                        .map(pet -> pet.getName())
                        .orElse("默认的宠物"));
    }


    @Test
    /**
     * if null in the stream return Default
     */
    public void nullOrDefaultFilter() {
        System.out.println(
                Optional.ofNullable(personWithPet)
                        .map(person -> person.getPet())
                        .map(pet -> pet.getName())
                        .filter(name -> !name.equals("alf"))
                        .orElse("默认的宠物"));
    }

    @Test
    /**
     * if other exception ,will be throw at once
     */
    public void otherException() {

        ArrayList<Object> arrayList = new ArrayList<>();
        ArrayList<Object> nullList = null;

        System.out.println(Optional.ofNullable(arrayList).filter(list -> list.size() > 0).map(list -> list.get(0)).orElse(null));
        System.out.println(Optional.ofNullable(nullList).filter(list -> list.size() > 0).map(list -> list.get(0)).orElse(null));

        System.out.println(Optional.ofNullable(nullList).map(list -> list.get(0)).orElse(null));
        System.out.println(Optional.ofNullable(arrayList).map(list -> list.get(0)).orElse(null));
        // 数组下标越界异常

    }


}
