package com.auca.abstracts;
import java.time.LocalDate;
import com.auca.interfaces.*;
import com.auca.exceptions.ValidationException;
public abstract class TaxParty implements Identifiable, Validatable {
 private String partyId, firstName, lastName, email, phoneNumber;
 private LocalDate dateOfBirth;
 protected TaxParty() {}
 public String getPartyId(){return partyId;} public String getFirstName(){return firstName;} public String getLastName(){return lastName;}
 public String getEmail(){return email;} public String getPhoneNumber(){return phoneNumber;} public LocalDate getDateOfBirth(){return dateOfBirth;}
 public String getId(){return partyId;} public String getDisplayName(){return firstName+" "+lastName;} public boolean isActive(){return true;}
 public void validate() throws ValidationException { if(partyId==null||firstName==null||lastName==null||email==null||phoneNumber==null||dateOfBirth==null) throw new ValidationException("All party fields are required."); }
 public void printDetails(){System.out.println(getSummary());} public String getSummary(){return getDisplayName()+" ["+partyId+"]";}
}
