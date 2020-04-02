package fr.saigamp.exemplejpabis.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
//@Table(name="defendeurs")
public class Defendeurs {
	
	@Id
	@GeneratedValue
	@Column(name="id_defendeurs", unique = true, nullable = false)
	private int idDefendeurs;
	
	@ManyToOne
	private Squat squat;
	
	//Auto generation des constructeurs et getters et setters
	@Column(name="NB_DEF",  nullable = false)
	private int nbDef; // 	Nombre de défendeurs (yc intervenants volontaires acceptés par le juge)	entier	zone de saisie 2 positions
	
	@Column(name="DIF_SQUAT_DEF", nullable = false)
	private String difSquatDef; 	// Tous les squatteurs ont-ils été assignés comme défendeurs	OUINONNR	menu déroulant
	
	@Column(name="NB_SQUAT")
	private int nbSquat; //		Nombre de squatteurs	entier	zone de saisie 2 positions
	
	@Column(name="PROFIL_SQUAT_DET",  nullable=false)
	private String profilSquatDet; //		Profil des squatteurs	Profil_Squat	menu déroulant
	
	@Column(name="PROFIL_SQUAT",  nullable=false)
	private String profilSquat; //		Préciser l’autre profil des squatteurs	Texte 50 char	zone texte 
	
	@Column(name="PRES_MIN_DEF",  nullable=false)
	private String presMinDef; //		Présence d’enfants mineurs sur le squat	OUINONNR	menu déroulant
	
	@Column(name="ENTREE_OK_DEF",  nullable=false)
	private Boolean entreeOkDef; //		Un défendeur est il entré dans le « bien » avec l’accord du demandeur ou de l’occupant en titre	OUINON	case à cocher
	
	@Column(name="LIEN_DEM_DEF",  nullable=false)
	private String lienDemDef; //		Y a t’il un lien entre un des défendeurs et un des demandeurs	Lien_Def_Dem	menu déroulant
				
	@Column(name="SEXE_DEF_N",  nullable=false)
	private String sexeDefN; //		Sexe du défendeur	Sexe	menu déroulant
	
	@Column(name="DA_NAIS_DEF_N")
	private Date daNaisDefN; //		Date de naissance du défendeur	format date JJ/MM/AAAA	
	
	@Column(name="STATUT_DELIB_DEF_N",  nullable=false)
	private String statutDelibDefN; //		Statut du défendeur au moment du délibéré	Statut_Def	menu déroulant
	
	@Column(name="PRES_AUDIENCE_DEF_N",  nullable=false)
	private String presAudienceDefN; //		Présence du défendeur à l’audience	OUINONNR	menu déroulant
	
	@Column(name="AVOC_DEF_N",  nullable=false)
	private String avocDefN; //		Assistance ou représentation du défendeur par un avocat	Assist_Repre	menu déroulant
	
	@Column(name="TIERCE_DEF_N",  nullable=false)
	private String tierceDefN; //		Assistance ou représentation du défendeur par une tierce personne (autre que avocat)	Assist_Repre	menu déroulant
	
	@Column(name="TIERCE_QUI_DEF_N",  nullable=false)
	private String tierceQuiDefN; //		Qui est la tierce personne (tuteur, famille…)	Texte 50 char	zone texte
	
	@Column(name="AJ_DEF_N",  nullable=false)
	private String ajDefN; //		Aide juridictionnelle	AJ	menu déroulant
				
	@Column(name="DMDE_DEF_DELAI",  nullable=false)
	private String dmdeDefDelai; //		Demande d’un délai pour quitter les lieux par au moins un défendeurs	OUINONNR	menu déroulant
	
	@Column(name="DMDE_DEF_DELAI_DUREE",  nullable=false)
	private String dmdeDefDelaiDuree; //		Durée du délai demandé en mois	entier	zone de saisie 2 positions

	public int getIdDefendeurs() {
		return idDefendeurs;
	}

	public void setIdDefendeurs(int idDefendeurs) {
		this.idDefendeurs = idDefendeurs;
	}

	public int getNbDef() {
		return nbDef;
	}

	public void setNbDef(int nbDef) {
		this.nbDef = nbDef;
	}

	public String getDifSquatDef() {
		return difSquatDef;
	}

	public void setDifSquatDef(String difSquatDef) {
		this.difSquatDef = difSquatDef;
	}

	public int getNbSquat() {
		return nbSquat;
	}

	public void setNbSquat(int nbSquat) {
		this.nbSquat = nbSquat;
	}

	public String getProfilSquatDet() {
		return profilSquatDet;
	}

	public void setProfilSquatDet(String profilSquatDet) {
		this.profilSquatDet = profilSquatDet;
	}

	public String getProfilSquat() {
		return profilSquat;
	}

	public void setProfilSquat(String profilSquat) {
		this.profilSquat = profilSquat;
	}

