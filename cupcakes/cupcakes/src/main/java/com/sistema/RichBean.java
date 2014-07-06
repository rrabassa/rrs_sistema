package com.sistema;

import java.io.Serializable;

public class RichBean implements Serializable {

    private static final long serialVersionUID = -2403138958014741653L;
    private String name;

    public RichBean() {-0s
        System.out.println("post construct: initialize");
        name = "John Bull";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
