package ru.raccoon.conditionalapp.profiles;

import org.springframework.context.annotation.Profile;

public class DevProfile implements SystemProfile {
    @Override
    public String getProfile() {
        return "Current profile is dev";
    }
}