
public class ClassExtensionTest {

	public static void main(String[] args) {
		
		Doctor       x = new Surgeon();
		x.diagnose(); //compile time binding is of Doctor::dignose()	
					//but at runtime it finds the HeartSurgon's object
					//hence runtime binding is  of HeartSurgeon::diagnose()
		x.prescribe();
		x.charge();
		//x.cut();
		//x.stitch();
		
	//	Surgeon 	 x = new Surgeon();
	//	x.diagnose();
		
		//HeartSurgeon x = new HeartSurgeon();
		//x.diagnose();
	/*	
		
		if(x instanceof Doctor) {
			System.out.println("Its a Doctor's object");
		}
		else {
			System.out.println("Its not a Doctor's object");
		}
		
		System.out.println("-----------");

		if(x instanceof Surgeon) {
			System.out.println("Its a Surgeon's object");
		}
		else {
			System.out.println("Its not a Surgeon's object");
		}
		
		System.out.println("-----------");

		if(x instanceof HeartSurgeon) {
			System.out.println("Its a HeartSurgeon's object");
		}
		else {
			System.out.println("Its not a HeartSurgeon's object");
		}
		*/
		
	}

}
class Doctor {
	void diagnose() { //1.exclusive to Doctor
		System.out.println("Doctor: is diagnosing...ENT checkup....");
	}
	void prescribe() {
		System.out.println("Doctor: is prescribing...RGB pills....");
	}
	void charge() {
		System.out.println("Doctor: is charging...300/- ...");
	}
}
class Surgeon extends Doctor {
	//2. Doctor's dignose() is inherited to Surgeon 
	
	void diagnose() {
		System.out.println("Surgeon: is diagnosing...CT Scan/MRI Scan....");

	}
	void prescribe() {
		System.out.println("Surgeon: is prescribing...expensive pills....");
	}
	void charge() {
		System.out.println("Surgeon: is charging...1000/- ...");
	}
	void cut() {
		System.out.println("Surgeon: is cutting......");
	}
	void stitch() {
		System.out.println("Surgeon: is stitching......");
	}
}
class HeartSurgeon extends Surgeon {
	void diagnose() {
		System.out.println("HeartSurgeon: is diagnosing...ECG Report....");

	}
	void prescribe() {
		System.out.println("HeartSurgeon: is prescribing...expensive pills....plus yoga..plus exercises");
	}
	void charge() {
		System.out.println("HeartSurgeon: is charging...3000/- ...");
	}
}
