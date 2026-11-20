package com.auca.penalty;
import com.auca.taxobligation.TaxObligation;
import java.math.BigDecimal;
import com.auca.exceptions.ValidationException;
import com.auca.interfaces.*;

public class Penalty implements com.auca.interfaces.Identifiable, com.auca.interfaces.Validatable {
 private String penaltyId;
 private com.auca.taxobligation.TaxObligation obligation;
 private String penaltyType;
 private BigDecimal baseAmount;
 private BigDecimal penaltyRate;
 private BigDecimal penaltyAmount;
 public String getPenaltyId(){return penaltyId;}
 public com.auca.taxobligation.TaxObligation getObligation(){return obligation;}
 public String getPenaltyType(){return penaltyType;}
 public BigDecimal getBaseAmount(){return baseAmount;}
 public BigDecimal getPenaltyRate(){return penaltyRate;}
 public BigDecimal getPenaltyAmount(){return penaltyAmount;}
 public String getId(){return penaltyId;}
 public String getDisplayName(){return String.valueOf(penaltyId);}
 public boolean isActive(){return true;}
 public void validate() throws ValidationException {
  // Add entity-specific validation and cross-record checks in the workflow layer.
 }
 public void printDetails(){System.out.println(getSummary());}
 public String getSummary(){return "Penalty: "+getDisplayName()+" ["+getId()+"]";}
}
