package com.auca.taxclearance;
import com.auca.abstracts.RegisteredTaxpayer;
import com.auca.revenueofficer.RevenueOfficer;
import java.time.LocalDate;
import com.auca.exceptions.ValidationException;
import com.auca.interfaces.*;

public class TaxClearance implements com.auca.interfaces.Identifiable, com.auca.interfaces.Validatable {
 private String clearanceId;
 private com.auca.abstracts.RegisteredTaxpayer taxpayer;
 private LocalDate requestDate;
 private LocalDate expiryDate;
 private String status;
 private com.auca.revenueofficer.RevenueOfficer approvedBy;
 public String getClearanceId(){return clearanceId;}
 public com.auca.abstracts.RegisteredTaxpayer getTaxpayer(){return taxpayer;}
 public LocalDate getRequestDate(){return requestDate;}
 public LocalDate getExpiryDate(){return expiryDate;}
 public String getStatus(){return status;}
 public com.auca.revenueofficer.RevenueOfficer getApprovedBy(){return approvedBy;}
 public String getId(){return clearanceId;}
 public String getDisplayName(){return String.valueOf(clearanceId);}
 public boolean isActive(){return true;}
 public void validate() throws ValidationException {
  // Add entity-specific validation and cross-record checks in the workflow layer.
 }
 public void printDetails(){System.out.println(getSummary());}
 public String getSummary(){return "TaxClearance: "+getDisplayName()+" ["+getId()+"]";}
}
