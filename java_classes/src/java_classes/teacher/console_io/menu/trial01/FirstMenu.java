package java_classes.teacher.console_io.menu.trial01;

public class FirstMenu extends AbstractMenu {
	/*
	 * 定義自己的enum
	 */
	public enum Menu {
		FIRST, EXIT;
	}
	public FirstMenu() {
		getConsole();
		Item[] items = {
				new Item('1', "第一項"),
				new Item('0', "離開")
		};
		setItems(items);
	}

	public Menu show() {
		char ans = showMenu();
		return Menu.values()[getEnumId()];
	}
}
