package rahul;

public class Test {
	
	    void add(String s)
	    {
	        System.out.println("method 1");
	    }
	    void add(int a, int b)
	    {
	        System.out.println("method 2");
	    }
	    public static void main(String[] args) {
	        Test address = new Test();
	        address.add("Hello");
	        address.add(2, 4);
	    }
	}


