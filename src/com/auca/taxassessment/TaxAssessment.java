package com.auca.taxassessment;
import com.auca.taxdeclaration.TaxDeclaration;
import java.math.BigDecimal;
import java.time.LocalDate;
import com.auca.exceptions.ValidationException;
import com.auca.interfaces.*;

public class TaxAssessment implements com.auca.interfaces.Identifiable, com.auca.interfaces.Validatable {
 private String assessmentId;
 private com.auca.taxdeclaration.TaxDeclaration declaration;
 private BigDecimal assessedTax;
 private BigDecimal adjustmentAmount;
 private LocalDate assessmentDate;
 private String status;
 public String getAssessmentId(){return assessmentId;}
 public com.auca.taxdeclaration.TaxDeclaration getDeclaration(){return declaration;}
 public BigDecimal getAssessedTax(){return assessedTax;}
 public BigDecimal getAdjustmentAmount(){return adjustmentAmount;}
 public LocalDate getAssessmentDate(){return assessmentDate;}
 public String getStatus(){return status;}
 public String getId(){return assessmentId;}
 public String getDisplayName(){return String.valueOf(assessmentId);}
 public boolean isActive(){return true;}
 public void validate() throws ValidationException {
  // Add entity-specific validation and cross-record checks in the workflow layer.
 }
 public void printDetails(){System.out.println(getSummary());}
 public String getSummary(){return "TaxAssessment: "+getDisplayName()+" ["+getId()+"]";}
}
