package com.auca.corporatetaxpayer;
import java.math.BigDecimal;
import java.time.LocalDate;
import com.auca.exceptions.ValidationException;
import com.auca.interfaces.*;

public class CorporateTaxpayer extends com.auca.abstracts.RegisteredTaxpayer {
 private String companyRegistrationNo;
 private String legalName;
 private LocalDate incorporationDate;
 private String businessSector;
 private String authorizedRepresentative;
 private BigDecimal annualTurnover;
 public String getCompanyRegistrationNo(){return companyRegistrationNo;}
 public String getLegalName(){return legalName;}
 public LocalDate getIncorporationDate(){return incorporationDate;}
 public String getBusinessSector(){return businessSector;}
 public String getAuthorizedRepresentative(){return authorizedRepresentative;}
 public BigDecimal getAnnualTurnover(){return annualTurnover;}
 public String getId(){return getPartyId();}
 public String getDisplayName(){return String.valueOf(getDisplayName());}
 public boolean isActive(){return super.isActive();}
 public void validate() throws ValidationException {
  super.validate();
  // Add entity-specific validation and cross-record checks in the workflow layer.
 }
 public void printDetails(){System.out.println(getSummary());}
 public String getSummary(){return "CorporateTaxpayer: "+getDisplayName()+" ["+getId()+"]";}
}
