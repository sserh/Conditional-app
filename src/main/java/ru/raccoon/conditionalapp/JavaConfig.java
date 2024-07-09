package ru.raccoon.conditionalapp;

import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import ru.raccoon.conditionalapp.profiles.DevProfile;
import ru.raccoon.conditionalapp.profiles.ProductionProfile;
import ru.raccoon.conditionalapp.profiles.SystemProfile;

@Configuration
public class JavaConfig {

    @Bean
    @ConditionalOnProperty (prefix = "raccoon.profile", value = "dev", havingValue = "true")
        public SystemProfile devProfile() {
        return new DevProfile();
    }

    @Bean
    @ConditionalOnProperty (prefix = "raccoon.profile", value = "dev", havingValue = "false")
    public SystemProfile prodProfile() {
        return new ProductionProfile();
    }
}
