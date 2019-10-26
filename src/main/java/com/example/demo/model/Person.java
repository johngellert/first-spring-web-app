package com.example.demo.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.UUID;

public class Person {
    private final UUID id;
    private final String name;

    public Person(@JsonProperty("id") UUID newId,
                  @JsonProperty("nam") String newName){
        id = newId;
        name = newName;
    }

    public UUID getId() {
        return id;
    }

    public String getName(){
        return name;
    }


}
