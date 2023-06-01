package myobj;

public class Human {

	
		
	public int age ;
	public int height;
	public int weight;

	public Human(int age, int height,int weight) {
		
		this.age = age;
		this.height = height;
		this.weight = weight;
	}
	public void mypreage () {
		age += 1;	
	}
	public void mypostage () {
		age -= 1;	
	}
	public void mypreheight () {
		height += 1;
	}
	public void mypostheight () {
		height -= 1;
	}
	
	public void mypreweight () {
		weight += 1;
	}
	public void mypostweight () {
		weight -= 1;
	}

	public void info1() {
		System.out.printf("나이: %d\n 키: %d\n 몸무게: %s\n",
				this.age, this.height, this.weight);
}
}