import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class LogTest {
	public static void main(String[] args) {
		
		//CONTENT - WATER
		System.out.println("Creating content...");
		Log log1 = new Log("INFO",LocalDateTime.now(),"Vishhal","File uploaded");
		Log log2 = new Log("WARN",LocalDateTime.now(),"Vishhal","File uploaded");
		Log log3 = new Log("ERR",LocalDateTime.now(),"Vishhal","File uploaded");
		Log log4 = new Log("DEBUG",LocalDateTime.now(),"Vishhal","File uploaded");
		Log log5 = new Log("FATAL",LocalDateTime.now(),"Vishhal","File uploaded");
		System.out.println("Content created ...");

		
		//CONTAINER - BOTTLE
		ArrayList logList = new ArrayList();
		System.out.println("Container is ready...");
		
		//ADDDING WATER IN THE BOTTLE - adding content in the container
		System.out.println("Adding content to the container....");
		logList.add(log1);
		logList.add(log2);
		logList.add(log3);
		logList.add(log4);
		logList.add(log5);
		System.out.println("Entire content is added to the container....");

		//NOW RETRIEVE THE STRAW FOR THE BOTTLE - retrieving iterator for the container
		Iterator logIterator = logList.iterator();
		System.out.println("Got the Iterator...now iterating the content....");
		while(logIterator.hasNext()) {
			Log x = (Log) logIterator.next(); //cast it to Log, as it was added as an Object
			System.out.println("Log : "+x);
		}
		
	}
}

class Log
{
	private String logType;
	private LocalDateTime logDateTime;
	private String logBy;
	private String logMessage;
	
	public Log(String logType, LocalDateTime logDateTime, String logBy, String logMessage) {
		super();
		this.logType = logType;
		this.logDateTime = logDateTime;
		this.logBy = logBy;
		this.logMessage = logMessage;
	}
	@Override
	public String toString() {
		return "Log [logType=" + logType + ", logDateTime=" + logDateTime + ", logBy=" + logBy + ", logMessage="
				+ logMessage + "]";
	}
	
	
}