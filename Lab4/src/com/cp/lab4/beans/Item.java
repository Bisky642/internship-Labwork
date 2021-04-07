
package com.cp.lab4.beans;

public abstract class Item {

	private Integer id;
	private String title;
	private Integer nocopies;

	public Item(Integer id, String title, Integer nocopies) {
		super();
		this.id = id;
		this.title = title;
		this.nocopies = nocopies;
	}

	public Item() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * @param title the title to set
	 */
	public void setTitle(String title) {
		this.title = title;
	}

	/**
	 * @return the nocopies
	 */
	public Integer getNocopies() {
		return nocopies;
	}

	/**
	 * @param nocopies the nocopies to set
	 */
	public void setNocopies(Integer nocopies) {
		this.nocopies = nocopies;
	}

	/**
	 * @return the id
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Integer id) {
		this.id = id;
	}

}
