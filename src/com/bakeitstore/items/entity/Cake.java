package com.bakeitstore.items.entity;

public class Cake implements IBakeryItem{
	private Integer cakeId;
	private String cakeName;
	private String cakeFlavour;
	private Double cakeWeight;
	private String cakeShape;
	private String cakeType;
	private Boolean cakeAvailability;
	
	public Cake(Integer cakeId, String cakeName, String cakeFlavour,
			Double cakeWeight, String cakeShape, String cakeType,
			Boolean cakeAvailability) {
		super();
		this.cakeId = cakeId;
		this.cakeName = cakeName;
		this.cakeFlavour = cakeFlavour;
		this.cakeWeight = cakeWeight;
		this.cakeShape = cakeShape;
		this.cakeType = cakeType;
		this.cakeAvailability = cakeAvailability;
	}

	public Integer getCakeId() {
		return cakeId;
	}

	public void setCakeId(Integer cakeId) {
		this.cakeId = cakeId;
	}

	public String getCakeName() {
		return cakeName;
	}

	public void setCakeName(String cakeName) {
		this.cakeName = cakeName;
	}

	public String getCakeFlavour() {
		return cakeFlavour;
	}

	public void setCakeFlavour(String cakeFlavour) {
		this.cakeFlavour = cakeFlavour;
	}

	public Double getCakeWeight() {
		return cakeWeight;
	}

	public void setCakeWeight(Double cakeWeight) {
		this.cakeWeight = cakeWeight;
	}

	public String getCakeShape() {
		return cakeShape;
	}

	public void setCakeShape(String cakeShape) {
		this.cakeShape = cakeShape;
	}

	public String getCakeType() {
		return cakeType;
	}

	public void setCakeType(String cakeType) {
		this.cakeType = cakeType;
	}

	public Boolean getCakeAvailability() {
		return cakeAvailability;
	}

	public void setCakeAvailability(Boolean cakeAvailability) {
		this.cakeAvailability = cakeAvailability;
	}
}
