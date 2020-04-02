package fr.saigamp.exemplejpabis.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
//@Table(name="nom de ta table SGBD")
public class Squat {
	
	
	@Id
	@GeneratedValue
	@Column(name="id_squat", unique = true, nullable = false)
	private int idSquat;
	
	@Column(name="no_cmpst", nullable = false, unique = true, length = 6)
	private String noCmpst;
	
	@Column(name="ielst_ti", nullable=false, length = 8)
	private String ielstTi;
	
	@Column(name="no_rg", nullable=false)
	private String noRg;
	
	@Column(name="hc_squat", nullable=false)
	private Integer hcSquat;
	
	@Column(name="hc_squat_det", nullable=false)
	private String hcSquatDet;
	
	@Column(name="NAT_DEC",  nullable=false)
	private String natDec; //	Nature de la décision	Nat_Decision	menu déroulant	O
	
	@Column(name="DA_ASSIGN",  nullable=false)
	private Date daAssign; //		Date de l’assignation	format date JJ/MM/AAAA		O
	
	@Column(name="DA_AUDIENCE",  nullable=false)
	private Date daAudience; //		Date de l’audience	format date JJ/MM/AAAA		O
	
	@Column(name="RENVOI",  nullable=false)
	private Boolean renvoi; //		Y avait il eu au moins un renvoi de cette affaire avant cette audience 	OUINON	case à cocher	O
	
	@Column(name="DA_1ERE_AUDIENCE_RENVOI",  nullable=false)
	private Date da1ereAudienceRenvoi; //		Quelle était la date de la première audience ?	format date JJ/MM/AAAA		O
	
	@Column(name="DA_DEC",  nullable=false)
	private Date daDec; //		Date de la décision	format date JJ/MM/AAAA		O
	
	@Column(name="DA_ORDO_REQ_AUTORIS_HUIS",  nullable=true)
	private Date daOrdoReqAutorisHuis; //		Date de l’ordonnance sur requête pour autorisation huissier	format date JJ/MM/AAAA		N
	
	@Column(name="DA_CONSTAT_HUIS",  nullable=true)
	private Date daConstatHuis; //		Date de constat d’huissier	format date JJ/MM/AAAA		N

