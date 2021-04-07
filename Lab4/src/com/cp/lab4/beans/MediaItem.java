package com.cp.lab4.beans;

public abstract class MediaItem extends Item {
	private Integer runTime;
	public MediaItem(Integer id, String title, Integer nocopies,Integer runTime) {
		super(id, title, nocopies);
		this.runTime=runTime;
	}

	public MediaItem() {
		// TODO Auto-generated constructor stub
	}

}
