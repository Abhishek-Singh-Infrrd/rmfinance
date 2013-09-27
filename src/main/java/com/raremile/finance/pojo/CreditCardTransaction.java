package com.raremile.finance.pojo;

import java.util.Date;

import com.google.gson.Gson;

public class CreditCardTransaction {



	private String custId;


	private String cardNo;


	private Integer amount;


	private Date date;


	private String merchant;


	public CreditCardTransaction()
	{

	}

	/**
	 * @return the custId
	 */
	public String getCustId() {
		return custId;
	}
	/**
	 * @param custId the custId to set
	 */
	public void setCustId(final String custId) {
		this.custId = custId;
	}
	/**
	 * @return the cardNo
	 */
	public String getCardNo() {
		return cardNo;
	}
	/**
	 * @param cardNo the cardNo to set
	 */
	public void setCardNo(final String cardNo) {
		this.cardNo = cardNo;
	}
	/**
	 * @return the amount
	 */
	public Integer getAmount() {
		return amount;
	}
	/**
	 * @param amount the amount to set
	 */
	public void setAmount(final Integer amount) {
		this.amount = amount;
	}
	/**
	 * @return the date
	 */
	public Date getDate() {
		return date;
	}
	/**
	 * @param date the date to set
	 */
	public void setDate(final Date date) {
		this.date = date;
	}
	/**
	 * @return the merchant
	 */
	public String getMerchant() {
		return merchant;
	}
	/**
	 * @param merchant the merchant to set
	 */
	public void setMerchant(final String merchant) {
		this.merchant = merchant;
	}



	public static void main(final String[] args) {

		CreditCardTransaction cardTransaction = new CreditCardTransaction();
		cardTransaction.setAmount(100);
		cardTransaction.setCardNo("101XX1001");
		cardTransaction.setCustId("1232342342");
		cardTransaction.setDate(new Date());
		cardTransaction.setMerchant("MK Ahmed");

		Gson gson = new Gson();

		System.out.println(gson.toJson(cardTransaction));
	}

}
