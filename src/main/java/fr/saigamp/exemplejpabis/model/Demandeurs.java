package fr.saigamp.exemplejpabis.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
//@Table(name="demandeurs")
public class Demandeurs {
	
	
	@Id
	@GeneratedValue
	@Column(name="id_demandeurs", unique = true, nullable = false)
	private int idDemandeurs;
	
	@ManyToOne
	private Squat squat;
	
	@Column(name="NB_DEM",  nullable=false)
	private int nbDem; //		Nombre de demandeurs	entier	zone de saisie 2 positions
	
	@Column(name="COUPLE_DEM",  nullable=false)
	private Boolean coupleDem; //		Les 2 demandeurs sont ils un couple	OUINON	case à cocher
	
	@Column(name="FRATRIE_DEM",  nullable=false)
	private Boolean fratrieDem; //		Les demandeurs sont-ils frères et sœurs	OUINON	case à cocher
	
	@Column(name="LIEN_DEM",  nullable=false)
	private String lienDem; //		Précisez le lien entre les demandeurs	Texte 50 char	zone texte
				
	
	@Column(name="TYPE_DEM_N",  nullable=false)
	private String typeDemN; //		Profil du demandeur	Type_Dem	
	
	@Column(name="TYPE_DEM_DET_N",  nullable=false)
	private String typeDemDetNn; //		Préciser le type de demandeur autre	Texte 50 char	zone texte 
	
	@Column(name="DEPT_DOMIC_DEM_N" )
	private String deptDomicDemN; //		Département du domicile du demandeur	Dept	menu déroulant - Possibilité recherche par code dpt  ou alpha sur département ; classés par ordre alphabétique
	
	@Column(name="SEXE_DEM_N",  nullable=false)
	private String sexeDemN; //		Sexe du demandeur	Sexe	menu déroulant
	
	@Column(name="DA_NAIS_DEM_N")
	private Date daNaisDemN; //		Date de naissance du demandeur	format date JJ/MM/AAAA	
	
	@Column(name="PRES_AUDIENCE_DEM_N",  nullable=false)
	private String presAudienceDemN; //		Présence du demandeur à l’audience	OUINONNR	menu déroulant
	
	@Column(name="AVOC_DEM_N",  nullable=false)
	private String avocDemN; //		Assistance ou représentation du demandeur par un avocat	Assist_Repre	menu déroulant
	
	@Column(name="TIERCE_DEM_N",  nullable=false)
	private String tierceDemN; //		Assistance ou représentation du demandeur par une tierce personne (autre que avocat)	Assist_Repre	menu déroulant
	
	@Column(name="TIERCE_QUI_DEM_N",  nullable=false)
	private String tierceQuiDemN; //		Qui est la tierce personne (tuteur, famille…)	Texte 50 char	zone texte
	
	@Column(name="AJ_DEM_N",  nullable=false)
	private String ajDemN; //		Aide juridictionnelle	AJ	menu déroulant
			
	
	@Column(name="DMDE_ANTE_DALO",  nullable=false)
	private Boolean dmdeAnteDalo; //		Est-il mentionné une demande antérieure d’expulsion formée devant les autorités administratives (demande au préfet loi Dalo)	OUINON	case à cocher
	
	@Column(name="DMDE_EXPULS",  nullable=false)
	private String dmdeExpuls; //		Demande d’expulsion du ou des squatteurs	OUINONNR	menu déroulant
	
	@Column(name="DMDE_INDEM_OCCUP",  nullable=false)
	private String dmdeIndemOccup; //		Demande d’indemnités d’occupation	OUINONNR	menu déroulant
	
	@Column(name="DMDE_INDEM_OCCUP_MT")
	private int dmdeIndemOccupMt; //		Montant mensuel d’indemnité d’occupation demandé	entier	zone de saisie 5 positions avec séparateur de millier
	
