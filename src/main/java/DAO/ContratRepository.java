package DAO;

import org.springframework.data.jpa.repository.JpaRepository;

import model.Contrat;

public interface ContratRepository extends JpaRepository<Contrat,String> {

}
