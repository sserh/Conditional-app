package ru.raccoon.conditionalapp.profiles;

import org.springframework.context.annotation.Profile;

public class ProductionProfile implements SystemProfile {
    @Override
    public String getProfile() {
        return "Current profile is production";
    }
}