class Example {
	public int a;
	Example(int a){
		this.a=a;
	}
	void x() {
		int b=2;
		//b=2;
		System.out.print(b);
		a=1;
	}
	void disp() {
		System.out.println(a);
		//System.out.println(b);
	}
	public static void main(String args[]) {
		Example ob=new Example(5);
		ob.x();
		ob.disp();
	}
}
