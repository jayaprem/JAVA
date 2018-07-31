	class TestFloatDouble{
	//public static void main(String args[]){
	public static double result;
public static TestFloatDouble get()
	{
	float f1=2.0f;
	double d1=4.0;
	result=f1*d1;
	return new TestFloatDouble();
	}
	public static void main(String args[]){
		TestFloatDouble t=get();
		System.out.println(t.result);
		
              }
	}
