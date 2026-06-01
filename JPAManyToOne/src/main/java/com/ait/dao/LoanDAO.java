package com.ait.dao;

import com.ait.entities.Loan;

public interface LoanDAO {
    void saveLoan(Loan loan);
    Loan fetchLoanDetailsById(Integer loanId);
    void removeLoan(Integer loanId);
}
