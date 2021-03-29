
public class Punkt {

	private int a;
	private int b;
	
	public void increaseA(){
		a++;
	}
	
	public void increaseB(){
		b++;
	}
	
	public void reduceA(int value) {
		a = a - value;
	}
	
	public void reduceB(int value) {
		b -= value;
	}
	
	public int getA() {
		return a;
	}
	public void setA(int a) {
		this.a = a;
	}
	public int getB() {
		return b;
	}
	public void setB(int b) {
		this.b = b;
	}
	
	
}
