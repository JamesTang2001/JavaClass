package java_classes.teacher.generics;

public class UseEnum<T extends Enum> {
	private T t;
	
	public void set(T t) {
		this.t = t;
	}
	public T get() {
		return this.t;
	}
	
	public static void main(String[] args) {
		UseEnum<AEnum> box = new UseEnum<AEnum>();
		
		box.set(AEnum.FIRST);
		
		switch (box.get()) {
		case FIRST:
		System.out.println("Horay!! We did it!!");
			break;

		case SECOND:
			
			break;

		case EXIT:
			
			break;

		default:
			break;
		}
	}

}
