package node;

import java.util.*;

// TODO: Finish adding data support. Just copy the data methods and modify.

public class Node {
	private String name = null;
	private NodeData data = new NodeData();
	private final List<Node> children = new ArrayList<>();
	private Node parent = null;

	// Constructs a free-standing Node
	public Node() {
	}

	// Constructs a free-standing Node with data
	public Node(Object data) {
		this.data.setData(new Object[] { data });
	}

	// Constructs a free-standing Node with name and data
	public Node(String name, Object data) {
		this.name = name;
		this.data.setData(new Object[] { data });
	}

	// Constructs a free-standing Node with data
	public Node(Object[] data) {
		this.data.setData(data);
	}

	// Constructs a free-standing Node with name and data
	public Node(String name, Object[] data) {
		this.name = name;
		this.data.setData(data);
	}

	// Sets name for this Node
	public void setName(String name) {
		this.name = name;
	}

	// Returns the Node's name
	public String getName() {
		return this.name;
	}

	// Sets data for this Node
	public void setData(Object data) {
		this.data.setData(new Object[] { data });
	}

	// Sets data for this Node
	public void setData(Object[] data) {
		this.data.setData(data);
	}

	// Returns the Node's data
	public Object[] getData() {
		return this.data.getData();
	}

	// Returns the Node's data type
	public String getDataType() {
		return this.data.getType();
	}

	// Returns the parent Node
	public Node getParent() {
		return this.parent;
	}

	// Returns a List of Nodes containing the node's children
	public List<Node> getChildren() {
		return this.children;
	}

	// Adds a child to the Node
	public Node addChild() {
		Node node = new Node();
		this.getChildren().add(node);

		return node;
	}

	// Adds a child to the Node with data
	public Node addChild(Object data) {
		Node node = new Node();
		node.setData(new Object[] { data });
		this.getChildren().add(node);

		return node;
	}

	// Adds a child to the Node with name and data
	public Node addChild(String name, Object data) {
		Node node = new Node();
		node.setData(new Object[] { data });
		this.getChildren().add(node);
		node.name = name;

		return node;
	}

	// Adds a child to the Node with data
	public Node addChild(Object[] data) {
		Node node = new Node();
		node.setData(data);
		this.getChildren().add(node);

		return node;
	}

	// Adds a child to the Node with name and data
	public Node addChild(String name, Object[] data) {
		Node node = new Node();
		node.setData(data);
		this.getChildren().add(node);
		node.name = name;

		return node;
	}

	// Default no-argument printer; uses a compounding prefix of " "
	public void printNode() {
		printNode(this, " ");
	}

	// Prints the contents of the Node to the command line
	public void printNode(String prefix) {
		printNode(this, prefix);
	}

	// Prints the contents of any Node to the command line
	public void printNode(Node node, String prefix) {
		String delimiter = "";
		String printer = "";

		// Kill it if we don't have data
		if (node.getData().length == 0) {
			return;
		}

		// If we don't have a name, skip trying to print it
		if (node.getName() != null) {
			printer = prefix + node.name + ": ";
		} else {
			printer = prefix;
		}

		// Add the data objects to an ArrayList
		ArrayList<Object> data = new ArrayList<Object>();
		for (int j = 0; j < node.getData().length; j++) {
			data.add(node.getData()[j]);
		}

		// Iterate through the data, casting as we go
		for (int i = 0; i < node.getData().length; i++) {
			// Set up by adding the delimiter to the printer
			printer += delimiter;

			// Iterate through the ArrayList created above and check the type
			// of each object in the list to cast-print appropriately
			for (Object o : data) {
				String localDelimiter = "";

				if (o instanceof Integer) {
					printer += (int) o;
				} else if (o instanceof Integer[]) {
					localDelimiter = "";

					for (int j : (Integer[]) o) {
						printer += localDelimiter + j;
						localDelimiter = ", ";
					}
				} else if (o instanceof String) {
					printer += (String) o;
				}
			}

			// Reset the delimiter (or set it the first time)
			delimiter = ", ";
		}

		// Print the output we've collected
		System.out.println(printer);

		// Enter the loop again with each child Node
		// This way we get a nested hierarchy
		for (Node child : node.getChildren()) {
			printNode(child, prefix + prefix);
		}
	}
}