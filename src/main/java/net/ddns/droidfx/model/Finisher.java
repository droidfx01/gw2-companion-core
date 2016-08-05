package net.ddns.droidfx.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Finisher {
	private int id;
	@JsonProperty("unlock_details")
	private String unlockDetails;
	private int order;
	private String icon;
	private String name;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUnlockDetails() {
		return unlockDetails;
	}

	public void setUnlockDetails(String unlockDetails) {
		this.unlockDetails = unlockDetails;
	}

	public int getOrder() {
		return order;
	}

	public void setOrder(int order) {
		this.order = order;
	}

	public String getIcon() {
		return icon;
	}

	public void setIcon(String icon) {
		this.icon = icon;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Finisher [id=" + id + ", unlockDetails=" + unlockDetails + ", order=" + order + ", icon=" + icon
				+ ", name=" + name + "]";
	}

}
