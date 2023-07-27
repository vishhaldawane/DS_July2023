
public class FlightTest {
	public static void main(String[] args) {
		CommercialFlight commFlight = new CommercialFlight();
		/*commFlight.checkTicket();
		commFlight.checkIdentityOfCPassengers();
		commFlight.fly();
		commFlight.land();*/
		
		System.out.println("-----------");
		
		FighterFlight fightFlight = new FighterFlight();
		/*fightFlight.armMissiles();
		fightFlight.fly();
		fightFlight.fireMissile();
		fightFlight.land();*/
		
		System.out.println("-----------");
		
		CargoFlight cargoFlight = new CargoFlight();
		/*cargoFlight.checkTheCapacity();
		cargoFlight.carryGoods();
		cargoFlight.fly();
		cargoFlight.land();*/
		
		RadarControlSystem.checkFlyingObjects(commFlight);
		RadarControlSystem.checkFlyingObjects(fightFlight);
		RadarControlSystem.checkFlyingObjects(cargoFlight);

		
		GroundOperation.checkLandingStatus(commFlight);
		GroundOperation.checkLandingStatus(fightFlight);
		GroundOperation.checkLandingStatus(cargoFlight);

		/*	Flying f = commFlight;
		f.fly();
		
		f = fightFlight;
		
		f.fly();
		
		f  = cargoFlight;
		
		f.fly();*/
	}
}

class RadarControlSystem
{
	static void checkFlyingObjects(Flying x) {
		System.out.println("CHECKING FLYING OBJECTS....");
		//x.checkIdentityOfCPassengers();
		//x.checkTicket();
		x.fly();
		//x.land();
	}
}
class GroundOperation {
	static void checkLandingStatus(Landing x) {
		System.out.println("Checking the landing objects....");
		x.land();
	}
}


/*
			Flying		Landing
				|fly();		|land();
				-------------
					   |  Runnable
					   |   |
					   |  |
					   |  |
					   Flight
					 	|
					 	|
					-------------------------------------------------
					|							|					|
					|     Ticketing				| Fighting			| Carrying
					|	   |checkTickets();		|  |fireMissile();	| | carryGoods();
					|	   |					|  |				| |
				CommercialFlight			FighterFlight			CargoFlight

CommercialFlight commFlight = new ....();
Thread t  = new Thread(commFlight);
t.start();

*/
interface Flying {
	void fly();
}
interface Landing {
	void land();
}
abstract class Flight extends Thread implements Flying,Landing {
	
}

interface Ticketing {
	void checkTicket();
}
interface Fighting {
	void fireMissile();
}
interface Carrying {
	void carryGoods();
}

class CommercialFlight extends Flight implements Ticketing {

	@Override
	public void fly() {
		System.out.println("Commercial Flight is flying");
		
	}

	@Override
	public void land() {
		System.out.println("Commercial Flight is landing");
		
	}

	@Override
	public void checkTicket() {
		System.out.println("Commercial Flight ...checking tickets....");		
	}
	
	void checkIdentityOfCPassengers() {
		System.out.println("Commercial Flight is checking identities of passengers...");
	}
	
}

class FighterFlight extends Flight implements Fighting {

	@Override
	public void fly() {
		System.out.println("FighterFlight Flight is flying");
		
	}

	@Override
	public void land() {
		System.out.println("FighterFlight Flight is landing");
		
	}

	@Override
	public void fireMissile() {
		System.out.println("FighterFlight  ... firing missile....");		
	}
	
	public void armMissiles() {
		System.out.println("Fighter Flight is arming the missiles...");
	}
	
}

class CargoFlight extends Flight implements Carrying {

	@Override
	public void fly() {
		System.out.println("CargoFlight Flight is flying");
		
	}

	@Override
	public void land() {
		System.out.println("CargoFlight Flight is landing");
		
	}

	@Override
	public void carryGoods() {
		System.out.println("CargoFlight  ... carrying goods....");		
	}
	
	void checkTheCapacity() {
		System.out.println("CargoFlight is checking the carriage capacity ");
	}
	
}