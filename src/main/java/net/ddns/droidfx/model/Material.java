package net.ddns.droidfx.model;

import java.util.List;

public class Material {
	private int id;
	private String name;
	private List<Integer> items;

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

	public List<Integer> getItems() {
		return items;
	}

	public void setItems(List<Integer> items) {
		this.items = items;
	}

	@Override
	public String toString() {
		return "Material [id=" + id + ", name=" + name + ", items=" + items + "]";
	}

}
