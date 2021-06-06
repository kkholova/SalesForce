package models;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Leads {
    String leadStatus;
    String phone;
    String salutation;
    String firstName;
    String lastName;
    String company;
    String email;
    String title;
    String rating;
    String street;
    String website;
    String city;
    String state;
    String zip;
    String country;
    String numberOfEmployees;
    String leadSource;
    String annualRevenue;
    String industry;
    String description;
    String accountName;

//    public Leads(String leadStatus, String phone, String salutation, String firstName, String lastName, String company,
//                 String email, String title, String rating, String street, String website, String city, String state, String zip,
//                 String country, String numberOfEmployees, String leadSource, String annualRevenue, String industry, String description) {
//        this.leadStatus = leadStatus;
//        this.phone = phone;
//        this.salutation = salutation;
//        this.firstName = firstName;
//        this.lastName = lastName;
//        this.company = company;
//        this.email = email;
//        this.title = title;
//        this.rating = rating;
//        this.street = street;
//        this.website = website;
//        this.city = city;
//        this.state = state;
//        this.zip = zip;
//        this.country = country;
//        this.numberOfEmployees = numberOfEmployees;
//        this.leadSource = leadSource;
//        this.annualRevenue = annualRevenue;
//        this.industry = industry;
//        this.description = description;
//    }
//
//    public String getLeadStatus() {
//        return leadStatus;
//    }
//
//    public void setLeadStatus(String leadStatus) {
//        this.leadStatus = leadStatus;
//    }
//
//    public String getPhone() {
//        return phone;
//    }
//
//    public void setPhone(String phone) {
//        this.phone = phone;
//    }
//
//    public String getSalutation() {
//        return salutation;
//    }
//
//    public void setSalutation(String salutation) {
//        this.salutation = salutation;
//    }
//
//    public String getFirstName() {
//        return firstName;
//    }
//
//    public void setFirstName(String firstName) {
//        this.firstName = firstName;
//    }
//
//    public String getLastName() {
//        return lastName;
//    }
//
//    public void setLastName(String lastName) {
//        this.lastName = lastName;
//    }
//
//    public String getCompany() {
//        return company;
//    }
//
//    public void setCompany(String company) {
//        this.company = company;
//    }
//
//    public String getEmail() {
//        return email;
//    }
//
//    public void setEmail(String email) {
//        this.email = email;
//    }
//
//    public String getTitle() {
//        return title;
//    }
//
//    public void setTitle(String title) {
//        this.title = title;
//    }
//
//    public String getRating() {
//        return rating;
//    }
//
//    public void setRating(String rating) {
//        this.rating = rating;
//    }
//
//    public String getStreet() {
//        return street;
//    }
//
//    public void setStreet(String street) {
//        this.street = street;
//    }
//
//    public String getWebsite() {
//        return website;
//    }
//
//    public void setWebsite(String website) {
//        this.website = website;
//    }
//
//    public String getCity() {
//        return city;
//    }
//
//    public void setCity(String city) {
//        this.city = city;
//    }
//
//    public String getState() {
//        return state;
//    }
//
//    public void setState(String state) {
//        this.state = state;
//    }
//
//    public String getZip() {
//        return zip;
//    }
//
//    public void setZip(String zip) {
//        this.zip = zip;
//    }
//
//    public String getCountry() {
//        return country;
//    }
//
//    public void setCountry(String country) {
//        this.country = country;
//    }
//
//    public String getNumberOfEmployees() {
//        return numberOfEmployees;
//    }
//
//    public void setNumberOfEmployees(String numberOfEmployees) {
//        this.numberOfEmployees = numberOfEmployees;
//    }
//
//    public String getLeadSource() {
//        return leadSource;
//    }
//
//    public void setLeadSource(String leadSource) {
//        this.leadSource = leadSource;
//    }
//
//    public String getAnnualRevenue() {
//        return annualRevenue;
//    }
//
//    public void setAnnualRevenue(String annualRevenue) {
//        this.annualRevenue = annualRevenue;
//    }
//
//    public String getIndustry() {
//        return industry;
//    }
//
//    public void setIndustry(String industry) {
//        this.industry = industry;
//    }
//
//    public String getDescription() {
//        return description;
//    }
//
//    public void setDescription(String description) {
//        this.description = description;
//    }
}
