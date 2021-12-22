package com.brightpaths.fundamentals;

import java.util.List;

public class Tool {

    private final ToolType toolType;
    int durability;

    public Tool(Tool tool) {
        this.toolType = tool.getToolType();
        this.durability = tool.getDurability();
    }

    public ToolType getToolType() {
        return toolType;
    }

//    public void setToolType(ToolType toolType) {
//        this.toolType = toolType;
//    }  removing this setter to defend encapsulation, the type of tool shouldn't be changed after being made

    public enum ToolType {
        STARSHIP_REPAIR,
        RIFLE
    }



    public Tool(ToolType toolType) {
        this.toolType = toolType;
        this.durability = 3;
    }


//    public void setDurability(int durability) {
//        this.durability = durability;
//    } removing this to implement another method that will control a tool's durability loss whenever it's used

    public void useTool() {
        --durability;
        if(durability == 0) {
            System.out.println("tool broke");
        }
    }

    public int getDurability() {
        return this.durability;
    }
}
