package myfirstpackage;
public class MyFirstPackage {
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
    public MyFirstPackage(){
		A = 1;
		B = 1;
	}
    public MyFirstPackage(int A, int B){
		this.A = A;
		this.B = B;
	}
	public int multiplication(){
		return (A*B);
	}
}