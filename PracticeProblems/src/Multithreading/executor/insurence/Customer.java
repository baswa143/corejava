package Multithreading.executor.insurence;

public class Customer {
    String customername;
    String policyNumber;
    String messege;
    double premium;

    public Customer(String customername, String policyNumber,  double premium) {
        this.customername=customername;
        this.policyNumber=policyNumber;
        this.premium=premium;
    }

    public String getCustomername() {
        return customername;
    }

    public void setCustomername(String customername) {
        this.customername = customername;
    }

    public String getPolicyNumber() {
        return policyNumber;
    }

    public void setPolicyNumber(String policyNumber) {
        this.policyNumber = policyNumber;
    }

    public String getMessege() {
        return messege;
    }

    public void setMessege(String messege) {
        this.messege = messege;
    }

    public double getPremium() {
        return premium;
    }

    public void setPremium(double premium) {
        this.premium = premium;
    }
}
