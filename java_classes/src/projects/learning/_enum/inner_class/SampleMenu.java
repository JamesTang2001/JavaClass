package projects.learning._enum.inner_class;

import java.io.Console;

public class SampleMenu {
public enum SampleEnum {
	EXIT,
	FIRST,
	SECOND;

}

	private String[] items = { "離開", "第一項", "第二項" };

	public SampleEnum show() {

		for (int id = 0; id < items.length; id++) {
			System.out.println(items[id]);
		}
		Console console = System.console();
		if (console == null) {
			System.err.println("No console.");
			System.exit(1);
		}

		int ans = -1;
		while (true) {
			try {
				ans = Integer.valueOf(console.readLine("請輸入選項:"));

				if (ans != 0 && ans != 1 && ans != 2) {
					System.out.println("輸入數字錯誤!!");
					continue;
				} else {

					break;
				}
			} catch (NumberFormatException e) {
				System.out.println("請輸入整數!!");
			}

		}
		return SampleEnum.values()[ans];

	}

}
