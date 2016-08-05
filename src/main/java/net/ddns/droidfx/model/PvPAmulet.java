package net.ddns.droidfx.model;

import java.util.HashMap;

public class PvPAmulet {
	private int id;
	private String name;
	private String icon;
	private HashMap<String, Double> attributes;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getIcon() {
		return icon;
	}

	public void setIcon(String icon) {
		this.icon = icon;
	}

	public HashMap<String, Double> getAttributes() {
		return attributes;
	}

	public void setAttributes(HashMap<String, Double> attributes) {
		this.attributes = attributes;
	}

	@Override
	public String toString() {
		return "PvPAmulet [id=" + id + ", name=" + name + ", icon=" + icon + ", attributes=" + attributes + "]";
	}

}