	@Column(name="BIEN_COMMUNE",  nullable=false)
	private String bienCommune; //	Code commune de localisation du bien squatté	SRJ ? Ou code géo INSEE	menu déroulant avec recherche par code département et par libellé commune	O

@Column(name="BIEN_TYPE",  nullable=false)
	private String bienType; //	Type de bien squatté	Type_Bien	menu déroulant	O

@Column(name="BIEN_TYPE_DET",  nullable=false)
	private String bieTypeDet; //	Préciser le type de bien squatté autre	Texte 50 char	zone texte 	O

@Column(name="BIEN_COHAB_OCCUP",  nullable=false)
	private String bienCohabOccup; //	Tout ou partie du bien était-il occupé (ou utilisé) par le demandeur ou un occupant en titre lorsque le squat a débuté ?	OUINONNR	menu déroulant	O

@Column(name="BIEN_MODE_OCCUP",  nullable=false)
	private String bienModeOccup; //	Mode d’occupation du logement avant le squat	Mode_Occup	menu déroulant	O

@Column(name="BIEN_MODE_OCCUP_DET",  nullable=false)
	private String bienModeOccupDet; //	Préciser le mode d’occupation du logement individuel	Texte 50 char	zone texte 	O

@Column(name="BIEN_ABS_OCCUP",  nullable=false)
	private String bienAbsOccup; //	L'installation de squatteur(s) dans le logement peut-elle s'expliquer par une absence spécifique de l'occupant en titre ?	Abs_Occup	menu déroulant	O

@Column(name="BIEN_ABS_OCCUP_DET",  nullable=false)
	private String bienAbsOccupDet; //	Préciser l’absence spécifique de l’occupant en titre	Texte 50 char	zone texte 	O

@Column(name="BIEN_LIBRE",  nullable=false)
	private String bienLibre; //	Est-il indiqué une situation spécifique relative au bien expliquant pourquoi il n'était pas occupé ou utilisé lorsque le squat a débuté?	Bien_Libre	menu déroulant	O

@Column(name="BIEN_LIBRE_DET",  nullable=false)
	private String bienLibreDet; //	Préciser la situations spécifique relative au bien	Texte 50 char	zone texte 	O

@Column(name="DA_BIEN_NOCCUP")
	private Date daBienNoccup; //	Date depuis laquelle le bien n’était plus occupé ou utilisé	format date JJ/MM/AAAA		N

@Column(name="DA_BIEN_SQUAT",  nullable=false)
	private Date daBienSquat; //	Date depuis laquelle le bien est squatté	format date JJ/MM/AAAA		N

@Column(name="DEC_EXPULS",  nullable=false)
private String decExpuls; //		Décision d’expulsion du ou des squatteurs	Dec_Expuls	menu déroulant	O

@Column(name="DEC_EXPULS_DET",  nullable=false)
private String decExpulsDet; //		Motif de non expulsion (de tous ou une partie) des squatteurs 	Texte 100 char	zone texte 	O

@Column(name="DEC_INDEM_OCCUP",  nullable=false)
private String decIndemOccup; //		Accorde  le versement d'indemnités d'occupation	OUINONNR	menu déroulant	O

@Column(name="DEC_INDEM_OCCUP_MT",  nullable=false)
private int decIndemOccupMt; //		Montant mensuel d’indemnité d’occupation décidé par le juge	entier	zone de saisie 5 positions	O

@Column(name="DA_DEC_INDEM_OCCUP",  nullable=false)
private Date daDecIndemOccup; //		Date de début de versement décidée pour l’indemnité d’occupation	format date JJ/MM/AAAA		O

@Column(name="DEC_SUPP_DELAI",  nullable=false)
private String decSuppDelai; //		Accorde la  suppression du délai de 2 mois qui suit le commandement d’avoir à quitter les lieux	OUINONNR	menu déroulant	O

@Column(name="DEC_SUPP_TREVE",  nullable=false)
private String decSuppTreve; //		Accorde le non respect de la trêve hivernale du 1er novembre au 31 mars	OUINONNR	menu déroulant	O

@Column(name="DEC_PREJUD_SUBI",  nullable=false)
private String decPrejudSubi; //		Accorde la réparation du préjudice subi (dommages et intérêts)	OUINONNR	menu déroulant	O

@Column(name="DEC_PREJUD_SUBI_MT",  nullable=false)
private int decPrejudSubiMt; //		Montant accordé au titre du préjudice subi 	entier	zone de saisie 5 positions	O

@Column(name="DEC_DMDE_DEF_DELAI",  nullable=false)
private String decDmdeDefDelai; //		Demande d’un délai pour quitter les lieux par au moins un défendeurs	OUINONNR	menu déroulant	O

@Column(name="DEC_DMDE_DEF_DELAI_DUREE",  nullable=false)
private int decDmdeDefDelaiDuree; //		Durée du délai accordé en mois	entier	zone de saisie 2 positions	O


@Column(name="E",  nullable=false)
private String e; //		Demande d’un délai pour quitter les lieux par au moins un défendeurs	OUINONNR	menu déroulant	O

