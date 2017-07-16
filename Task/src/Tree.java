
public class Tree {
	private TreeNode root;
	private TreeNode findNode;
	
	//TreeŬ������ ������. root��带 �����Ѵ�
	public Tree(Object element){
		root = new TreeNode(element, null);
		list = new List();
		listSub = new List();
	}

	//���޹��� ��� t�κ��� preorder traversal�� �����ϸ� �ش����� element�� str�� ���ٸ� findNode�� �� ����� ���۷��� �ϴ� �޼ҵ�
	private void findRecursive(TreeNode t, String str){
		// ##############  �����Ͽ����ϴ� (Line 16)  ################
		if(str.equals(t.getData())){
			findNode = t;
		}
		if(t.isLeft())
			findRecursive(t.getLeftChild(), str);
		
		if(t.isRight())
			findRecursive(t.getRightChild(), str);
		
	}
	
	//findRecursive�� ȣ���ϴ� �޼ҵ�
	public TreeNode findNode(String name){
		findRecursive(root, name);
		return findNode;
	}
	
	//root��带 �����Ѵ�.
	public TreeNode getRoot(){
		return root;
	}
	
	//preorder traversal�� �����ϸ鼭 �� ����� element�� ����Ѵ�.
	public void preorder(TreeNode root){
		System.out.println(root.getData());
		if(root.isLeft())
			preorder(root.getLeftChild());
		if(root.isRight())
			preorder(root.getRightChild());
	}
	
	//�߰�����
	
	List list;
	List listSub;
	

	// ##############  �����Ͽ����ϴ� (Line 55 ~  96) ################
	//���� ����� ����Ѵ�.
	public void getAncestors(TreeNode n){
		TreeNode temp = n;
		list.initializaiton();
		while(temp != null){
			list.addFirst(temp);
			temp = temp.getParent();
		}
		printNodeList();
	}
	//list�� ���ʷ� ����Ѵ�
	public void printNodeList(){
		for(int i = 0; i < list.getSize(); i++){
			System.out.println(((TreeNode)list.getNode(i)).getData() + " ");
		}
	}
	//list�� listSub�� ���� n1,n2�� ������ �����Ѵ�.
	public void getAncestors(TreeNode n1, TreeNode n2){
		TreeNode temp = n1;
		list.initializaiton();
		while(temp != null){
			list.addLast(temp);
			temp = temp.getParent();
		}
		temp = n2;
		listSub.initializaiton();
		while(temp != null){
			listSub.addLast(temp);
			temp = temp.getParent();
		}
	}
	//n1�� n2�� ���� ������ �˻��Ѵ�.
	public void getCommonNode(TreeNode n1, TreeNode n2){
		getAncestors(n1, n2);
		for(int i = 0; i < list.getSize(); i++){
			for(int j = 0; j < listSub.getSize(); j++){
				if(list.getNode(i) == listSub.getNode(j)){
					System.out.println(((TreeNode)list.getNode(i)).getData() + "(�̼�:" + (i + j) + ")");
					return;
				}
			}
		}
	}
	
	
	

} 
