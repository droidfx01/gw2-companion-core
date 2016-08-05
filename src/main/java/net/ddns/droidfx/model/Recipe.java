package net.ddns.droidfx.model;

import java.util.HashMap;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Recipe {
	private int id;
	private String type;
	@JsonProperty("output_item_id")
	private int outputItemId;
	@JsonProperty("output_item_count")
	private int outputItemCount;
	@JsonProperty("time_to_craft")
	private int timeToCraft;
	private List<String> disciplines;
	@JsonProperty("min_rating")
	private int minRating;
	private List<String> flags;
	private HashMap<Integer, Integer> ingredients;
	@JsonProperty("guild_ingretients")
	private HashMap<Integer, Integer> guildIngredients;
	@JsonProperty("output_upgrade_id")
	private int outputUpgradeId;
	@JsonProperty("chat_link")
	private String chatLink;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getOutputItemId() {
		return outputItemId;
	}

	public void setOutputItemId(int outputItemId) {
		this.outputItemId = outputItemId;
	}

	public int getOutputItemCount() {
		return outputItemCount;
	}

	public void setOutputItemCount(int outputItemCount) {
		this.outputItemCount = outputItemCount;
	}

	public int getTimeToCraft() {
		return timeToCraft;
	}

	public void setTimeToCraft(int timeToCraft) {
		this.timeToCraft = timeToCraft;
	}

	public List<String> getDisciplines() {
		return disciplines;
	}

	public void setDisciplines(List<String> disciplines) {
		this.disciplines = disciplines;
	}

	public int getMinRating() {
		return minRating;
	}

	public void setMinRating(int minRating) {
		this.minRating = minRating;
	}

	public List<String> getFlags() {
		return flags;
	}

	public void setFlags(List<String> flags) {
		this.flags = flags;
	}

	public HashMap<Integer, Integer> getIngredients() {
		return ingredients;
	}

	public void setIngredients(HashMap<Integer, Integer> ingredients) {
		this.ingredients = ingredients;
	}

	public HashMap<Integer, Integer> getGuildIngredients() {
		return guildIngredients;
	}

	public void setGuildIngredients(HashMap<Integer, Integer> guildIngredients) {
		this.guildIngredients = guildIngredients;
	}

	public int getOutputUpgradeId() {
		return outputUpgradeId;
	}

	public void setOutputUpgradeId(int outputUpgradeId) {
		this.outputUpgradeId = outputUpgradeId;
	}

	public String getChatLink() {
		return chatLink;
	}

	public void setChatLink(String chatLink) {
		this.chatLink = chatLink;
	}

	@Override
	public String toString() {
		return "Recipe [id=" + id + ", type=" + type + ", outputItemId=" + outputItemId + ", outputItemCount="
				+ outputItemCount + ", timeToCraft=" + timeToCraft + ", disciplines=" + disciplines + ", minRating="
				+ minRating + ", flags=" + flags + ", ingredients=" + ingredients + ", guildIngredients="
				+ guildIngredients + ", outputUpgradeId=" + outputUpgradeId + ", chatLink=" + chatLink + "]";
	}

}
