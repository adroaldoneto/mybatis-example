package br.com.mybatis.example.model;


import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Setter
@Getter

public class User implements Serializable {

    private static final long serialVersionUID = -445232858382091042L;

    private String user;
    private String pass;

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
