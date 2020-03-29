package io.mulshankar13.datastructures.tree;

class Node {
	int value;
	Node leftNode;
	Node rightNode;

	/**
	 * Inserting into tree
	 * 
	 * @param root
	 * @param value
	 * @return node
	 */
	static Node insert(Node root, int value) { // insert into a tree
		Node newNode = null;
		if (null == root) { // if tree is empty
			newNode = new Node();
			newNode.leftNode = null;
			newNode.rightNode = null;
			newNode.value = value;
			return newNode;
		}
		if (value == root.value) { // duplicate value
			return null;
		}
		if (value > root.value) { // insert into the left sub tree
			root.leftNode = insert(root.leftNode, value);
		} else if (value < root.value) { // insert into the right sub tree
			root.rightNode = insert(root.rightNode, value);
		}
		return root;
	}

	/**
	 * Bench-marked with online solutions
	 * 
	 * @param root
	 * @param key
	 * @return Node
	 */
	static Node search(Node root, int key) {

		if (root == null || root.value == key) { // root is null or a match
			return root;
		}

		if (key > root.value) { // search the left sub tree node
			return search(root.leftNode, key);
		}

		// search the right sub tree node
		return search(root.rightNode, key);
	}

	@Override
	public String toString() {
		return "Node [value=" + value + ", leftNode=" + leftNode + ", rightNode=" + rightNode + "]";
	}

}
