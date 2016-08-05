package net.ddns.droidfx.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Item {
	private int id;
	@JsonProperty("chat_link")
	private String chatLink;
	private String name;
	private String icon;
	private String description;
	private String type;
	private String rarity;
	private int level;
	@JsonProperty("vendor_value")
	private int vendorValue;
	@JsonProperty("default_skin")
	private int defaultSkin;
	private List<String> flags;
	@JsonProperty("game_types")
	private List<String> gameTypes;
	private List<String> restrictions;
	private Object details;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getChatLink() {
		return chatLink;
	}

	public void setChatLink(String chatLink) {
		this.chatLink = chatLink;
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

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getRarity() {
		return rarity;
	}

	public void setRarity(String rarity) {
		this.rarity = rarity;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	public int getVendorValue() {
		return vendorValue;
	}

	public void setVendorValue(int vendorValue) {
		this.vendorValue = vendorValue;
	}

	public int getDefaultSkin() {
		return defaultSkin;
	}

	public void setDefaultSkin(int defaultSkin) {
		this.defaultSkin = defaultSkin;
	}

	public List<String> getFlags() {
		return flags;
	}

	public void setFlags(List<String> flags) {
		this.flags = flags;
	}

	public List<String> getGameTypes() {
		return gameTypes;
	}

	public void setGameTypes(List<String> gameTypes) {
		this.gameTypes = gameTypes;
	}

	public List<String> getRestrictions() {
		return restrictions;
	}

	public void setRestrictions(List<String> restrictions) {
		this.restrictions = restrictions;
	}

	public Object getDetails() {
		return details;
	}

	public void setDetails(Object details) {
		this.details = details;
	}

	@Override
	public String toString() {
		return "Item [id=" + id + ", chatLink=" + chatLink + ", name=" + name + ", icon=" + icon + ", description="
				+ description + ", type=" + type + ", rarity=" + rarity + ", level=" + level + ", vendorValue="
				+ vendorValue + ", defaultSkin=" + defaultSkin + ", flags=" + flags + ", gameTypes=" + gameTypes
				+ ", restrictions=" + restrictions + ", details=" + details + "]";
	}

}
