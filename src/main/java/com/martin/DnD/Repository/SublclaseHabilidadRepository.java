package com.martin.DnD.Repository;

import com.martin.DnD.Model.SubclaseHabilidad;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface SublclaseHabilidadRepository extends JpaRepository<SubclaseHabilidad, Long> {
}
