package net.ddns.droidfx.model;

public class Listing {
	private int listings;
	private int unitPrice;
	private int quantity;

	public int getListings() {
		return listings;
	}

	public void setListings(int listings) {
		this.listings = listings;
	}

	public int getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(int unitPrice) {
		this.unitPrice = unitPrice;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	@Override
	public String toString() {
		return "Listing [listings=" + listings + ", unitPrice=" + unitPrice + ", quantity=" + quantity + "]";
	}

}
