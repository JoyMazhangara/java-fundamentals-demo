package com.brightpaths.fundamentals;

import java.util.List;
import java.util.Optional;

 public class AstromechDroid extends Droid implements Defender {

     public AstromechDroid(String serialNumber, Model model, List<Tool> tools) {
         super(serialNumber, model, tools);
     }



     //R2D2 needs a way to use his repair tools
    public void repairStarship() {
        Optional<Tool> repairToolOptional = tools.stream()
                .filter(tool -> tool.getToolType()
                        .equals(Tool.ToolType.STARSHIP_REPAIR) && tool.getDurability() >= 1)
                .findFirst();

        if (repairToolOptional.isPresent()) {
            Tool repairTool = repairToolOptional.get();
            repairTool.useTool();
            System.out.println("Starship Repaired");
            if (repairTool.getDurability() == 0) {
                System.out.println("tool broke");
                tools.remove(repairTool);
            }
        } else {
            System.out.println("No tool available, starship still needs repairs");
        }
    }
}
