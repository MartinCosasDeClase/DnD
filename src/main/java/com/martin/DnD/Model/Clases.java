package com.martin.DnD.Model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import java.util.List;

@Entity(name = "CLASES")
public class Clases {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;
    private String miniDescription;
    private String imagen;

    @OneToMany(mappedBy = "clase", cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    @JsonIgnoreProperties("clase")
    private List<SubClase> subclases;

    @OneToOne(mappedBy = "clase", cascade = CascadeType.ALL)
    @JsonIgnore
    private DetallesClase detallesClase;

    public Clases() {}

    public Clases(String name, long id, String miniDescription, List<SubClase> subclases, String imagen, DetallesClase detallesClase) {
        this.name = name;
        this.id = id;
        this.miniDescription = miniDescription;
        this.subclases = subclases;
        this.imagen = imagen;
        this.detallesClase = detallesClase;
    }

    public long getId() { return id; }
    public void setId(long id) { this.id = id; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public String getImagen() { return imagen; }
    public void setImagen(String imagen) { this.imagen = imagen; }
    public String getMiniDescription() { return miniDescription; }
    public void setMiniDescription(String miniDescription) { this.miniDescription = miniDescription; }
    public List<SubClase> getSubclases() { return subclases; }
    public void setSubclases(List<SubClase> subclases) { this.subclases = subclases; }
    public DetallesClase getDetallesClase() { return detallesClase; }
    public void setDetallesClase(DetallesClase detallesClase) { this.detallesClase = detallesClase; }
}
