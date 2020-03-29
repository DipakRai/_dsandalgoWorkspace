package io.mulshankar13.datastructures.tree;

import java.util.Scanner;

/**
 * 
 * @author mulshankar13
 *
 */
public class BinarySearchTree {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int key = scanner.nextInt();
		Node root = null;
		root = Node.insert(root, key);
		key = scanner.nextInt();
		Node.insert(root, key);
		key = scanner.nextInt();
		Node.insert(root, key);
		key = scanner.nextInt();
		Node.insert(root, key);
		System.out.println(" root........." + root);
		// Node searchNode = searchBST(root, key); // search a tree
		// System.out.println(" Node found ...." + searchNode);
		scanner.close();
	}

	static Node delete(Node root,int value) {
		// search the node
		Node nodeFound = Node.search(root, value);
		if (null==nodeFound) {
			return null;
		} else {
			// 	
		}
		
		return null;
	}
	

	/**
	 * Initial draft
	 * 
	 * @param root
	 * @param key
	 * @return
	 */
	static Node searchBST(Node root, int key) {

		if (root == null) { // if root is null:exit
			return null;
		}
		Node rightNode = null;
		Node leftNode = null;
		if (root.rightNode == null && root.leftNode == null) { // if root is the only node
			return root.value == key ? root : null;
		}
		if (key < root.value) { // search the right subtree
			rightNode = root.rightNode;
			if (key == rightNode.value) {
				return rightNode;
			} else {
				return searchBST(rightNode, key);
			}
		}
		if (key > root.value) { // search the left subtree
			leftNode = root.leftNode;
			if (key == leftNode.value) {
				return leftNode;
			} else {
				return searchBST(leftNode, key);
			}
		}
		return null;
	}

	static Node initializeBST() {

		return null;

	}
}

