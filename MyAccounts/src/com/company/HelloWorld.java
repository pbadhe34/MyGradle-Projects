package com.company;

public class HelloWorld {
	private int num;
	
    public String sayHello() {
        return "Hello World";
    }
    
    private String getSearchString(String name)
    {
    	System.out.println("HelloWorld.getSearchString()");
    	 name.substring(3);
    	 return name;
    }
    
 
    public static void main( String[] args ) {
        HelloWorld w = new HelloWorld();
        w.sayHello();
    }
    public void testNewCode()
    {
    	System.out.println("Test new code here in account class");
    	String name ="user Name Here";
    	name.substring(5);
    	 
    }

}