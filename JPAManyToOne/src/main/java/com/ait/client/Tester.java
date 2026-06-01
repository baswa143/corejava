package com.ait.client;

import com.ait.entities.Customer;
import com.ait.entities.Loan;
import com.ait.dao.LoanDAO;
import com.ait.dao.impl.LoanDAOImpl;

public class Tester {
    public static void main(String[] args) {
        LoanDAO dao=new LoanDAOImpl();

//        Loan pLoan = new Loan();
//        pLoan.setLoanId(101101);
//        pLoan.setLoanType("Personal Loan");
//        pLoan.setAmount(10000.0);
        Loan vLoan = new Loan();
        vLoan.setLoanId(101104);
        vLoan.setLoanType(" vehicle Loan");
        vLoan.setAmount(100000.0);
//
        Loan eLoan = new Loan();
        eLoan.setLoanId(101104);
        eLoan.setLoanType(" education Loan");
        eLoan.setAmount(100000.0);
//
//        Loan hLoan = new Loan();
//        hLoan.setLoanId(101103);
//        hLoan.setLoanType("Home Loan");
//        hLoan.setAmount(10000.0);
//
//        Customer customer = new Customer();
//        customer.setCustomerId(301);
//        customer.setCustomerName("shiva");
//
//
//        pLoan.setCustomer(customer);
//        vLoan.setCustomer(customer);
//        hLoan.setCustomer(customer);
//
//        dao.saveLoan(pLoan);
       // dao.saveLoan(vLoan);
//        dao.saveLoan(hLoan);
        dao.saveLoan(eLoan);

        //fetchLoanDetails

//        Loan loan=dao.fetchLoanDetailsById(101101);
//        System.out.println(loan);
//        Customer c=loan.getCustomer();
//        System.out.println(c);

        //remove
//        dao.removeLoan(101102);

    }
}
