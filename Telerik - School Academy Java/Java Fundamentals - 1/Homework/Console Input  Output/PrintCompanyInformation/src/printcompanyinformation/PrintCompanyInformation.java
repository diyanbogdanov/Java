/*
* A company has name, address, phone number, fax number, web site and manager. The manager has first name, last name, age and a phone number.
* Write a program that reads the information about a company and its manager and prints it back on the console.
*/package printcompanyinformation;

import java.util.Scanner;

public class PrintCompanyInformation {

    public static void main(String[] args) {
        String companyName;
        String companyAddress;
        String phoneNumber;
        String faxNumber;
        String webSite;
        String managerFName;
        String managerSName;
        byte managerAge;
        String managerPhoneNumber;
        String outprint;
        Scanner sc;
        
        sc = new Scanner(System.in);
        
        System.out.print("Company name: ");
        companyName = sc.nextLine();
        
        System.out.print("Company address: ");
        companyAddress = sc.nextLine();
        
        System.out.print("Company phone number: ");
        phoneNumber = sc.nextLine();
        
        System.out.print("Company fax number: ");
        faxNumber = sc.nextLine();
        
        System.out.print("Company website: ");
        webSite = sc.nextLine();
        
        System.out.print("Company manager first name: ");
        managerFName = sc.nextLine();
        
        System.out.print("Company manager second name: ");
        managerSName = sc.nextLine();
        
        System.out.print("Company manager phone number: ");
        managerPhoneNumber = sc.nextLine();
        
        System.out.print("Company manager age: ");
        managerAge = sc.nextByte();
        
        outprint = String.format("%s\nAddress: %s\nTel. %s\nFax: %s\nWebsite: %s\nManager: %s %s (age: %d, tel. %s)",companyName, companyAddress, phoneNumber, faxNumber, webSite ,managerFName, managerSName, managerAge, managerPhoneNumber);
        
        System.out.println(outprint);
    }
    
}
