
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* 5������
		 * 
		List list = new List();
		list.addLast("A");
		list.addLast("B");
		list.addLast("C");
		System.out.println(list.getNode(2));
		System.out.println(list.getNode(0));
		System.out.println(list.getNode(1));
		*/
		
		/* 6������
		 * 
		Tree tree = new Tree("animal");
		tree.getRoot().addLeftChild("mammal");
		tree.getRoot().addRightChild("bird");
		tree.findNode("mammal").addLeftChild("cat");
		tree.findNode("mammal").addRightChild("dog");
		tree.findNode("bird").addLeftChild("eagle");
		tree.findNode("bird").addRightChild("sparrow");
		tree.preorder(tree.getRoot());
		 */

		/* 6������ �߰�����
		 * 
		 */
		Tree tree = new Tree("�����");
		tree.findNode("�����").addLeftChild("�����");
		tree.findNode("�����").addLeftChild("������");
		tree.findNode("�����").addRightChild("���ֱ�");
		tree.findNode("������").addRightChild("�躸");
		tree.findNode("�躸").addRightChild("��̼�");
		tree.findNode("������").addLeftChild("�輮��");
		tree.findNode("�����").addRightChild("�����");
		tree.findNode("�����").addLeftChild("����");
		tree.findNode("����").addLeftChild("���Ѽ�");
		tree.findNode("����").addRightChild("����");
		tree.findNode("����").addLeftChild("���");
		tree.findNode("����").addRightChild("����â");
		
		System.out.println("=======================");
		tree.getAncestors(tree.findNode("��̼�"));
		System.out.println("=======================");
		tree.getCommonNode(tree.findNode("��̼�"), tree.findNode("����â"));
		tree.getCommonNode(tree.findNode("�輮��"), tree.findNode("��̼�"));
		tree.getCommonNode(tree.findNode("���"), tree.findNode("���Ѽ�"));
		
	}

}
