/*
 * Author: Diana Knieste
 * Date: March 5, 2015
 * Assignment: PS3
 */

import java.util.Date;
import java.io.*;

public class Account {

	// Private data fields
	private int id = 0;
	private double balance = 0;
	private double annualInterestRate = 0;
	private Date dateCreated;

	// No-arg constructor
	public Account() {
	}

	// Constructor
	public Account(int id, double balance) {
		this.id = id;
		this.balance = balance;
		this.dateCreated = new Date();
	}

	// Accessor for id
	public int getId() {
		return this.id;
	}

	// Accessor for balance
	public double getBalance() {
		return this.balance;
	}

	// Accessor for annualInterestRate
	public double getAnnualInterestRate() {
		return this.annualInterestRate;
	}

	// Accessor for dateCreated
	public Date getDateCreated() {
		return this.dateCreated;
	}

	// Mutator for id
	public void setId(int id) {
		this.id = id;
	}

	// Mutator for balance
	public void setBalance(double balance) {
		this.balance = balance;
	}

	// Mutator for annualnterestRate
	public void setAnnualInterestRate(double annualInterestRate) {
		this.annualInterestRate = annualInterestRate;
	}

	// Method for Monthly Interest Rate
	public double getMonthyInterestRate() {
		return annualInterestRate / 12;
	}

	// Method for withdrawal
	public void withdraw(double amount) throws InsufficientFundsException {
		if (amount <= balance) {
			balance -= amount;
		} else {
			double amountShort = amount - balance;
			throw new InsufficientFundsException(amountShort);
		}
	}

	// Method for deposit
	public void deposit(double amount) {
		balance += amount;
	}

}
