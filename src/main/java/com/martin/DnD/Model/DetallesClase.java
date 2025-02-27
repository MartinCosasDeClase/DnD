package com.martin.DnD.Model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import java.util.List;

@Entity(name = "DETALLES_CLASE")

public class DetallesClase {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "DESCRIPCION_LARGA")
    private String descripcionLarga;
    private String estadisticas;

    @OneToOne
    @JoinColumn(name = "CLASE_ID")
    @JsonIgnoreProperties("clase")
    private Clases clase;

    public DetallesClase() {}
    public DetallesClase(long id, String descripcionLarga, String estadisticas, Clases clase) {
        this.id = id;
        this.descripcionLarga = descripcionLarga;
        this.estadisticas = estadisticas;
        this.clase = clase;
    }

    public long getId() { return id; }
    public void setId(long id) { this.id = id; }
    public String getDescripcionLarga() { return descripcionLarga; }
    public void setDescripcionLarga(String descripcionLarga) { this.descripcionLarga = descripcionLarga; }
    public String getEstadisticas() { return estadisticas; }
    public void setEstadisticas(String estadisticas) { this.estadisticas = estadisticas; }
    public Clases getClase() { return clase; }
    public void setClase(Clases clase) { this.clase = clase; }
}