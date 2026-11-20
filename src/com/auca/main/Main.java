package com.auca.main;
import java.util.Scanner;
import com.auca.abstracts.TaxParty;
import com.auca.interfaces.Identifiable;
public class Main {
 private static final Scanner INPUT=new Scanner(System.in);
 private static final TaxParty[] parties=new TaxParty[100];
 private static final Identifiable[] records=new Identifiable[500];
 private static int partyCount=0,recordCount=0;
 public static void main(String[] args){boolean run=true;while(run){menu();String c=INPUT.nextLine().trim();switch(c){
 case "1": action("Register Individual Taxpayer");break; case "2":action("Register Corporate Taxpayer");break;
 case "3":action("Register Revenue Officer");break;case "4":action("Register Tax Type");break;case "5":action("Create Tax Obligation");break;
 case "6":action("File Tax Declaration");break;case "7":action("Assess Declaration");break;case "8":action("Confirm Assessment");break;
 case "9":viewRecords();break;case "10":action("View Declaration History");break;case "11":action("View Assessment History");break;
 case "12":action("Record Tax Payment");break;case "13":action("Calculate / Record Penalty");break;case "14":action("Request / Approve Refund");break;
 case "15":action("Request / Issue Tax Clearance");break;case "16":action("Search Record by ID / TIN");break;case "17":action("Update Eligible Record");break;
 case "18":action("View Taxpayer Statement");break;case "19":action("View Outstanding Balances");break;case "20":action("View Tax Reports");break;
 case "21":polymorphism();break;case "0":run=false;System.out.println("Goodbye.");break;default:System.out.println("Choose 0-21.");}}}
 private static void menu(){System.out.println("\n====== TAX ADMINISTRATION MANAGEMENT ======");System.out.println("1 Register Individual Taxpayer   12 Record Tax Payment");System.out.println("2 Register Corporate Taxpayer    13 Calculate / Record Penalty");System.out.println("3 Register Revenue Officer       14 Request / Approve Refund");System.out.println("4 Register Tax Type              15 Request / Issue Tax Clearance");System.out.println("5 Create Tax Obligation          16 Search Record by ID / TIN");System.out.println("6 File Tax Declaration           17 Update Eligible Record");System.out.println("7 Assess Declaration             18 View Taxpayer Statement");System.out.println("8 Confirm Assessment             19 View Outstanding Balances");System.out.println("9 View All Records               20 View Tax Reports");System.out.println("10 View Declaration History      21 Demonstrate Polymorphism");System.out.println("11 View Assessment History       0 Exit");System.out.print("Select option: ");}
 private static void action(String name){System.out.println(name+" selected. Implement the corresponding four-step workflow here.");}
 private static void viewRecords(){System.out.println("Party records: "+partyCount+"; other records: "+recordCount);for(int i=0;i<partyCount;i++)System.out.println(parties[i].getSummary());}
 private static void polymorphism(){TaxParty[] partyView=parties;Identifiable[] identifiableView=records;System.out.println("TaxParty[] and Identifiable[] polymorphism arrays are ready.");for(int i=0;i<partyCount;i++)System.out.println(partyView[i].getDisplayName());for(int i=0;i<recordCount;i++)System.out.println(identifiableView[i].getDisplayName());}
}
