package quiz1;

public class QuizMan {

	int age = 1;
	String manName;
	boolean isMarried;
	int numberOfKids;

	
	public int getAge() {
		return age; 
	}	
	
	public void setAge(int a) {
		age = a;
	}

	public static void main(String[] args) {
	    QuizMan manJames = new QuizMan();
	   // manJames.age = 40;
	    manJames.setAge(41);
	    manJames.manName = "James";
		manJames.isMarried = true;
		manJames.numberOfKids = 3;
	
		System.out.println(manJames.getAge());
		System.out.println(manJames.age);
		System.out.println(manJames.isMarried);
		System.out.println(manJames.manName + " " + manJames.numberOfKids);
	}
}
