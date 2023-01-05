package grammers_basic_java;

public class MeterExam {

	public static void main(String[] args) {
		Taxi taxi = new Taxi();
		taxi.start();
        taxi.BASE_FARE = 2500;
		taxi.stop(0);

	}

}
