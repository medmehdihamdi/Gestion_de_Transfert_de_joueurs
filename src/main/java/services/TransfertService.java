package services;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import DAO.TransfertRepository;
import model.Transfert;

@Service
@Transactional
public class TransfertService{

	@Autowired
	TransfertRepository tansfertRepository;
	
	public List<Transfert> listAll(){
		return tansfertRepository.findAll();
	}
	
	public Transfert save(Transfert transfert) {
		return tansfertRepository.save(transfert);
	}
	
	public Transfert get(String id) {
		try {
			return tansfertRepository.findById(id).get();
		} catch (NoSuchElementException ex) {
			return null;
		}
	}
	
	
	
}
