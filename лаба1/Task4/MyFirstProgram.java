class MyFirstClass {
    public static void main(String[] s) {
        MySecondClass test = new MySecondClass();
        int i, j;
        for (i = 1; i <= 8; i++) {
            for (j = 1; j <= 8; j++) {
                test.setA(i);
                test.setB(j);
                System.out.print(test.multiplication());
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
class MySecondClass {
	private int A;
	private int B;
	public void setA(int A){
		this.A = A;
	}
	public void setB(int B){
		this.B = B;
	}
	public int getA(){
		return A;
	}
	public int getB(){
		return B;
	}
	MySecondClass(){
		A = 1;
		B = 1;
	}
	MySecondClass(int A, int B){
		this.A = A;
		this.B = B;
	}
	public int multiplication(){
		return (A*B);
	}
}