class MyClass {
    public static void main(String[ ] args) {
        int z = sum(3,4);
        int s = sub(7,8);
        int m = mul(3,5);
        int d = dev(10,5);
        double mm = mod(23,4);
        System.out.println("The Sum is:" + z);
        System.out.println("Subtraction: "+s);
        System.out.println("Multiply: "+m);
        System.out.println("Division: "+d);
        System.out.println("Remainder: "+mm);
        
    }
    static int sum(int x,int y){
    	//System.out.print(x+y)
    	return x+y;
    }
    static int sub(int x, int y){
    	return x-y;
    }
    static int mul(int x, int y){
    	return x*y;
    }
    static int dev(int x, int y){
    	return x/y;
    }
    static int mod(int x, int y){
    	return x%y;
    }
}
