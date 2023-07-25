
public class FinalMethodTest {
	public static void main(String[] args) {
		
		//Chess chess = new Chess();
		//chess.moveKnight();
		
		//GraphicalChess graphChess = new GraphicalChess();
		//graphChess.moveKnight();
		
		Chess chess = new GraphicalChess();
		
		Game.upload(chess);
	}
}

class Game { //Pratiksha
	
	static void upload(Chess chess) {
		System.out.println("Game is being uploaded....");
		chess.moveKnight();
		chess.moveRook();
	}
}

final class Chess //Shrijani written this class
{
	
	//below is the final version of the method
	void moveKnight() { //Math logic of this movement
		System.out.println("Math moving in L shape...2.5 steps");
	}
	void moveRook() {
		System.out.println("Math moving horizonal / vertical bidirectional 1/N steps");
	}
}

//The type GraphicalChess cannot subclass the final class Chess
class GraphicalChess extends Chess // Vikas 
{
	//Cannot override the final method from Chess
	void moveKnight() { //is it overridding??? YES
		super.moveKnight();
		System.out.println( " + Graphical Moving in L shape.in a frame..2.5 steps...");
	}
	void moveRook() {
		System.out.println("Graphically moving rook ANY direction 1/N steps");
	}
}


class WebGraphicalChess extends Chess // Shruti 
{
	void moveKnight() { //is it overridding??? YES
		super.moveKnight();
		System.out.println("+ Graphical Moving in L shape.in a web page..2.5 steps...");
	}
}