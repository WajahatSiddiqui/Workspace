
public class RBTree {
	
	enum COLOR {
		RED, BLACK;
	}
	
	private static class TreeNode {
		int data;
		TreeNode left, right;
		COLOR color;
		public TreeNode(int data) {
			this.data = data;
			left = null;
			right = null;
			color = COLOR.RED;
		}
	}
	
	public static TreeNode insert(TreeNode root) {
		
	}
	
	public static void main(String args[]) {
		
	}

}
