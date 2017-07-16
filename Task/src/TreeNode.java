
public class TreeNode {
	private Object element;
	private TreeNode parent;
	private TreeNode left;
	private TreeNode right;
	
	//TreeNode ������
	public TreeNode(Object element, TreeNode parent){
		this.element = element;
		this.parent = parent;
		this.left = null;
		this.right = null;
	}
	//���޹��� element�� ���� ��带 ���ʿ� �߰��Ѵ�
	public void addLeftChild(Object element){
		left = new TreeNode(element, this);
	}
	//���޹��� element�� ���� ��带 �����ʿ� �߰��Ѵ�
	public void addRightChild(Object element){
		right = new TreeNode(element, this);
	}
	//���� ����� element�� print�Ѵ�
	public void printData(){
		System.out.println(element);
	}
	//element �ν��Ͻ��� �����Ѵ�
	public Object getData(){
		return element;
	}
	//���� �ڽĳ�带 �����Ѵ�
	public TreeNode getLeftChild(){
		return left;
	}
	//������ �ڽĳ�带 �����Ѵ�
	public TreeNode getRightChild(){
		return right;
	}
	//���� �ڽ� ����� ���� ���� ���θ� �����Ѵ�.
	public boolean isLeft(){
		return !(left == null);
	}
	//������ �ڽ� ����� ���� ���� ���θ� �����Ѵ�.
	public boolean isRight(){
		return !(right == null);
	}
	//root������� �����Ѵ�
	public boolean isRoot(){
		return parent == null;
	}
	//�θ� ��带 �����Ѵ�.
	public TreeNode getParent(){
		return parent;
	}
	
}
