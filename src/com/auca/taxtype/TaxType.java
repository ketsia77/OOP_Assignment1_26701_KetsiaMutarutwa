package com.auca.taxtype;
import java.math.BigDecimal;
import com.auca.exceptions.ValidationException;
import com.auca.interfaces.*;

public class TaxType implements com.auca.interfaces.Identifiable, com.auca.interfaces.Validatable {
 private String taxTypeId;
 private String taxCode;
 private String taxName;
 private BigDecimal rate;
 private String filingFrequency;
 private boolean active;
 public String getTaxTypeId(){return taxTypeId;}
 public String getTaxCode(){return taxCode;}
 public String getTaxName(){return taxName;}
 public BigDecimal getRate(){return rate;}
 public String getFilingFrequency(){return filingFrequency;}
 public boolean getActive(){return active;}
 public String getId(){return taxTypeId;}
 public String getDisplayName(){return String.valueOf(taxName);}
 public boolean isActive(){return active;}
 public void validate() throws ValidationException {
  // Add entity-specific validation and cross-record checks in the workflow layer.
 }
 public void printDetails(){System.out.println(getSummary());}
 public String getSummary(){return "TaxType: "+getDisplayName()+" ["+getId()+"]";}
}
