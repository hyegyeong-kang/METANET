package kosa.order;

public class Item {
	// 모델명, 가격
	private String modelName;
	private String price;
	
	public Item() {}
	
	public Item(String modelName, String price) {
		super();
		this.modelName = modelName;
		this.price = price;
	}

	public String getModelName() {
		return modelName;
	}

	public void setModelName(String modelName) {
		this.modelName = modelName;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}
}
