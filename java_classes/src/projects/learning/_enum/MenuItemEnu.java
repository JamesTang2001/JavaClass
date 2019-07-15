package projects.learning._enum;

public enum MenuItemEnu {
	
	EXIT(1, "離開"),
	FTOC(2, "華氏");
	private int itemId;
	private String itemDesc;
	MenuItemEnu(int itemId, String itemDesc) {
		this.itemId = itemId;
		this.itemDesc = itemDesc;
	}


}
