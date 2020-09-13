// here in this program we will perform a test to check StringBuffer Vs StringBuilder

class PerformaneTest{
	public static void main(String args[]){
		
		long st = System.currentTimeMillis();
		StringBuffer buffer = new StringBuffer("Java Test");
		
		for(int i = 1; i <= 100000; i++){
			buffer.append("Test");
		}
		
		System.out.println("Time taken by StringBuffer: " + (System.currentTimeMillis() - st) + "ms" );


		st = System.currentTimeMillis();
		StringBuilder builder = new StringBuilder("Java Test");
		
		for(int i = 1; i <= 100000; i++){
			builder.append("Test");
		}

		System.out.println("Time taken by StringBuilder: " + (System.currentTimeMillis() - st) + "ms");

	}
}

// string buffer is less efficient than String builder