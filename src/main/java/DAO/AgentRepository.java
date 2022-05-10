package DAO;

import org.springframework.data.jpa.repository.JpaRepository;

import model.Agent;

public interface AgentRepository extends JpaRepository<Agent,String> {

}
