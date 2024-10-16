import java.util.ArrayList;

public class cart extends product{
	private String prod;
	ArrayList<String> items = new ArrayList<>();
	
	public ArrayList<String> getItems() {
		return items;
	}

	public void setItems(ArrayList<String> items) {
		this.items = items;
	}
	
	public void writeItems(ArrayList<String> items) {
		this.items.add(getProd());
	}

	public String getProd() {
		return prod;
	}

	public void setProd(String prod) {
		this.prod = prod;
	}
}