	public String getPresMinDef() {
		return presMinDef;
	}

	public void setPresMinDef(String presMinDef) {
		this.presMinDef = presMinDef;
	}

	public Boolean getEntreeOkDef() {
		return entreeOkDef;
	}

	public void setEntreeOkDef(Boolean entreeOkDef) {
		this.entreeOkDef = entreeOkDef;
	}

	public String getLienDemDef() {
		return lienDemDef;
	}

	public void setLienDemDef(String lienDemDef) {
		this.lienDemDef = lienDemDef;
	}

	public String getSexeDefN() {
		return sexeDefN;
	}

	public void setSexeDefN(String sexeDefN) {
		this.sexeDefN = sexeDefN;
	}

	public Date getDaNaisDefN() {
		return daNaisDefN;
	}

	public void setDaNaisDefN(Date daNaisDefN) {
		this.daNaisDefN = daNaisDefN;
	}

	public String getStatutDelibDefN() {
		return statutDelibDefN;
	}

	public void setStatutDelibDefN(String statutDelibDefN) {
		this.statutDelibDefN = statutDelibDefN;
	}

	public String getPresAudienceDefN() {
		return presAudienceDefN;
	}

	public void setPresAudienceDefN(String presAudienceDefN) {
		this.presAudienceDefN = presAudienceDefN;
	}

	public String getAvocDefN() {
		return avocDefN;
	}

	public void setAvocDefN(String avocDefN) {
		this.avocDefN = avocDefN;
	}

	public String getTierceDefN() {
		return tierceDefN;
	}

	public void setTierceDefN(String tierceDefN) {
		this.tierceDefN = tierceDefN;
	}

	public String getTierceQuiDefN() {
		return tierceQuiDefN;
	}

	public void setTierceQuiDefN(String tierceQuiDefN) {
		this.tierceQuiDefN = tierceQuiDefN;
	}

	
	
	public String getAjDefN() {
		return ajDefN;
	}

	public void setAjDefN(String ajDefN) {
		this.ajDefN = ajDefN;
	}

	public String getDmdeDefDelai() {
		return dmdeDefDelai;
	}

	public void setDmdeDefDelai(String dmdeDefDelai) {
		this.dmdeDefDelai = dmdeDefDelai;
	}

	public String getDmdeDefDelaiDuree() {
		return dmdeDefDelaiDuree;
	}

