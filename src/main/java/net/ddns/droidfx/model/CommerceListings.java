package net.ddns.droidfx.model;

import java.util.List;

public class CommerceListings {
	private int id;
	private List<Listing> buys;
	private List<Listing> sells;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public List<Listing> getBuys() {
		return buys;
	}

	public void setBuys(List<Listing> buys) {
		this.buys = buys;
	}

	public List<Listing> getSells() {
		return sells;
	}

	public void setSells(List<Listing> sells) {
		this.sells = sells;
	}

	@Override
	public String toString() {
		return "CommerceListing [id=" + id + ", buys=" + buys + ", sells=" + sells + "]";
	}

}
