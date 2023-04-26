package com.materiais.materiais.repository;

import com.materiais.materiais.models.Material;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MaterialRepository  extends JpaRepository<Material, Integer> {

    //public List<Material> findMaterialList (Integer idFuncionario);

}
