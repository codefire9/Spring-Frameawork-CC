package com.cts.stationarybill.bo;

import com.cts.stationarybill.vo.Item;
import com.cts.stationarybill.vo.MyCart;

public class CartBO {
	private MyCart cart;

	
	public CartBO() {
		// TODO Auto-generated constructor stub
	}
	public CartBO(MyCart cart) {
		super();
		this.cart = cart;
	}
	
	public MyCart getCart() {
		return cart;
	}
	public void setCart(MyCart cart) {
		this.cart = cart;
	}
	
	

	public double calculateBillAfterDiscount(double totalOrderBill) {

		//Code here..
		return 0.0;  //TODO, change this value
	}

	public int countNoteBook() {
		int count = 0;

		//Code here..

		return count;  //TODO, change this value
	} 

	public int countPen() {
		int count = 0;

		//Code here..

		return count;  //TODO, change this value
	}
}
