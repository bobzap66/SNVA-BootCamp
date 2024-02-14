package Day7_Feb_7_2024;

import java.util.List;

public abstract class Transaction {
	protected String id;
	protected String type;
	static int nextId = 1;
	protected String userId;
	protected List<Book> books;
	
	public void setId() {
		id = "TransID" + nextId;
		++nextId;
	}
	
	public abstract String toString();

}
