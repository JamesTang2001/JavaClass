package java_classes.teacher.console_io.menu.trial01;

public class Item {
	private final char index;
	private final String desc;


	public Item(char index, String item) {
		this.index = index;
		this.desc = item;
	}


	public char getIndex() {
		return index;
	}


	public String getDesc() {
		return desc;
	}
	
}
