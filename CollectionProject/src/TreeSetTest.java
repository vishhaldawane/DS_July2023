import java.util.Iterator;
import java.util.TreeSet;

class ChemicalElement implements Comparable<ChemicalElement>
{
	int atomicNumber;
	String atomicName;
	String atomicFormula;
	float atomicWeight;
	
//	@Override
//	public int compareTo(ChemicalElement o) { //k1.kiteFifght(k2)
//		System.out.println("Comparing "+atomicNumber+" with "+o.atomicNumber);
//		System.out.println("-------------");
//		return Integer.compare(o.atomicNumber, atomicNumber);
//	
//	}
	
//	@Override
//	public int compareTo(ChemicalElement o) { //k1.kiteFifght(k2)
//		System.out.println("Comparing "+atomicName+" with "+o.atomicName);
//		System.out.println("-------------");
//		return atomicName.compareTo(o.atomicName);
//	
//	}
	
	@Override
	public int compareTo(ChemicalElement o) { //k1.kiteFifght(k2)
		System.out.println("Comparing "+atomicWeight+" with "+o.atomicWeight);
		System.out.println("-------------");
		return Float.compare(atomicWeight, o.atomicWeight);
	
	}
	public ChemicalElement(int atomicNumber, String atomicName, String atomicFormula, float atomicWeight) {
		super();
		this.atomicNumber = atomicNumber;
		this.atomicName = atomicName;
		this.atomicFormula = atomicFormula;
		this.atomicWeight = atomicWeight;
	}
	@Override
	public String toString() {
		return "ChemicalElement [atomicNumber=" + atomicNumber + ", atomicName=" + atomicName + ", atomicFormula="
				+ atomicFormula + ", atomicWeight=" + atomicWeight + "]";
	}
	
	
	
}
public class TreeSetTest {
	public static void main(String[] args) {
		ChemicalElement element1 = new ChemicalElement(8, "Oxygen", "O", 15.999f);
		ChemicalElement element2 = new ChemicalElement(2, "Helium", "He", 4.0026f);
		ChemicalElement element3 = new ChemicalElement(1, "Hydrogen", "H", 1.008f);
		
		ChemicalElement element4 = new ChemicalElement(14, "Silicon", "Si", 28.085f);
		ChemicalElement element5 = new ChemicalElement(33, "Arsenic", "As", 74.92f);
		System.out.println("Elements are created....");
		
		TreeSet periodicTableSet = new TreeSet();
		System.out.println("Empty Periodic Table is created....");
		
		System.out.println("NOW ..Adding the first element...");
		periodicTableSet.add(element1);
		
		System.out.println("NOW ..Adding the second element...");
		periodicTableSet.add(element2);
		
		System.out.println("NOW ..Adding the third element...");
		periodicTableSet.add(element3);
		
		System.out.println("NOW ..Adding the fourth element...");
		periodicTableSet.add(element4);
		
		System.out.println("NOW ..Adding the fifth element...");
		periodicTableSet.add(element5);
		
		System.out.println("Added all the elements...");
		
		//Reward reward			 = magician.doTrick();
		Iterator elementIterator =  periodicTableSet.iterator();
		
		while(elementIterator.hasNext()) {
			ChemicalElement theElement = (ChemicalElement) elementIterator.next();
			System.out.println("Element : "+theElement );
		}
		
		
	}
}