package com.auca.taxrefund;
import com.auca.abstracts.RegisteredTaxpayer;
import com.auca.taxassessment.TaxAssessment;
import java.math.BigDecimal;
import java.time.LocalDate;
import com.auca.exceptions.ValidationException;
import com.auca.interfaces.*;

public class TaxRefund implements com.auca.interfaces.Identifiable, com.auca.interfaces.Validatable {
 private String refundId;
 private com.auca.abstracts.RegisteredTaxpayer taxpayer;
 private com.auca.taxassessment.TaxAssessment assessment;
 private BigDecimal requestedAmount;
 private LocalDate requestDate;
 private String status;
 public String getRefundId(){return refundId;}
 public com.auca.abstracts.RegisteredTaxpayer getTaxpayer(){return taxpayer;}
 public com.auca.taxassessment.TaxAssessment getAssessment(){return assessment;}
 public BigDecimal getRequestedAmount(){return requestedAmount;}
 public LocalDate getRequestDate(){return requestDate;}
 public String getStatus(){return status;}
 public String getId(){return refundId;}
 public String getDisplayName(){return String.valueOf(refundId);}
 public boolean isActive(){return true;}
 public void validate() throws ValidationException {
  // Add entity-specific validation and cross-record checks in the workflow layer.
 }
 public void printDetails(){System.out.println(getSummary());}
 public String getSummary(){return "TaxRefund: "+getDisplayName()+" ["+getId()+"]";}
}
