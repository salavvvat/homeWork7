package com.company;

public class Medic extends Hero{
    @Override
    public String ApplySuperAbility(String superAbility) {
        return "medic used " + superAbility;
    }
}