	@Column(name="DA_DMDE_INDEM_OCCUP")
	private String daDmdeIndemOccup; //		Date de début de versement demandé pour l’indemnité d’occupation	format date JJ/MM/AAAA	
	
	@Column(name="DMDE_SUPP_DELAI",  nullable=false)
	private String dmdeSuppDelai; //		Demande de suppression du délai de 2 moi qui suit le commandement d’avoir à quitter les lieux	OUINONNR	menu déroulant
	
	@Column(name="DMDE_SUPP_TREVE",  nullable=false)
	private String dmdeSuppTreve; //		Demande de non respect de la trêve hivernale du 1er novembre au 31 mars	OUINONNR	menu déroulant
	
	@Column(name="DMDE_PREJUD_SUBI",  nullable=false)
	private String dmdePrejudSubi; //		Demande pour préjudice subi (dommages et intérêts)	OUINONNR	menu déroulant
	
	@Column(name="DMDE_PREJUD_SUBI_MT")
	private int dmdePrejudSubiMt; //		Montant demandé pour le préjudice subi	entier	zone de saisie 5 positions avec séparateur de millier

	public int getIdDemandeurs() {
		return idDemandeurs;
	}

	public void setIdDemandeurs(int idDemandeurs) {
		this.idDemandeurs = idDemandeurs;
	}

	public int getNbDem() {
		return nbDem;
	}

	public void setNbDem(int nbDem) {
		this.nbDem = nbDem;
	}

	public Boolean getCoupleDem() {
		return coupleDem;
	}

	public void setCoupleDem(Boolean coupleDem) {
		this.coupleDem = coupleDem;
	}

	public Boolean getFratrieDem() {
		return fratrieDem;
	}

	public void setFratrieDem(Boolean fratrieDem) {
		this.fratrieDem = fratrieDem;
	}

	public String getLienDem() {
		return lienDem;
	}

	public void setLienDem(String lienDem) {
		this.lienDem = lienDem;
	}

	public String getTypeDemN() {
		return typeDemN;
	}

	public void setTypeDemN(String typeDemN) {
		this.typeDemN = typeDemN;
	}

	public String getTypeDemDetNn() {
		return typeDemDetNn;
	}

	public void setTypeDemDetNn(String typeDemDetNn) {
		this.typeDemDetNn = typeDemDetNn;
	}

	public String getDeptDomicDemN() {
		return deptDomicDemN;
	}

	public void setDeptDomicDemN(String deptDomicDemN) {
		this.deptDomicDemN = deptDomicDemN;
	}

	public String getSexeDemN() {
		return sexeDemN;
	}

	public void setSexeDemN(String sexeDemN) {
		this.sexeDemN = sexeDemN;
	}

	public Date getDaNaisDemN() {
		return daNaisDemN;
	}

	public void setDaNaisDemN(Date daNaisDemN) {
		this.daNaisDemN = daNaisDemN;
	}

	public String getPresAudienceDemN() {
		return presAudienceDemN;
	}

	public void setPresAudienceDemN(String presAudienceDemN) {
		this.presAudienceDemN = presAudienceDemN;
	}

	public String getAvocDemN() {
		return avocDemN;
	}

	public void setAvocDemN(String avocDemN) {
		this.avocDemN = avocDemN;
	}

	public String getTierceDemN() {
		return tierceDemN;
	}

	public void setTierceDemN(String tierceDemN) {
		this.tierceDemN = tierceDemN;
	}

	public String getTierceQuiDemN() {
		return tierceQuiDemN;
	}

	public void setTierceQuiDemN(String tierceQuiDemN) {
		this.tierceQuiDemN = tierceQuiDemN;
	}

	public String getAjDemN() {
		return ajDemN;
	}

	public void setAjDemN(String ajDemN) {
		this.ajDemN = ajDemN;
	}

	public Boolean getDmdeAnteDalo() {
		return dmdeAnteDalo;
	}

