/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.ArrayList;

/**
 *
 * @author swapn
 */
public class PersonDirectory {
    
//    PatientDirectory ptd;
    
    private ArrayList<Person> personDirectory;

    public PersonDirectory() {
        this.personDirectory=new ArrayList<>();
    }

    public ArrayList<Person> getPersonDirectory() {
        return personDirectory;
    }

    public void setPersonDirectory(ArrayList<Person> personDirectory) {
        this.personDirectory = personDirectory;
    }
    
    public Person addNewPerson(){
        Person person =new Person();
        this.personDirectory.add(person);
        return person;
    }
    
    public void deletePerson(Person pr){
        personDirectory.remove(pr);
        return;
    }
    
    public void PersonList(){
        Person pr1 = new Person();
        pr1.setPersonLastName("Bond");
        pr1.setPersonFirstName("James");
        pr1.setPersonDOB("10/11/1990");
        pr1.setPersonAge(31);
        pr1.setPersonUniqueID("R1");
        pr1.setPersonStreetName("N. Alfred Street");
        pr1.setPersonAptNo("007");
        pr1.setPersonCity("Los Angeles");
        pr1.setPersonState("CA");
        pr1.setPersonZipCode("02120");
        pr1.setPersonCountry("USA");
        personDirectory.add(pr1);
//        ptd.addNewPatient(pr1);

        Person pr2 = new Person();
        pr2.setPersonLastName("Bond");
        pr2.setPersonFirstName("James");
        pr2.setPersonDOB("10/11/1990");
        pr2.setPersonAge(31);
        pr2.setPersonUniqueID("R2");
        pr2.setPersonStreetName("N. Alfred Street");
        pr2.setPersonAptNo("007");
        pr2.setPersonCity("Los Angeles");
        pr2.setPersonState("CA");
        pr2.setPersonZipCode("02125");
        pr2.setPersonCountry("USA");
        personDirectory.add(pr2);
        
        Person pr3 = new Person();
        pr3.setPersonLastName("Bond");
        pr3.setPersonFirstName("James");
        pr3.setPersonDOB("10/11/1990");
        pr3.setPersonAge(31);
        pr3.setPersonUniqueID("R3");
        pr3.setPersonStreetName("N. Alfred Street");
        pr3.setPersonAptNo("007");
        pr3.setPersonCity("Los Angeles");
        pr3.setPersonState("CA");
        pr3.setPersonZipCode("02130");
        pr3.setPersonCountry("USA");
        personDirectory.add(pr3);
    }
    
}
