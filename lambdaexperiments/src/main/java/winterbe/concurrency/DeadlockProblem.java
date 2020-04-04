package winterbe.concurrency;

//TODO
/**
 * 
 * @author mulshankar13
 *
 */
public class DeadlockProblem {

}

static Node search(Node root,int key) {
	
	if(root==null || root.value==key) { // root is null or a match
		return root;
	}
	
	if(key>root.value) { // search the left sub tree node
		return search(root.leftNode,key);
	}
	
	if(key<root.value) { // search the right sub tree node
		return search(root.rightNode,key);
	}
	return null;
}