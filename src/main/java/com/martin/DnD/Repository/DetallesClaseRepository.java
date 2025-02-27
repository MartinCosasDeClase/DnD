package com.martin.DnD.Repository;

import com.martin.DnD.Model.DetallesClase;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface DetallesClaseRepository extends JpaRepository<DetallesClase, Integer> {
}
