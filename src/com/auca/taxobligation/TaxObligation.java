package com.auca.taxobligation;
import com.auca.abstracts.RegisteredTaxpayer;
import com.auca.taxtype.TaxType;
import java.time.LocalDate;
import com.auca.exceptions.ValidationException;
import com.auca.interfaces.*;

public class TaxObligation implements com.auca.interfaces.Identifiable, com.auca.interfaces.Validatable {
 private String obligationId;
 private com.auca.abstracts.RegisteredTaxpayer taxpayer;
 private com.auca.taxtype.TaxType taxType;
 private LocalDate periodStart;
 private LocalDate periodEnd;
 private LocalDate dueDate;
 public String getObligationId(){return obligationId;}
 public com.auca.abstracts.RegisteredTaxpayer getTaxpayer(){return taxpayer;}
 public com.auca.taxtype.TaxType getTaxType(){return taxType;}
 public LocalDate getPeriodStart(){return periodStart;}
 public LocalDate getPeriodEnd(){return periodEnd;}
 public LocalDate getDueDate(){return dueDate;}
 public String getId(){return obligationId;}
 public String getDisplayName(){return String.valueOf(obligationId);}
 public boolean isActive(){return true;}
 public void validate() throws ValidationException {
  // Add entity-specific validation and cross-record checks in the workflow layer.
 }
 public void printDetails(){System.out.println(getSummary());}
 public String getSummary(){return "TaxObligation: "+getDisplayName()+" ["+getId()+"]";}
}
