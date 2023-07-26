import javax.swing.JFrame;
import javax.swing.JTextField;

public class FrameTest {
	public static void main(String[] args) {
	
		MyFrame frame1 = new MyFrame(200,100,100,100,"Frame1");
		MyFrame frame2 = new MyFrame(200,100,400,100,"Frame2");
		MyFrame frame3 = new MyFrame(200,100,700,100,"Frame3");
		
		frame1.setVisible(true);
		frame2.setVisible(true);
		frame3.setVisible(true);
		
		frame1.startFrame();
		frame2.startFrame();
		frame3.startFrame();
		
		/*frame1.setVisible(true);
		frame2.setVisible(true);
		frame3.setVisible(true);
		*/
		
		/*Thread thread1 = new Thread(frame1);
		Thread thread2 = new Thread(frame2);
		Thread thread3 = new Thread(frame3);
		
		thread1.start();
		thread2.start();
		thread3.start();*/

	}
}

class MyFrame extends JFrame implements Runnable //ctrl + shift + M
{
	private JTextField data = new JTextField();
	private Thread t; //hasA
	
	MyFrame(int x, int y, int c, int r, String title) {
		super(title);
		setSize(x,y);
		setLocation(c,r);
		add(data);
		t = new Thread(this);
		
	}
	public void run() { //mandatory
		for(int i=1;i<=1000000;i++) {
			data.setText(""+i);
		}
	}
	public void startFrame() {
		t.start();
	}
}
