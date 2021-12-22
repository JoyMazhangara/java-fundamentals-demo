package com.brightpaths.fundamentals;

import java.util.Map;

    public class ModelFactory {

        public enum ModelType {
            ASTROMECH, PROTOCOL, BATTLE
        }

        private static Map<ModelType, Model> modelMap = Map.of(
                ModelType.ASTROMECH, new Model("Astromech", "Starship repair/support"),
                ModelType.PROTOCOL, new Model("Protocol", "tbd"),
                ModelType.BATTLE, new Model("Battle", "tbd")
        );
        public static Model getModel(ModelType modelName) {
            return modelMap.get(modelName);
        }

    }
