package com.auca.revenueofficer;
import java.math.BigDecimal;
import java.time.LocalDate;
import com.auca.exceptions.ValidationException;
import com.auca.interfaces.*;

public class RevenueOfficer extends com.auca.abstracts.TaxParty {
 private String staffNumber;
 private String department;
 private String role;
 private LocalDate hireDate;
 private BigDecimal approvalLimit;
 private boolean active;
 public String getStaffNumber(){return staffNumber;}
 public String getDepartment(){return department;}
 public String getRole(){return role;}
 public LocalDate getHireDate(){return hireDate;}
 public BigDecimal getApprovalLimit(){return approvalLimit;}
 public boolean getActive(){return active;}
 public String getId(){return getPartyId();}
 public String getDisplayName(){return String.valueOf(getDisplayName());}
 public boolean isActive(){return true;}
 public void validate() throws ValidationException {
  super.validate();
  // Add entity-specific validation and cross-record checks in the workflow layer.
 }
 public void printDetails(){System.out.println(getSummary());}
 public String getSummary(){return "RevenueOfficer: "+getDisplayName()+" ["+getId()+"]";}
}
