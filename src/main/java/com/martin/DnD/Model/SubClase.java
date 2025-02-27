package com.martin.DnD.Model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;

@Entity(name = "SUB_CLASES")

public class SubClase {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "NAME_SUBCLASE")
    private String nameSubClase;
    private String miniDescription;
    private String imagen;

    @ManyToOne
    @JoinColumn(name = "CLASE_ID")
    @JsonIgnoreProperties("clase")
    private Clases clase;

    public SubClase() {}
    public SubClase(long id, String nameSubClase, String miniDescription, String imagen, Clases clase) {
        this.id = id;
        this.nameSubClase = nameSubClase;
        this.miniDescription = miniDescription;
        this.imagen = imagen;
        this.clase = clase;
    }

    public long getId() { return id; }
    public void setId(long id) { this.id = id; }
    public String getNameSubClase() { return nameSubClase; }
    public void setNameSubClase(String nameSubClase) { this.nameSubClase = nameSubClase; }
    public String getMiniDescription() { return miniDescription; }
    public void setMiniDescription(String miniDescription) { this.miniDescription = miniDescription; }
    public String getImagen() { return imagen; }
    public void setImagen(String imagen) { this.imagen = imagen; }
    public Clases getClase() { return clase; }
    public void setClase(Clases clase) { this.clase = clase; }
}

