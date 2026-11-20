package com.auca.taxpayment;
import com.auca.taxassessment.TaxAssessment;
import java.math.BigDecimal;
import java.time.LocalDate;
import com.auca.exceptions.ValidationException;
import com.auca.interfaces.*;

public class TaxPayment implements com.auca.interfaces.Identifiable, com.auca.interfaces.Validatable {
 private String paymentId;
 private com.auca.taxassessment.TaxAssessment assessment;
 private String paymentReference;
 private BigDecimal amount;
 private LocalDate paymentDate;
 private String paymentMethod;
 public String getPaymentId(){return paymentId;}
 public com.auca.taxassessment.TaxAssessment getAssessment(){return assessment;}
 public String getPaymentReference(){return paymentReference;}
 public BigDecimal getAmount(){return amount;}
 public LocalDate getPaymentDate(){return paymentDate;}
 public String getPaymentMethod(){return paymentMethod;}
 public String getId(){return paymentId;}
 public String getDisplayName(){return String.valueOf(paymentId);}
 public boolean isActive(){return true;}
 public void validate() throws ValidationException {
  // Add entity-specific validation and cross-record checks in the workflow layer.
 }
 public void printDetails(){System.out.println(getSummary());}
 public String getSummary(){return "TaxPayment: "+getDisplayName()+" ["+getId()+"]";}
}
