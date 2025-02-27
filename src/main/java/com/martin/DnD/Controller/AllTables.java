package com.martin.DnD.Controller;

import com.martin.DnD.Model.Clases;
import com.martin.DnD.Model.DetallesClase;
import com.martin.DnD.Model.SubClase;
import com.martin.DnD.Model.SubclaseHabilidad;
import com.martin.DnD.Repository.ClaseRepository;
import com.martin.DnD.Repository.DetallesClaseRepository;
import com.martin.DnD.Repository.SubClaseRepository;
import com.martin.DnD.Repository.SublclaseHabilidadRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class AllTables {
    @Autowired
    private ClaseRepository claseRepository;
    @Autowired
    private SubClaseRepository subClaseRepository;
    @Autowired
    private DetallesClaseRepository detallesClaseRepository;
    @Autowired
    private SublclaseHabilidadRepository sublclaseHabilidadRepository;


    @GetMapping("/clases")
    public List<Clases> getClases() {
        return claseRepository.findAll();
    }
    @PostMapping("/clases")
    public Clases createClase(@RequestBody Clases clase) {
        return claseRepository.saveAndFlush(clase);
    }
    @PutMapping("/clases/{id}")
    public Clases updateClase(@PathVariable Long id, @RequestBody Clases clase) {
        clase.setId(id);
        return claseRepository.save(clase);
    }
    @DeleteMapping("/clases/{id}")
    public void deleteClase(@PathVariable Long id) {
        claseRepository.deleteById(id);
    }

    @GetMapping("/subclases")
    public List<SubClase> getSubClases() {
        return subClaseRepository.findAll();
    }
    @PostMapping("/subclases")
    public SubClase createSubClase(@RequestBody SubClase subClase) {
        return subClaseRepository.save(subClase);
    }
    @PutMapping("/subclases/{id}")
    public SubClase updateSubClase(@PathVariable Long id, @RequestBody SubClase subClase) {
        subClase.setId(id);
        return subClaseRepository.save(subClase);
    }
    @DeleteMapping("/subclases/{id}")
    public void deleteSubClase(@PathVariable int id) {
        subClaseRepository.deleteById(id);
    }


    @GetMapping("/detalles")
    public List<DetallesClase> getDetallesClases() {
        return detallesClaseRepository.findAll();
    }
    @PostMapping("/detalles")
    public DetallesClase createDetallesClase(@RequestBody DetallesClase detallesClase) {
        return detallesClaseRepository.save(detallesClase);
    }
    @PutMapping("/detalles/{id}")
    public DetallesClase updateDetallesClase(@PathVariable Long id, @RequestBody DetallesClase detallesClase) {
        detallesClase.setId(id);
        return detallesClaseRepository.save(detallesClase);
    }
    @DeleteMapping("/detalles/{id}")
    public void deleteDetallesClase(@PathVariable int id) {
        detallesClaseRepository.deleteById(id);
    }

    @GetMapping("/habilidad")
    public List<SubclaseHabilidad> getSubclaseHabilidad() {
        return sublclaseHabilidadRepository.findAll();
    }
    @PostMapping("/habilidad")
    public SubclaseHabilidad createSubclaseHabilidad(@RequestBody SubclaseHabilidad subclaseHabilidad) {
        return sublclaseHabilidadRepository.save(subclaseHabilidad);
    }
    @PutMapping("/habilidad/{id}")
    public SubclaseHabilidad updateSubclaseHabilidad(@PathVariable Long id, @RequestBody SubclaseHabilidad subclaseHabilidad) {
        subclaseHabilidad.setId(id);
        return sublclaseHabilidadRepository.save(subclaseHabilidad);
    }
    @DeleteMapping("/habilidad/{id}")
    public void deleteSubclaseHabilidad(@PathVariable Long id) {
        sublclaseHabilidadRepository.deleteById(id);
    }
}
