
public class calc {
	double plus(double a, double b) {
		return a+b;
	}
	double plus(int a, double b) {
		return (double)a+b;
	}
	double plus(double a, int b) {
		return (double)a+b;
	}
	double minus(double a, double b) {
		return a-b;
	}
	double kobeitu(double a, double b) {
		return a*b;
	}
	double bolu(double a, double b) {
		return a/b;
	}
	double kvadrat(double a) {
		return Math.pow(a, 2);
	}
	double tubir(double a) {
		return Math.sqrt(a);
	}
	double percent(double a) {
		return a/100;
	}
}
