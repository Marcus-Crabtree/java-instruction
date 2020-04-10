package business;

public class LineItem {
	private int id;
	private int RequestID;
	private int ProductID;
	private int quantity;
	
	public LineItem() {
		super();
	}

	public LineItem(int id, int requestID, int productID, int quantity) {
		super();
		this.id = id;
		RequestID = requestID;
		ProductID = productID;
		this.quantity = quantity;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getRequestID() {
		return RequestID;
	}

	public void setRequestID(int requestID) {
		RequestID = requestID;
	}

	public int getProductID() {
		return ProductID;
	}

	public void setProductID(int productID) {
		ProductID = productID;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	@Override
	public String toString() {
		return "LineItem [id=" + id + ", RequestID=" + RequestID + ", ProductID=" + ProductID + ", quantity=" + quantity
				+ "]";
	}
	
	
	

}