	public void setDmdeDefDelaiDuree(String dmdeDefDelaiDuree) {
		this.dmdeDefDelaiDuree = dmdeDefDelaiDuree;
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
		result = prime * result + ((ajDefN == null) ? 0 : ajDefN.hashCode());
		result = prime * result + ((avocDefN == null) ? 0 : avocDefN.hashCode());
		result = prime * result + ((daNaisDefN == null) ? 0 : daNaisDefN.hashCode());
		result = prime * result + ((difSquatDef == null) ? 0 : difSquatDef.hashCode());
		result = prime * result + ((dmdeDefDelai == null) ? 0 : dmdeDefDelai.hashCode());
		result = prime * result + ((dmdeDefDelaiDuree == null) ? 0 : dmdeDefDelaiDuree.hashCode());
		result = prime * result + ((entreeOkDef == null) ? 0 : entreeOkDef.hashCode());
		result = prime * result + idDefendeurs;
		result = prime * result + ((lienDemDef == null) ? 0 : lienDemDef.hashCode());
		result = prime * result + nbDef;
		result = prime * result + nbSquat;
		result = prime * result + ((presAudienceDefN == null) ? 0 : presAudienceDefN.hashCode());
		result = prime * result + ((presMinDef == null) ? 0 : presMinDef.hashCode());
		result = prime * result + ((profilSquat == null) ? 0 : profilSquat.hashCode());
		result = prime * result + ((profilSquatDet == null) ? 0 : profilSquatDet.hashCode());
		result = prime * result + ((sexeDefN == null) ? 0 : sexeDefN.hashCode());
		result = prime * result + ((statutDelibDefN == null) ? 0 : statutDelibDefN.hashCode());
		result = prime * result + ((tierceDefN == null) ? 0 : tierceDefN.hashCode());
		result = prime * result + ((tierceQuiDefN == null) ? 0 : tierceQuiDefN.hashCode());
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
		Defendeurs other = (Defendeurs) obj;
		if (ajDefN == null) {
			if (other.ajDefN != null)
				return false;
		} else if (!ajDefN.equals(other.ajDefN))
			return false;
		if (avocDefN == null) {
			if (other.avocDefN != null)
				return false;
		} else if (!avocDefN.equals(other.avocDefN))
			return false;
		if (daNaisDefN == null) {
			if (other.daNaisDefN != null)
				return false;
		} else if (!daNaisDefN.equals(other.daNaisDefN))
			return false;
		if (difSquatDef == null) {
			if (other.difSquatDef != null)
				return false;
		} else if (!difSquatDef.equals(other.difSquatDef))
			return false;
		if (dmdeDefDelai == null) {
			if (other.dmdeDefDelai != null)
				return false;
		} else if (!dmdeDefDelai.equals(other.dmdeDefDelai))
			return false;
		if (dmdeDefDelaiDuree == null) {
			if (other.dmdeDefDelaiDuree != null)
				return false;
		} else if (!dmdeDefDelaiDuree.equals(other.dmdeDefDelaiDuree))
			return false;
		if (entreeOkDef == null) {
			if (other.entreeOkDef != null)
				return false;
		} else if (!entreeOkDef.equals(other.entreeOkDef))
			return false;
		if (idDefendeurs != other.idDefendeurs)
			return false;
		if (lienDemDef == null) {
			if (other.lienDemDef != null)
				return false;
		} else if (!lienDemDef.equals(other.lienDemDef))
			return false;
		if (nbDef != other.nbDef)
			return false;
		if (nbSquat != other.nbSquat)
			return false;
		if (presAudienceDefN == null) {
			if (other.presAudienceDefN != null)
				return false;
		} else if (!presAudienceDefN.equals(other.presAudienceDefN))
			return false;
		if (presMinDef == null) {
			if (other.presMinDef != null)
				return false;
		} else if (!presMinDef.equals(other.presMinDef))
			return false;
		if (profilSquat == null) {
			if (other.profilSquat != null)
				return false;
		} else if (!profilSquat.equals(other.profilSquat))
			return false;
		if (profilSquatDet == null) {
			if (other.profilSquatDet != null)
				return false;
		} else if (!profilSquatDet.equals(other.profilSquatDet))
			return false;
		if (sexeDefN == null) {
			if (other.sexeDefN != null)
				return false;
		} else if (!sexeDefN.equals(other.sexeDefN))
			return false;
		if (statutDelibDefN == null) {
			if (other.statutDelibDefN != null)
				return false;
		} else if (!statutDelibDefN.equals(other.statutDelibDefN))
			return false;
		if (tierceDefN == null) {
			if (other.tierceDefN != null)
				return false;
		} else if (!tierceDefN.equals(other.tierceDefN))
			return false;
		if (tierceQuiDefN == null) {
			if (other.tierceQuiDefN != null)
				return false;
		} else if (!tierceQuiDefN.equals(other.tierceQuiDefN))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Defendeurs [idDefendeurs=" + idDefendeurs + ", nbDef=" + nbDef + ", difSquatDef=" + difSquatDef
				+ ", nbSquat=" + nbSquat + ", profilSquatDet=" + profilSquatDet + ", profilSquat=" + profilSquat
				+ ", presMinDef=" + presMinDef + ", entreeOkDef=" + entreeOkDef + ", lienDemDef=" + lienDemDef
				+ ", sexeDefN=" + sexeDefN + ", daNaisDefN=" + daNaisDefN + ", statutDelibDefN=" + statutDelibDefN
				+ ", presAudienceDefN=" + presAudienceDefN + ", avocDefN=" + avocDefN + ", tierceDefN=" + tierceDefN
				+ ", tierceQuiDefN=" + tierceQuiDefN + ", ajDefN=" + ajDefN + ", dmdeDefDelai=" + dmdeDefDelai
				+ ", dmdeDefDelaiDuree=" + dmdeDefDelaiDuree + "]";
	}

	public Defendeurs(int idDefendeurs, int nbDef, String difSquatDef, int nbSquat, String profilSquatDet,
			String profilSquat, String presMinDef, Boolean entreeOkDef, String lienDemDef, String sexeDefN,
			Date daNaisDefN, String statutDelibDefN, String presAudienceDefN, String avocDefN, String tierceDefN,
			String tierceQuiDefN, String ajDefN, String dmdeDefDelai, String dmdeDefDelaiDuree) {
		super();
		this.idDefendeurs = idDefendeurs;
		this.nbDef = nbDef;
		this.difSquatDef = difSquatDef;
		this.nbSquat = nbSquat;
		this.profilSquatDet = profilSquatDet;
		this.profilSquat = profilSquat;
		this.presMinDef = presMinDef;
		this.entreeOkDef = entreeOkDef;
		this.lienDemDef = lienDemDef;
		this.sexeDefN = sexeDefN;
		this.daNaisDefN = daNaisDefN;
		this.statutDelibDefN = statutDelibDefN;
		this.presAudienceDefN = presAudienceDefN;
		this.avocDefN = avocDefN;
		this.tierceDefN = tierceDefN;
		this.tierceQuiDefN = tierceQuiDefN;
		this.ajDefN = ajDefN;
		this.dmdeDefDelai = dmdeDefDelai;
		this.dmdeDefDelaiDuree = dmdeDefDelaiDuree;
	}

	
	
	
}
