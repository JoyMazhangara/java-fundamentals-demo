package com.brightpaths.fundamentals;

public class Model {
    private final String type;
    private final String purpose;
    public Model(String type, String purpose) {
        this.type = type;
        this.purpose = purpose;
    }

    public String getType() {
        return type;
    }

//    public void setType(String type) {
//        this.type = type;
//    } A model's type shouldn't be allowed to change after it's been set

    public String getPurpose() {
        return purpose;
    }

//    public void setPurpose(String purpose) {
//        this.purpose = purpose;
//    } A model's purpose shouldn't be allowed to change after it's been set

    @Override
    public String toString() {
        return "Model : [" +
                "type='" + type + '\'' +
                ", purpose='" + purpose + '\'' +
                ']';
    }
}
