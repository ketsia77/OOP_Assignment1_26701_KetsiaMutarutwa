package com.auca.abstracts;
import java.time.LocalDate;
import com.auca.exceptions.ValidationException;
public abstract class RegisteredTaxpayer extends TaxParty {
 private String tin, taxpayerStatus, district, sector, taxOffice;
 private LocalDate registrationDate;
 protected RegisteredTaxpayer() { super(); }
 public String getTin(){return tin;} public LocalDate getRegistrationDate(){return registrationDate;} public String getTaxpayerStatus(){return taxpayerStatus;}
 public String getDistrict(){return district;} public String getSector(){return sector;} public String getTaxOffice(){return taxOffice;}
 public boolean isActive(){return "ACTIVE".equalsIgnoreCase(taxpayerStatus);}
 public void validate() throws ValidationException { super.validate(); if(tin==null||!tin.matches("[0-9]{9}")) throw new ValidationException("TIN must be exactly 9 digits."); }
}
