package com.dave.java.innerclazz.controller;

import java.time.Duration;
import java.time.Instant;

public abstract class Event {
    private Instant eventTime;
    protected final Duration delayTime;

    public Event(long delayTime) {
        this.delayTime = Duration.ofMillis(delayTime);
        start();
    }
    public void start() {
        eventTime = Instant.now().plus(delayTime);
    }

    public boolean ready() {
        return Instant.now().isAfter(eventTime);
    }

    public abstract void action();
}
