
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			BST tree = new BST();
			tree.insert(3, "��");
			tree.insert(10, "��");
			tree.insert(5, "��");
			tree.insert(16, "��");
			tree.insert(95, "��");
			tree.insert(1, "��");
			tree.insert(25, "��");
			tree.insert(6, "��");
			tree.insert(7, "��");
			tree.insert(32, "ȭ");
			tree.insert(52, "��");
			tree.insert(2, "��");
			tree.insert(15, "��");

			tree.inorderT();
			
			System.out.println("Ű ���� 5�� ��Ʈ�� ã��");
			tree.find(5);
			System.out.println("Ű ���� 55�� ��Ʈ�� ã��");
			tree.find(55);
			System.out.println("Ű ���� 15�� ��Ʈ�� ã��");
			tree.find(15);
			
			System.out.println("Ű ���� 5�� ��Ʈ�� ����");
			tree.remove(5);
			tree.inorderT();
	}

}
