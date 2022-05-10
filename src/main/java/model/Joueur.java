package model;
import javax.persistence.*;
@Entity
@Table(name="joueur")
public class Joueur {
	@Id
	@GeneratedValue
	private Integer idJ;
	private String age;
	private String email;
	private String adresse;
	private String Tel1;
	private String Tel2;
	private String nom;
	private String prenom;
	@ManyToOne
	@JoinColumn(name="idC")
	private Contrat contrat;
	@ManyToOne
	@JoinColumn(name="idA")
	private Agent agent;
	public Joueur() {
		super();
	}

	public Joueur(Integer idJ, String cIN, String age, String email, String adresse, String tel1, String tel2,
			String nom, String prenom, Contrat contrat) {
		super();
		this.idJ = idJ;
		this.age = age;
		this.email = email;
		this.adresse = adresse;
		Tel1 = tel1;
		Tel2 = tel2;
		this.nom = nom;
		this.prenom = prenom;
		this.contrat = contrat;
	}

	public Integer getIdJ() {
		return idJ;
	}

	public void setIdJ(Integer idJ) {
		this.idJ = idJ;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public String getTel1() {
		return Tel1;
	}

	public void setTel1(String tel1) {
		Tel1 = tel1;
	}

	public String getTel2() {
		return Tel2;
	}

	public void setTel2(String tel2) {
		Tel2 = tel2;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public Contrat getContrat() {
		return contrat;
	}

	public void setContrat(Contrat contrat) {
		this.contrat = contrat;
	}
	
}
