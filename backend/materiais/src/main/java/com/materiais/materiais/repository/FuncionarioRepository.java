package com.materiais.materiais.repository;

import com.materiais.materiais.models.Funcionario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FuncionarioRepository  extends JpaRepository<Funcionario, Integer> {
}