	public void setDmdeAnteDalo(Boolean dmdeAnteDalo) {
		this.dmdeAnteDalo = dmdeAnteDalo;
	}

	public String getDmdeExpuls() {
		return dmdeExpuls;
	}

	public void setDmdeExpuls(String dmdeExpuls) {
		this.dmdeExpuls = dmdeExpuls;
	}

	public String getDmdeIndemOccup() {
		return dmdeIndemOccup;
	}

	public void setDmdeIndemOccup(String dmdeIndemOccup) {
		this.dmdeIndemOccup = dmdeIndemOccup;
	}

	public int getDmdeIndemOccupMt() {
		return dmdeIndemOccupMt;
	}

	public void setDmdeIndemOccupMt(int dmdeIndemOccupMt) {
		this.dmdeIndemOccupMt = dmdeIndemOccupMt;
	}

	public String getDaDmdeIndemOccup() {
		return daDmdeIndemOccup;
	}

	public void setDaDmdeIndemOccup(String daDmdeIndemOccup) {
		this.daDmdeIndemOccup = daDmdeIndemOccup;
	}

	public String getDmdeSuppDelai() {
		return dmdeSuppDelai;
	}

	public void setDmdeSuppDelai(String dmdeSuppDelai) {
		this.dmdeSuppDelai = dmdeSuppDelai;
	}

	public String getDmdeSuppTreve() {
		return dmdeSuppTreve;
	}

	public void setDmdeSuppTreve(String dmdeSuppTreve) {
		this.dmdeSuppTreve = dmdeSuppTreve;
	}

	public String getDmdePrejudSubi() {
		return dmdePrejudSubi;
	}

	public void setDmdePrejudSubi(String dmdePrejudSubi) {
		this.dmdePrejudSubi = dmdePrejudSubi;
	}

	public int getDmdePrejudSubiMt() {
		return dmdePrejudSubiMt;
	}

	public void setDmdePrejudSubiMt(int dmdePrejudSubiMt) {
		this.dmdePrejudSubiMt = dmdePrejudSubiMt;
	}

	public Squat getSquat() {
		return squat;
	}