	//relation avec la table demandeurs !
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "squat")
	private List<Demandeurs> demandeurs  = new ArrayList<Demandeurs>();
	
	//relation avec la table defendeurs !
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "squat")
	private List<Defendeurs> defendeurs  = new ArrayList<Defendeurs>();

	public int getIdSquat() {
		return idSquat;
	}

	public void setIdSquat(int idSquat) {
		this.idSquat = idSquat;
	}

	public String getNoCmpst() {
		return noCmpst;
	}

	public void setNoCmpst(String noCmpst) {
		this.noCmpst = noCmpst;
	}

	public String getIelstTi() {
		return ielstTi;
	}

	public void setIelstTi(String ielstTi) {
		this.ielstTi = ielstTi;
	}

	public String getNoRg() {
		return noRg;
	}

	public void setNoRg(String noRg) {
		this.noRg = noRg;
	}

	public Integer getHcSquat() {
		return hcSquat;
	}

	public void setHcSquat(Integer hcSquat) {
		this.hcSquat = hcSquat;
	}

	public String getHcSquatDet() {
		return hcSquatDet;
	}

	public void setHcSquatDet(String hcSquatDet) {
		this.hcSquatDet = hcSquatDet;
	}

	public String getNatDec() {
		return natDec;
	}

	public void setNatDec(String natDec) {
		this.natDec = natDec;
	}

	public Date getDaAssign() {
		return daAssign;
	}

	public void setDaAssign(Date daAssign) {
		this.daAssign = daAssign;
	}

	public Date getDaAudience() {
		return daAudience;
	}

	public void setDaAudience(Date daAudience) {
		this.daAudience = daAudience;
	}

	public Boolean getRenvoi() {
		return renvoi;
	}

	public void setRenvoi(Boolean renvoi) {
		this.renvoi = renvoi;
	}

	public Date getDa1ereAudienceRenvoi() {
		return da1ereAudienceRenvoi;
	}

	public void setDa1ereAudienceRenvoi(Date da1ereAudienceRenvoi) {
		this.da1ereAudienceRenvoi = da1ereAudienceRenvoi;
	}

	public Date getDaDec() {
		return daDec;
	}

	public void setDaDec(Date daDec) {
		this.daDec = daDec;
	}

	public Date getDaOrdoReqAutorisHuis() {
		return daOrdoReqAutorisHuis;
	}

	public void setDaOrdoReqAutorisHuis(Date daOrdoReqAutorisHuis) {
		this.daOrdoReqAutorisHuis = daOrdoReqAutorisHuis;
	}

	public Date getDaConstatHuis() {
		return daConstatHuis;
	}

	public void setDaConstatHuis(Date daConstatHuis) {
		this.daConstatHuis = daConstatHuis;
	}

	public String getBienCommune() {
		return bienCommune;
	}

	public void setBienCommune(String bienCommune) {
		this.bienCommune = bienCommune;
	}

	public String getBienType() {
		return bienType;
	}

	public void setBienType(String bienType) {
		this.bienType = bienType;
	}

	public String getBieTypeDet() {
		return bieTypeDet;
	}

	public void setBieTypeDet(String bieTypeDet) {
		this.bieTypeDet = bieTypeDet;
	}

	public String getBienCohabOccup() {
		return bienCohabOccup;
	}

	public void setBienCohabOccup(String bienCohabOccup) {
		this.bienCohabOccup = bienCohabOccup;
	}

	public String getBienModeOccup() {
		return bienModeOccup;
	}

	public void setBienModeOccup(String bienModeOccup) {
		this.bienModeOccup = bienModeOccup;
	}

	public String getBienModeOccupDet() {
		return bienModeOccupDet;
	}

	public void setBienModeOccupDet(String bienModeOccupDet) {
		this.bienModeOccupDet = bienModeOccupDet;
	}

	public String getBienAbsOccup() {
		return bienAbsOccup;
	}

	public void setBienAbsOccup(String bienAbsOccup) {
		this.bienAbsOccup = bienAbsOccup;
	}

	public String getBienAbsOccupDet() {
		return bienAbsOccupDet;
	}

	public void setBienAbsOccupDet(String bienAbsOccupDet) {
		this.bienAbsOccupDet = bienAbsOccupDet;
	}

	public String getBienLibre() {
		return bienLibre;
	}

	public void setBienLibre(String bienLibre) {
		this.bienLibre = bienLibre;
	}

	public String getBienLibreDet() {
		return bienLibreDet;
	}

	public void setBienLibreDet(String bienLibreDet) {
		this.bienLibreDet = bienLibreDet;
	}

	public Date getDaBienNoccup() {
		return daBienNoccup;
	}

	public void setDaBienNoccup(Date daBienNoccup) {
		this.daBienNoccup = daBienNoccup;
	}

	public Date getDaBienSquat() {
		return daBienSquat;
	}

	public void setDaBienSquat(Date daBienSquat) {
		this.daBienSquat = daBienSquat;
	}

	public String getDecExpuls() {
		return decExpuls;
	}

	public void setDecExpuls(String decExpuls) {
		this.decExpuls = decExpuls;
	}

	public String getDecExpulsDet() {
		return decExpulsDet;
	}

	public void setDecExpulsDet(String decExpulsDet) {
		this.decExpulsDet = decExpulsDet;
	}

	public String getDecIndemOccup() {
		return decIndemOccup;
	}

	public void setDecIndemOccup(String decIndemOccup) {
		this.decIndemOccup = decIndemOccup;
	}

	public int getDecIndemOccupMt() {
		return decIndemOccupMt;
	}

	public void setDecIndemOccupMt(int decIndemOccupMt) {
		this.decIndemOccupMt = decIndemOccupMt;
	}

	public Date getDaDecIndemOccup() {
		return daDecIndemOccup;
	}

	public void setDaDecIndemOccup(Date daDecIndemOccup) {
		this.daDecIndemOccup = daDecIndemOccup;
	}

	public String getDecSuppDelai() {
		return decSuppDelai;
	}

	public void setDecSuppDelai(String decSuppDelai) {
		this.decSuppDelai = decSuppDelai;
	}

	public String getDecSuppTreve() {
		return decSuppTreve;
	}

	public void setDecSuppTreve(String decSuppTreve) {
		this.decSuppTreve = decSuppTreve;
	}

	public String getDecPrejudSubi() {
		return decPrejudSubi;
	}

	public void setDecPrejudSubi(String decPrejudSubi) {
		this.decPrejudSubi = decPrejudSubi;
	}

	public int getDecPrejudSubiMt() {
		return decPrejudSubiMt;
	}

	public void setDecPrejudSubiMt(int decPrejudSubiMt) {
		this.decPrejudSubiMt = decPrejudSubiMt;
	}

	public String getDecDmdeDefDelai() {
		return decDmdeDefDelai;
	}

	public void setDecDmdeDefDelai(String decDmdeDefDelai) {
		this.decDmdeDefDelai = decDmdeDefDelai;
	}

	public int getDecDmdeDefDelaiDuree() {
		return decDmdeDefDelaiDuree;
	}

	public void setDecDmdeDefDelaiDuree(int decDmdeDefDelaiDuree) {
		this.decDmdeDefDelaiDuree = decDmdeDefDelaiDuree;
	}

	public String getE() {
		return e;
	}

	public void setE(String e) {
		this.e = e;
	}

	public List<Demandeurs> getDemandeurs() {
		return demandeurs;
	}

	public void setDemandeurs(List<Demandeurs> demandeurs) {
		this.demandeurs = demandeurs;
	}

	public List<Defendeurs> getDefendeurs() {
		return defendeurs;
	}

	public void setDefendeurs(List<Defendeurs> defendeurs) {
		this.defendeurs = defendeurs;
	}

	public Squat(int idSquat, String noCmpst, String ielstTi, String noRg, Integer hcSquat, String hcSquatDet,
			String natDec, Date daAssign, Date daAudience, Boolean renvoi, Date da1ereAudienceRenvoi, Date daDec,
			Date daOrdoReqAutorisHuis, Date daConstatHuis, String bienCommune, String bienType, String bieTypeDet,
			String bienCohabOccup, String bienModeOccup, String bienModeOccupDet, String bienAbsOccup,
			String bienAbsOccupDet, String bienLibre, String bienLibreDet, Date daBienNoccup, Date daBienSquat,
			String decExpuls, String decExpulsDet, String decIndemOccup, int decIndemOccupMt, Date daDecIndemOccup,
			String decSuppDelai, String decSuppTreve, String decPrejudSubi, int decPrejudSubiMt, String decDmdeDefDelai,
			int decDmdeDefDelaiDuree, String e, List<Demandeurs> demandeurs, List<Defendeurs> defendeurs) {
		super();
		this.idSquat = idSquat;
		this.noCmpst = noCmpst;
		this.ielstTi = ielstTi;
		this.noRg = noRg;
		this.hcSquat = hcSquat;
		this.hcSquatDet = hcSquatDet;
		this.natDec = natDec;
		this.daAssign = daAssign;
		this.daAudience = daAudience;
		this.renvoi = renvoi;
		this.da1ereAudienceRenvoi = da1ereAudienceRenvoi;
		this.daDec = daDec;
		this.daOrdoReqAutorisHuis = daOrdoReqAutorisHuis;
		this.daConstatHuis = daConstatHuis;
		this.bienCommune = bienCommune;
		this.bienType = bienType;
		this.bieTypeDet = bieTypeDet;
		this.bienCohabOccup = bienCohabOccup;
		this.bienModeOccup = bienModeOccup;
		this.bienModeOccupDet = bienModeOccupDet;
		this.bienAbsOccup = bienAbsOccup;
		this.bienAbsOccupDet = bienAbsOccupDet;
		this.bienLibre = bienLibre;
		this.bienLibreDet = bienLibreDet;
		this.daBienNoccup = daBienNoccup;
		this.daBienSquat = daBienSquat;
		this.decExpuls = decExpuls;
		this.decExpulsDet = decExpulsDet;
		this.decIndemOccup = decIndemOccup;
		this.decIndemOccupMt = decIndemOccupMt;
		this.daDecIndemOccup = daDecIndemOccup;
		this.decSuppDelai = decSuppDelai;
		this.decSuppTreve = decSuppTreve;
		this.decPrejudSubi = decPrejudSubi;
		this.decPrejudSubiMt = decPrejudSubiMt;
		this.decDmdeDefDelai = decDmdeDefDelai;
		this.decDmdeDefDelaiDuree = decDmdeDefDelaiDuree;
		this.e = e;
		this.demandeurs = demandeurs;
		this.defendeurs = defendeurs;
	}
	
	
	//Auto generation des constructeurs et getters et setters
	
	

}
