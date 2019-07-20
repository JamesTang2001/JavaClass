package java_classes.teacher.generics;

public class NonGenericBox {

	private Object object;

	public void set(Object object) {
		this.object = object;
	}

	public Object get() {
		return object;
	}

	public static void main(String[] args) {

		/*
		 * 這個設計的問題是：你可以丟任意類型的物件進去
		 * 但是：你沒辦法知道丟進去的是什麼，只有當時丟進去的人才知道
		 * 才有辦法取出後適當的「轉型」，也才有辦法使用
		 * 應該是說：你放得進去，但取出來不知是什麼××
		 */
		// we want to keep a int as Integer in box
		int secrectId = 89213;
		Integer integer = new Integer(secrectId);
		
		NonGenericBox box = new NonGenericBox();
		
		box.set(integer);
		
		//Now we can get it out, but only as Object
		
		Object o = box.get();
		
		//to use it, we have to convert to original type, but not everyone knows this.
		
		int secret = ((Integer)o).intValue();
	}

}
