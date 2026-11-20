package com.auca.taxdeclaration;
import com.auca.taxobligation.TaxObligation;
import java.math.BigDecimal;
import java.time.LocalDate;
import com.auca.exceptions.ValidationException;
import com.auca.interfaces.*;

public class TaxDeclaration implements com.auca.interfaces.Identifiable, com.auca.interfaces.Validatable {
 private String declarationId;
 private com.auca.taxobligation.TaxObligation obligation;
 private LocalDate filingDate;
 private BigDecimal taxableAmount;
 private BigDecimal declaredTax;
 private String status;
 public String getDeclarationId(){return declarationId;}
 public com.auca.taxobligation.TaxObligation getObligation(){return obligation;}
 public LocalDate getFilingDate(){return filingDate;}
 public BigDecimal getTaxableAmount(){return taxableAmount;}
 public BigDecimal getDeclaredTax(){return declaredTax;}
 public String getStatus(){return status;}
 public String getId(){return declarationId;}
 public String getDisplayName(){return String.valueOf(declarationId);}
 public boolean isActive(){return true;}
 public void validate() throws ValidationException {
  // Add entity-specific validation and cross-record checks in the workflow layer.
 }
 public void printDetails(){System.out.println(getSummary());}
 public String getSummary(){return "TaxDeclaration: "+getDisplayName()+" ["+getId()+"]";}
}
