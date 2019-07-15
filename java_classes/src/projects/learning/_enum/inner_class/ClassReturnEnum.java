package projects.learning._enum.inner_class;

public class ClassReturnEnum {
	
	public enum SampleEnum{
		EXIT,
		FIRST,
		SECOND;
	}
	
	public SampleEnum getSampleEnum() {
		return SampleEnum.EXIT;
	}
	public Enum getEnum() {
		return SampleEnum.EXIT;
	}

	public static void main(String[] args) {

		ClassReturnEnum c = new ClassReturnEnum();
		SampleEnum s = c.getSampleEnum();
		switch (s) {
		case EXIT:
			
			break;
		case FIRST:
			
			break;
		case SECOND:
			
			break;

		default:
			break;
		}
	}

}
