package java_classes.teacher.generics;

public class GenericBox<Type> {
	private Type type;

	public Type get() {
		return type;
	}

	public void set(Type type) {
		this.type = type;
	}

	public static void main(String[] args) {

		GenericBox<Integer> box = new GenericBox<Integer>();
		
		
		int secrectId = 89213;
		Integer integer = new Integer(secrectId);
		
		box.set(integer);
		
		Integer secret = box.get();
		
		System.out.println("The secret in the box is :"+secret);
	}

}
