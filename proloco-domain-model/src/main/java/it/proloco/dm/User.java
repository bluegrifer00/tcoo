package it.proloco.dm;

/** @author stefano santini
 * 
 * classe dell'utente del progetto
 * 
 */

public class User {

	String username;
	int userType;
	String email;
	String password;
	String name;
	String surname;
	String addres;
	String description;
	String VAT;
	String cellNumber;
	int sexOfTheUser;
	//maschio o femmina
	
    /**
	 * mostra l'username settato
	 * @return username
	 */
	public String getUsername() {
		return username;
	}
	/**
	 * setta l'username
	 * @param username
	 */
	public void setUsername(String username) {
		this.username = username;
	}
	/**
	 * mostra il tipo dell'utente selezionato
	 * @return usertype
	 */
	public int getUserType() {
		return userType;
	}
	/**
	 * setta il tipo di utente
	 * @param userType
	 */
	public void setUserType(int userType) {
		this.userType = userType;
	}
	/**
	 * mostra l'email usata per registrarsi
	 * @return email
	 */
	public String getEmail() {
		return email;
	}
	/**
	 * setta l'email per il log in
	 * @param email
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	/**
	 * mostra password usata per registrarsi
	 * @return password
	 */
	public String getPassword() {
		return password;
	}
	/**
	 * setta la password peril log in
	 * @param password
	 */
	public void setPassword(String password) {
		this.password = password;
	}
	/**
	 * mostra il nome reale dell'utente
	 * @return name
	 */
	public String getName() {
		return name;
	}
	/**
	 * setta il nome reale dell'utente
	 * @param name
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * mostra il cognome dell'utente
	 * @return surname
	 */
	public String getSurname() {
		return surname;
	}
	/**
	 * setta il cognome dell'utente
	 * @param surname
	 */
	public void setSurname(String surname) {
		this.surname = surname;
	}
	/**
	 * mostra l'indirizzo dell'utente
	 * @return addres
	 */
	public String getAddres() {
		return addres;
	}
	/**
	 * setta l'indirizzo dell'utente
	 * @param addres
	 */
	public void setAddres(String addres) {
		this.addres = addres;
	}
	/**
	 * mostra la descrizione dell'utente
	 * @return description
	 */
	public String getDescription() {
		return description;
	}
	/**
	 * setta la descrizione dell'utente
	 * @param description
	 */
	public void setDescription(String description) {
		this.description = description;
	}
	/**
	 * mostra la partita iva dell'utente 
	 * @return VAT
	 */
	public String getVAT() {
		return VAT;
	}
	
		/**
		 * inserisce la partita iva 
		 * 
		 * per i titolari di aziende per farsi pubblicita.
	 */
	public void setVAT(String vAT) {
		VAT = vAT;
	
	}
	/**
	 * mostra il numero di cellulare dell'utente
	 * @return cellNumber
	 */
	public String getCellNumber() {
		return cellNumber;
	}
	/**
	 * setta il numero di cellulare dell'utente
	 * @param cellNumber
	 */
	public void setCellNumber(String cellNumber) {
		this.cellNumber = cellNumber;
	}
	/**
	 * mostra il sesso dell'utente
	 * @return sexOfTheUser
	 */
	public int getSexOfTheUser() {
		return sexOfTheUser;
	}
	/**
	 * setta il sesso dell'utente
	 * @param sexOfTheUser
	 */
	public void setSexOfTheUser(int sexOfTheUser) {
		this.sexOfTheUser = sexOfTheUser;
	}
	
	
	
}
