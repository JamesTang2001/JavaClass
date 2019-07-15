/*
 * 設計：一個共用show()的抽象選單
 * 內容：
 *	內部自己宣告的enum class
 *	 		
 */
package projects.learning._enum.inner_class;

public abstract class AbstractMenu {
	
	abstract protected boolean isAnsOK(int ans);
	
	public Enum show() {
		return null;
	}

}
