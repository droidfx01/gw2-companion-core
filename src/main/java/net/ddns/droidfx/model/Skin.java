package net.ddns.droidfx.model;

import java.util.List;

public class Skin {
	private int id;
	private String name;
	private String type;
	private List<String> flags;
	private List<String> restrictions;
	private String icon;
	private String rarity;
	private String description;
	private Object details;

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

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public List<String> getFlags() {
		return flags;
	}

	public void setFlags(List<String> flags) {
		this.flags = flags;
	}

	public List<String> getRestrictions() {
		return restrictions;
	}

	public void setRestrictions(List<String> restrictions) {
		this.restrictions = restrictions;
	}

	public String getIcon() {
		return icon;
	}

	public void setIcon(String icon) {
		this.icon = icon;
	}

	public String getRarity() {
		return rarity;
	}

	public void setRarity(String rarity) {
		this.rarity = rarity;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Object getDetails() {
		return details;
	}

	public void setDetails(Object details) {
		this.details = details;
	}

	@Override
	public String toString() {
		return "Skin [id=" + id + ", name=" + name + ", type=" + type + ", flags=" + flags + ", restrictions="
				+ restrictions + ", icon=" + icon + ", rarity=" + rarity + ", description=" + description + ", details="
				+ details + "]";
	}

}
