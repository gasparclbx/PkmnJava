package org.example.pojo;

import org.example.enumGlobal.Types;

public class Bieres {

    private int nombre;

    private float prix;

    private Types type;

    private Qualites qualites;

    public Bieres(){
        nombre = 0;
        this.type = Types.BLONDE;
        qualites = new Qualites();
    }

    public Bieres(int nombre, float prix, Types type, Qualites qualites) {
        this.nombre = nombre;
        this.type = type;
        this.qualites = qualites;
    }

    public int getNombre() {
        return nombre;
    }

    public void setNombre(int nombre) {
        this.nombre = nombre;
    }

    public Types getType() {
        return type;
    }

    public void setType(Types type) {
        this.type = type;
    }

    public Qualites getQualites() {
        return qualites;
    }

    public void setQualites(Qualites qualites) {
        this.qualites = qualites;
    }

    @Override
    public String toString() {
        return "Donc si je résume tu prends" + this.qualites + "je possède" + this.nombre + "Et le prix sera de:" + prix;
    }
}
