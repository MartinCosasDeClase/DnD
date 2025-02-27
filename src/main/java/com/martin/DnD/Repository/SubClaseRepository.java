package com.martin.DnD.Repository;

import com.martin.DnD.Model.SubClase;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface SubClaseRepository extends JpaRepository<SubClase, Integer> {
}
