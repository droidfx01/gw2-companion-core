package net.ddns.droidfx.service;

import java.util.List;

import net.ddns.droidfx.model.Finisher;
import net.ddns.droidfx.model.Item;
import net.ddns.droidfx.model.ItemStats;
import net.ddns.droidfx.model.Material;
import net.ddns.droidfx.model.PvPAmulet;
import net.ddns.droidfx.model.Recipe;
import net.ddns.droidfx.model.Skin;

public interface ItemService {
	public Item getItemById(Integer id);

	public List<Item> getItemsById(List<Integer> ids);

	public ItemStats getItemStatById(Integer id);

	public List<ItemStats> getItemStatsById(List<Integer> ids);

	public Finisher getFinisherById(Integer id);

	public List<Finisher> getFinishersById(List<Integer> ids);

	public Material getMaterialById(Integer id);

	public List<Material> getMaterialsById(List<Integer> ids);

	public PvPAmulet getPvPAmuletById(Integer id);

	public List<PvPAmulet> getPvPAmuletsById(List<Integer> ids);

	public Recipe getRecipesById(Integer id);

	public List<Recipe> getRecipessById(List<Integer> ids);

	public List<Integer> searchRecipe(Integer id, String searchType);

	public Skin getSkinById(Integer id);

	public List<Skin> getSkinsById(List<Integer> ids);

}
