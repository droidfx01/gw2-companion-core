package net.ddns.droidfx.model;

public class CommercePrices {

	private int id;
	private boolean whitelisted;
	private Listing buys;
	private Listing sells;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public boolean isWhitelisted() {
		return whitelisted;
	}

	public void setWhitelisted(boolean whitelisted) {
		this.whitelisted = whitelisted;
	}

	public Listing getBuys() {
		return buys;
	}

	public void setBuys(Listing buys) {
		this.buys = buys;
	}

	public Listing getSells() {
		return sells;
	}

	public void setSells(Listing sells) {
		this.sells = sells;
	}

	@Override
	public String toString() {
		return "CommercePrices [id=" + id + ", whitelisted=" + whitelisted + ", buys=" + buys + ", sells=" + sells
				+ "]";
	}

}