	public void setSquat(Squat squat) {
		this.squat = squat;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((ajDemN == null) ? 0 : ajDemN.hashCode());
		result = prime * result + ((avocDemN == null) ? 0 : avocDemN.hashCode());
		result = prime * result + ((coupleDem == null) ? 0 : coupleDem.hashCode());
		result = prime * result + ((daDmdeIndemOccup == null) ? 0 : daDmdeIndemOccup.hashCode());
		result = prime * result + ((daNaisDemN == null) ? 0 : daNaisDemN.hashCode());
		result = prime * result + ((deptDomicDemN == null) ? 0 : deptDomicDemN.hashCode());
		result = prime * result + ((dmdeAnteDalo == null) ? 0 : dmdeAnteDalo.hashCode());
		result = prime * result + ((dmdeExpuls == null) ? 0 : dmdeExpuls.hashCode());
		result = prime * result + ((dmdeIndemOccup == null) ? 0 : dmdeIndemOccup.hashCode());
		result = prime * result + dmdeIndemOccupMt;
		result = prime * result + ((dmdePrejudSubi == null) ? 0 : dmdePrejudSubi.hashCode());
		result = prime * result + dmdePrejudSubiMt;
		result = prime * result + ((dmdeSuppDelai == null) ? 0 : dmdeSuppDelai.hashCode());
		result = prime * result + ((dmdeSuppTreve == null) ? 0 : dmdeSuppTreve.hashCode());
		result = prime * result + ((fratrieDem == null) ? 0 : fratrieDem.hashCode());
		result = prime * result + idDemandeurs;
		result = prime * result + ((lienDem == null) ? 0 : lienDem.hashCode());
		result = prime * result + nbDem;
		result = prime * result + ((presAudienceDemN == null) ? 0 : presAudienceDemN.hashCode());
		result = prime * result + ((sexeDemN == null) ? 0 : sexeDemN.hashCode());
		result = prime * result + ((tierceDemN == null) ? 0 : tierceDemN.hashCode());
		result = prime * result + ((tierceQuiDemN == null) ? 0 : tierceQuiDemN.hashCode());
		result = prime * result + ((typeDemDetNn == null) ? 0 : typeDemDetNn.hashCode());
		result = prime * result + ((typeDemN == null) ? 0 : typeDemN.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Demandeurs other = (Demandeurs) obj;
		if (ajDemN == null) {
			if (other.ajDemN != null)
				return false;
		} else if (!ajDemN.equals(other.ajDemN))
			return false;
		if (avocDemN == null) {
			if (other.avocDemN != null)
				return false;
		} else if (!avocDemN.equals(other.avocDemN))
			return false;
		if (coupleDem == null) {
			if (other.coupleDem != null)
				return false;
		} else if (!coupleDem.equals(other.coupleDem))
			return false;
		if (daDmdeIndemOccup == null) {
			if (other.daDmdeIndemOccup != null)
				return false;
		} else if (!daDmdeIndemOccup.equals(other.daDmdeIndemOccup))
			return false;
		if (daNaisDemN == null) {
			if (other.daNaisDemN != null)
				return false;
		} else if (!daNaisDemN.equals(other.daNaisDemN))
			return false;
		if (deptDomicDemN == null) {
			if (other.deptDomicDemN != null)
				return false;
		} else if (!deptDomicDemN.equals(other.deptDomicDemN))
			return false;
		if (dmdeAnteDalo == null) {
			if (other.dmdeAnteDalo != null)
				return false;
		} else if (!dmdeAnteDalo.equals(other.dmdeAnteDalo))
			return false;
		if (dmdeExpuls == null) {
			if (other.dmdeExpuls != null)
				return false;
		} else if (!dmdeExpuls.equals(other.dmdeExpuls))
			return false;
		if (dmdeIndemOccup == null) {
			if (other.dmdeIndemOccup != null)
				return false;
		} else if (!dmdeIndemOccup.equals(other.dmdeIndemOccup))
			return false;
		if (dmdeIndemOccupMt != other.dmdeIndemOccupMt)
			return false;
		if (dmdePrejudSubi == null) {
			if (other.dmdePrejudSubi != null)
				return false;
		} else if (!dmdePrejudSubi.equals(other.dmdePrejudSubi))
			return false;
		if (dmdePrejudSubiMt != other.dmdePrejudSubiMt)
			return false;
		if (dmdeSuppDelai == null) {
			if (other.dmdeSuppDelai != null)
				return false;
		} else if (!dmdeSuppDelai.equals(other.dmdeSuppDelai))
			return false;
		if (dmdeSuppTreve == null) {
			if (other.dmdeSuppTreve != null)
				return false;
		} else if (!dmdeSuppTreve.equals(other.dmdeSuppTreve))
			return false;
		if (fratrieDem == null) {
			if (other.fratrieDem != null)
				return false;
		} else if (!fratrieDem.equals(other.fratrieDem))
			return false;
		if (idDemandeurs != other.idDemandeurs)
			return false;
		if (lienDem == null) {
			if (other.lienDem != null)
				return false;
		} else if (!lienDem.equals(other.lienDem))
			return false;
		if (nbDem != other.nbDem)
			return false;
		if (presAudienceDemN == null) {
			if (other.presAudienceDemN != null)
				return false;
		} else if (!presAudienceDemN.equals(other.presAudienceDemN))
			return false;
		if (sexeDemN == null) {
			if (other.sexeDemN != null)
				return false;
		} else if (!sexeDemN.equals(other.sexeDemN))
			return false;
		if (tierceDemN == null) {
			if (other.tierceDemN != null)
				return false;
		} else if (!tierceDemN.equals(other.tierceDemN))
			return false;
		if (tierceQuiDemN == null) {
			if (other.tierceQuiDemN != null)
				return false;
		} else if (!tierceQuiDemN.equals(other.tierceQuiDemN))
			return false;
		if (typeDemDetNn == null) {
			if (other.typeDemDetNn != null)
				return false;
		} else if (!typeDemDetNn.equals(other.typeDemDetNn))
			return false;
		if (typeDemN == null) {
			if (other.typeDemN != null)
				return false;
		} else if (!typeDemN.equals(other.typeDemN))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Demandeurs [idDemandeurs=" + idDemandeurs + ", nbDem=" + nbDem + ", coupleDem=" + coupleDem
				+ ", fratrieDem=" + fratrieDem + ", lienDem=" + lienDem + ", typeDemN=" + typeDemN + ", typeDemDetNn="
				+ typeDemDetNn + ", deptDomicDemN=" + deptDomicDemN + ", sexeDemN=" + sexeDemN + ", daNaisDemN="
				+ daNaisDemN + ", presAudienceDemN=" + presAudienceDemN + ", avocDemN=" + avocDemN + ", tierceDemN="
				+ tierceDemN + ", tierceQuiDemN=" + tierceQuiDemN + ", ajDemN=" + ajDemN + ", dmdeAnteDalo="
				+ dmdeAnteDalo + ", dmdeExpuls=" + dmdeExpuls + ", dmdeIndemOccup=" + dmdeIndemOccup
				+ ", dmdeIndemOccupMt=" + dmdeIndemOccupMt + ", daDmdeIndemOccup=" + daDmdeIndemOccup
				+ ", dmdeSuppDelai=" + dmdeSuppDelai + ", dmdeSuppTreve=" + dmdeSuppTreve + ", dmdePrejudSubi="
				+ dmdePrejudSubi + ", dmdePrejudSubiMt=" + dmdePrejudSubiMt + "]";
	}

	public Demandeurs(int idDemandeurs, int nbDem, Boolean coupleDem, Boolean fratrieDem, String lienDem,
			String typeDemN, String typeDemDetNn, String deptDomicDemN, String sexeDemN, Date daNaisDemN,
			String presAudienceDemN, String avocDemN, String tierceDemN, String tierceQuiDemN, String ajDemN,
			Boolean dmdeAnteDalo, String dmdeExpuls, String dmdeIndemOccup, int dmdeIndemOccupMt,
			String daDmdeIndemOccup, String dmdeSuppDelai, String dmdeSuppTreve, String dmdePrejudSubi,
			int dmdePrejudSubiMt) {
		super();
		this.idDemandeurs = idDemandeurs;
		this.nbDem = nbDem;
		this.coupleDem = coupleDem;
		this.fratrieDem = fratrieDem;
		this.lienDem = lienDem;
		this.typeDemN = typeDemN;
		this.typeDemDetNn = typeDemDetNn;
		this.deptDomicDemN = deptDomicDemN;
		this.sexeDemN = sexeDemN;
		this.daNaisDemN = daNaisDemN;
		this.presAudienceDemN = presAudienceDemN;
		this.avocDemN = avocDemN;
		this.tierceDemN = tierceDemN;
		this.tierceQuiDemN = tierceQuiDemN;
		this.ajDemN = ajDemN;
		this.dmdeAnteDalo = dmdeAnteDalo;
		this.dmdeExpuls = dmdeExpuls;
		this.dmdeIndemOccup = dmdeIndemOccup;
		this.dmdeIndemOccupMt = dmdeIndemOccupMt;
		this.daDmdeIndemOccup = daDmdeIndemOccup;
		this.dmdeSuppDelai = dmdeSuppDelai;
		this.dmdeSuppTreve = dmdeSuppTreve;
		this.dmdePrejudSubi = dmdePrejudSubi;
		this.dmdePrejudSubiMt = dmdePrejudSubiMt;
	}

	//Auto generation des constructeurs et getters et setters
	
	
	
	
	
	
	

}
