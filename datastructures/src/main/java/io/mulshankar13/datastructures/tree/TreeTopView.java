package io.mulshankar13.datastructures.tree;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TreeTopView {

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

	public static void topView(Node root) {

        List<Integer> valList = new ArrayList<Integer>();
          while (root.leftNode!=null) {
            valList.add(root.value);
            root=root.leftNode;
        }
        Integer [] intArray = new Integer [valList.size()];
        valList.toArray(intArray);
        for(Integer data:intArray){
            System.out.print(data + " ");
        }
    }
}
