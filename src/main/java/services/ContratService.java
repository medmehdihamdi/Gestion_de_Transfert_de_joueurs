package services;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;

import model.Contrat;


public class ContratService {
	@Autowired
	DAO.ContratRepository ContratRepository;
	
	public List<Contrat> listAll(){
		return ContratRepository.findAll();
	}
	
	public Contrat save(Contrat contrat) {
		return ContratRepository.save(contrat);
	}
	
	public Contrat get(String id) {
		try {
			return ContratRepository.findById(id).get();
		} catch (NoSuchElementException ex) {
			return null;
		}
	}
	
	public void delete(Contrat contrat) {
		ContratRepository.delete(contrat);
	}
}
