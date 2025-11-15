package com.live.DashbaordConsumer.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
//
//@Getter
//@Setter
//@NoArgsConstructor
//@AllArgsConstructor
public class Dashboard {
    private String name;
    private String design;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesign() {
        return design;
    }

    public void setDesign(String design) {
        this.design = design;
    }
}
