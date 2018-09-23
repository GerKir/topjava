package ru.javawebinar.topjava.model;

import java.time.LocalDateTime;

public class UserMealWithExceed {
    private final LocalDateTime dateTime;

    private final String description;

    private final int calories;

    public LocalDateTime getDateTime() {
        return dateTime;
    }

    private final boolean exceed;

    @Override
    public String toString() {
        return String.format("data: %s, description: %s, calories: %s, exceed: %b", dateTime.toLocalDate(), description, calories, exceed);
    }

    public UserMealWithExceed(LocalDateTime dateTime, String description, int calories, boolean exceed) {
        this.dateTime = dateTime;
        this.description = description;
        this.calories = calories;
        this.exceed = exceed;
    }
}
