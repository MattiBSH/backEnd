/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facades;

import dtos.PersonDTO;
import dtos.PersonsDTO;
import exceptions.PersonNotFoundException;

/**
 *
 * @author matti
 */
public interface IPersonFacade {
  public PersonDTO addPerson(String fName, String lName, String phone,String street, String zip, String city);  
  public PersonDTO deletePerson(int id) throws PersonNotFoundException;  
  public PersonDTO getPerson(int id) throws PersonNotFoundException;  
  public PersonsDTO getAllPersons() throws PersonNotFoundException;  
  public PersonDTO editPerson(PersonDTO p) throws PersonNotFoundException;;  
}
