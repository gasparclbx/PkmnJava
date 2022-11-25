package org.example.pojo;

import org.example.enumGlobal.Types;

public class Qualites {

    private String name;

    private float degres;

    private Types type;

    public Qualites(){
        name = "";
        degres = 0;
        type = Types.BLONDE;
    }

    public Qualites(String name, float degres, Types type) {
        this.name = name;
        this.degres = degres;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getDegres() {
        return degres;
    }

    public void setDegres(float degres) {
        this.degres = degres;
    }

    public Types getType() {
        return type;
    }

    public void setType(Types type) {
        this.type = type;
    }
}
