
public class List {
	private ListNode header = new ListNode(null, null, null);
	private ListNode trailer = new ListNode(null, null, null);
	private int size;
	
	//header�� trailer�� �ν��Ͻ��� �����ϰ� ���θ� ����ų �� �ֵ��� �ϴ� ������
	public List(){
		header.setNextNode(trailer);
		trailer.setPrevNode(header);
		size = 0;
	}
	
	//���� ����Ʈ���� header�� trailer�� �����ϰ� ��� �����Ѵ�
	public void initializaiton(){
		ListNode temp = header.getNextNode();
		ListNode temp2 = temp.getNextNode();
		while(temp != trailer){
			temp = null;
			temp = temp2;
			temp2 = temp.getNextNode();
		}
		header.setNextNode(trailer);
		trailer.setPrevNode(header);
		size = 0;
	}
	
	//������(trailer ����)�� ���ο� ��带 �����Ѵ�.
	public void addLast(Object element){
		ListNode temp = new ListNode(trailer.getPrevNode(), trailer, element);
		trailer.getPrevNode().setNextNode(temp);
		trailer.setPrevNode(temp);
		size++;
	}
	
	//ó��(header ����)�� ���ο� ��带 �����Ѵ�.
	public void addFirst(Object element){
		ListNode temp = new ListNode(header, header.getNextNode(), element);
		header.setNextNode(temp);
		header.getNextNode().setPrevNode(temp);
		size++;
	}
	
	//���� ����Ʈ���� i��° ����� element�� ��´�.(header�� trailer ����)
	public Object getNode(int i){
		if(i >= size){
			System.out.println("Index Error : Too large");
			return null;
		}
		else if(i < 0){
			System.out.println("Index Error : Too small");
			return null;
		}
		
		ListNode temp = header.getNextNode();
		
		for(int k = 0; k < i; k ++){
			temp = temp.getNextNode();
		}
		return temp.getElement();
	}
	
	//List�� ũ�⸦ ����Ѵ�.
	public int getSize(){
		return size;
	}
}
