package model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.annotation.Id;

@Entity
@Table(name="Contrat")
public class Contrat {
	@Id
	@GeneratedValue
	private String idC;
	private String dateDebut;
	private String Duree;
	private String adresse;
	private Double prix;
	private int nbreChambre;
	private String CIN;

	@OneToMany(mappedBy="contrat")
	List<Client> client;
	@OneToMany(mappedBy="contra")
	List<Transfert> transfert;
	public Contrat() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Contrat(String idC, String dateDebut, String duree, String adresse, Double prix, int nbreChambre,
			String CIN,List<Client> client, List<Transfert> transfert) {
		super();
		this.idC = idC;
		this.dateDebut = dateDebut;
		this.Duree = duree;
		this.adresse = adresse;
		this.prix = prix;
		this.nbreChambre = nbreChambre;
		this.CIN=CIN;
		this.client = client;
		this.transfert = transfert;
	}
	public String getIdC() {
		return idC;
	}
	public void setIdC(String idC) {
		this.idC = idC;
	}
	public String getDateDebut() {
		return dateDebut;
	}
	public void setDateDebut(String dateDebut) {
		this.dateDebut = dateDebut;
	}
	public String getDuree() {
		return Duree;
	}
	public void setDuree(String duree) {
		Duree = duree;
	}
	public String getAdresse() {
		return adresse;
	}
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	public Double getPrix() {
		return prix;
	}
	public void setPrix(Double prix) {
		this.prix = prix;
	}
	public int getNbreChambre() {
		return nbreChambre;
	}
	public void setNbreChambre(int nbreChambre) {
		this.nbreChambre = nbreChambre;
	}
	public String getCIN() {
		return CIN;
	}
	public void setCIN(String cIN) {
		CIN = cIN;
	}
	public List<Client> getClient() {
		return client;
	}
	public void setClient(List<Client> client) {
		this.client = client;
	}
	public List<Transfert> getTransfert() {
		return transfert;
	}
	public void setTransfert(List<Transfert> transfert) {
		this.transfert = transfert;
	}
	
}

