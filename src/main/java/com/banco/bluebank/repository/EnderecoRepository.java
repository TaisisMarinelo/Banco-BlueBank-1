package com.banco.bluebank.repository;

import com.banco.bluebank.model.Correntista;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.banco.bluebank.model.Endereco;

import java.util.List;

@Repository
public interface EnderecoRepository extends JpaRepository<Endereco, Long>{

}
