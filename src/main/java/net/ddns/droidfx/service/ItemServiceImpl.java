package net.ddns.droidfx.service;

import java.util.Arrays;
import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import net.ddns.droidfx.Gw2CompanionCoreApplication;
import net.ddns.droidfx.api.APIInfo;
import net.ddns.droidfx.model.Finisher;
import net.ddns.droidfx.model.Item;
import net.ddns.droidfx.model.ItemStats;
import net.ddns.droidfx.model.Material;
import net.ddns.droidfx.model.PvPAmulet;
import net.ddns.droidfx.model.Recipe;
import net.ddns.droidfx.model.Skin;

@Service(value = "ItemService")
public class ItemServiceImpl implements ItemService {

	private static final Logger LOG = LoggerFactory.getLogger(Gw2CompanionCoreApplication.class);

	private RestTemplate restTemplate = new RestTemplate();
	private static final String ITEM_RESOURCE = "items";
	private static final String ITEMSTATS_RESOURCE = "itemstats";

	@Override
	public Item getItemById(Integer id) {
		return restTemplate.getForObject(APIInfo.GW_V2_URL + ITEM_RESOURCE + "/" + id, Item.class);
	}

	@Override
	public List<Item> getItemsById(List<Integer> ids) {
		LOG.debug(APIInfo.GW_V2_URL + ITEM_RESOURCE + "?ids=" + StringUtils.join(ids, ","));

		Item[] responseObject = restTemplate
				.getForObject(APIInfo.GW_V2_URL + ITEM_RESOURCE + "?ids=" + StringUtils.join(ids, ","), Item[].class);
		return Arrays.asList(responseObject);
	}

	@Override
	public ItemStats getItemStatById(Integer id) {
		return restTemplate.getForObject(APIInfo.GW_V2_URL + ITEMSTATS_RESOURCE + "/" + id, ItemStats.class);
	}

	@Override
	public List<ItemStats> getItemStatsById(List<Integer> ids) {
		LOG.debug(APIInfo.GW_V2_URL + ITEMSTATS_RESOURCE + "?ids=" + StringUtils.join(ids, ","));

		ItemStats[] responseObject = restTemplate.getForObject(
				APIInfo.GW_V2_URL + ITEMSTATS_RESOURCE + "?ids=" + StringUtils.join(ids, ","), ItemStats[].class);
		return Arrays.asList(responseObject);
	}

	@Override
	public Finisher getFinisherById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Finisher> getFinishersById(List<Integer> ids) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Material getMaterialById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Material> getMaterialsById(List<Integer> ids) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public PvPAmulet getPvPAmuletById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<PvPAmulet> getPvPAmuletsById(List<Integer> ids) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Recipe getRecipesById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Recipe> getRecipessById(List<Integer> ids) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Integer> searchRecipe(Integer id, String searchType) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Skin getSkinById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Skin> getSkinsById(List<Integer> ids) {
		// TODO Auto-generated method stub
		return null;
	}

}
