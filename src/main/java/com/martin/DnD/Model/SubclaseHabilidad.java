package com.martin.DnD.Model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;

@Entity(name = "SUBCLASE_HABILIDAD")
public class SubclaseHabilidad {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(nullable = false)
    private String habilidadNombre;

    private String habilidadDescripcion;

    @ManyToOne
    @JoinColumn(name = "SUBCLASE_ID", nullable = false)
    @JsonIgnoreProperties("habilidades")
    private SubClase subclase;

    public SubclaseHabilidad() {}

    public SubclaseHabilidad(long id, String habilidadNombre, String habilidadDescripcion, SubClase subclase) {
        this.id = id;
        this.habilidadNombre = habilidadNombre;
        this.habilidadDescripcion = habilidadDescripcion;
        this.subclase = subclase;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getHabilidadNombre() {
        return habilidadNombre;
    }

    public void setHabilidadNombre(String habilidadNombre) {
        this.habilidadNombre = habilidadNombre;
    }

    public String getHabilidadDescripcion() {
        return habilidadDescripcion;
    }

    public void setHabilidadDescripcion(String habilidadDescripcion) {
        this.habilidadDescripcion = habilidadDescripcion;
    }

    public SubClase getSubclase() {
        return subclase;
    }

    public void setSubclase(SubClase subclase) {
        this.subclase = subclase;
    }
}
