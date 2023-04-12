package week3.day2.homeAssignment2.abstraction;

public class Automation extends MultipleLangauge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Automation auto=new Automation();
		auto.java();
		auto.selenium();
		auto.python();
		auto.ruby();
	}

	public void java() {
		System.out.println("I am Unimplemented from Language interface");
		
	}

	public void selenium() {
		// TODO Auto-generated method stub
		System.out.println("I am Unimplemented from Testtool interface");
	}

	@Override
	public void ruby() {
		// TODO Auto-generated method stub
		System.out.println("I am Unimplemented from MultipleLanguage Abstract class");
	}

}
