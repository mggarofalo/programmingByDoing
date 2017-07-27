package node;

public class NodeData {
	private String type = null;
	private Object[] data = null;

	// Constructs an empty NodeData
	public NodeData() {
	}

	// Constructs a NodeData
	public NodeData(Object data) {
		this.data = new Object[] { data };
		this.setType();
	}

	// Constructs a NodeData
	public NodeData(Object[] data) {
		this.data = data;
		this.setType();
	}

	// Sets the NodeData's type
	private void setType() {
		this.type = this.data.getClass().getName();
	}

	// Sets the NodeData's data
	public void setData(Object data) {
		this.data = new Object[] { data };
		this.setType();
	}

	// Sets the NodeData's data
	public void setData(Object[] data) {
		this.data = data;
		this.setType();
	}

	// Returns the NodeData's type
	public String getType() {
		return this.type;
	}

	// Returns the NodeData's data
	public Object[] getData() {
		return this.data;
	}
}