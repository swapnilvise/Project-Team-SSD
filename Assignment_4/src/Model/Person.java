/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author swapn
 */
public class Person {
    
    private String personLastName;
    private String personFirstName;
    private String personDOB;
    private Integer personAge;
    private String personUniqueID;
    private String personStreetName;
    private String personAptNo;
    private String personCity;
    private String personState;
    private String personZipCode;
    private String personCountry;
    private Patient patient;

    public Person() {
        this.patient = new Patient();
    }
    
    

    public String getPersonLastName() {
        return personLastName;
    }

    public void setPersonLastName(String personLastName) {
        this.personLastName = personLastName;
    }

    public String getPersonFirstName() {
        return personFirstName;
    }

    public void setPersonFirstName(String personFirstName) {
        this.personFirstName = personFirstName;
    }

    public String getPersonDOB() {
        return personDOB;
    }

    public void setPersonDOB(String personDOB) {
        this.personDOB = personDOB;
    }

    public Integer getPersonAge() {
        return personAge;
    }

    public void setPersonAge(Integer personAge) {
        this.personAge = personAge;
    }

    

    public String getPersonUniqueID() {
        return personUniqueID;
    }

    public void setPersonUniqueID(String personUniqueID) {
        this.personUniqueID = personUniqueID;
    }

    public String getPersonStreetName() {
        return personStreetName;
    }

    public void setPersonStreetName(String personStreetName) {
        this.personStreetName = personStreetName;
    }

    public String getPersonAptNo() {
        return personAptNo;
    }

    public void setPersonAptNo(String personAptNo) {
        this.personAptNo = personAptNo;
    }

    public String getPersonCity() {
        return personCity;
    }

    public void setPersonCity(String personCity) {
        this.personCity = personCity;
    }

    public String getPersonState() {
        return personState;
    }

    public void setPersonState(String personState) {
        this.personState = personState;
    }

    public String getPersonZipCode() {
        return personZipCode;
    }

    public void setPersonZipCode(String personZipCode) {
        this.personZipCode = personZipCode;
    }

    public String getPersonCountry() {
        return personCountry;
    }

    public void setPersonCountry(String personCountry) {
        this.personCountry = personCountry;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }
    
    @Override
    public String toString()
    {
        return this.personLastName;
    }
    
}
