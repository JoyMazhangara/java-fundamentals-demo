package com.brightpaths.fundamentals;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public abstract class Droid {
    private final String serialNumber; //making this variable final b/c a droids serial number should never change
    private final Model model; //making this variable final ensures that we can't assign it any other model
    protected final List<Tool> tools; //making this protected allows us to access tools from super class, Droid in subclass, AstromechDroid


    public Droid(String serialNumber, Model model, List<Tool> tools) {
        this.serialNumber = serialNumber;
        this.model = model;
        this.tools = tools.stream().map(Tool::new).collect(Collectors.toList());
    }


    public void speak(){
        System.out.println("beep beep boop boop!");
    }


    //toString method
    public String toString() {
        return serialNumber + " " + model.toString();
    }

    //SETTERS
//    public void setSerialNumber(String serialNumber) {
//        this.serialNumber = serialNumber;
//    } removing this setter because a droids serial number should never be allowed to change after it's set

//    public void setModel(Model model) {
//        this.model = model;
//    } removing this setter because a droids model should never be allowed to change after it's set

    //GETTERS
    public String getSerialNumber() {
        return this.serialNumber;
    }

    public Model getModel() {
        return this.model;
    }
}

