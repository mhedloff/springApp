package com.example.springapp.controllers;

import java.time.LocalDateTime;

public class SearchFilter {
    private LocalDateTime start;
    private LocalDateTime end;

    public SearchFilter() {
        // json transformations
    }

    public LocalDateTime getStart() {
        return start;
    }

    public void setStart(LocalDateTime start) {
        this.start = start;
    }

    public LocalDateTime getEnd() {
        return end;
    }

    public void setEnd(LocalDateTime end) {
        this.end = end;
    }
}
