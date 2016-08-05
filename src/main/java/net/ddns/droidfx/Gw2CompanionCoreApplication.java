package net.ddns.droidfx;

import java.util.Arrays;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import net.ddns.droidfx.model.Item;
import net.ddns.droidfx.model.ItemStats;
import net.ddns.droidfx.service.ItemService;

@SpringBootApplication
public class Gw2CompanionCoreApplication implements CommandLineRunner {

	private static final Logger LOG = LoggerFactory.getLogger(Gw2CompanionCoreApplication.class);

	@Autowired
	ItemService itemService;

	public static void main(String[] args) {
		SpringApplication.run(Gw2CompanionCoreApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		List<ItemStats> itemStatsList = itemService.getItemStatsById(Arrays.asList(1012, 1011));
		for (ItemStats itemStats : itemStatsList) {
			LOG.info(itemStats.toString());
		}

		List<Item> itemList = itemService.getItemsById(Arrays.asList(12452, 28445));
		for (Item item : itemList) {
			LOG.info(item.toString());
		}

	}
}
