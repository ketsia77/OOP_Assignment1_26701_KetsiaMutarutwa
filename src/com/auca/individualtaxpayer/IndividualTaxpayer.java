package com.auca.individualtaxpayer;
import java.math.BigDecimal;
import java.time.LocalDate;
import com.auca.exceptions.ValidationException;
import com.auca.interfaces.*;

public class IndividualTaxpayer extends com.auca.abstracts.RegisteredTaxpayer {
 private String nationalId;
 private String occupation;
 private String businessName;
 private LocalDate businessStartDate;
 private BigDecimal annualTurnover;
 private boolean resident;
 public String getNationalId(){return nationalId;}
 public String getOccupation(){return occupation;}
 public String getBusinessName(){return businessName;}
 public LocalDate getBusinessStartDate(){return businessStartDate;}
 public BigDecimal getAnnualTurnover(){return annualTurnover;}
 public boolean getResident(){return resident;}
 public String getId(){return getPartyId();}
 public String getDisplayName(){return String.valueOf(getDisplayName());}
 public boolean isActive(){return super.isActive();}
 public void validate() throws ValidationException {
  super.validate();
  // Add entity-specific validation and cross-record checks in the workflow layer.
 }
 public void printDetails(){System.out.println(getSummary());}
 public String getSummary(){return "IndividualTaxpayer: "+getDisplayName()+" ["+getId()+"]";}
}
