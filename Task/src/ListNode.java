
public class ListNode {
	private Object element;
	private ListNode nextNode;
	private ListNode prevNode;
	
	//ListNode�� ����Ű�� prev�� next, element�� �����Ѵ�
	public ListNode(ListNode prevNode, ListNode nextNode, Object element){
		this.element = element;
		this.prevNode = prevNode;
		this.nextNode = nextNode;
	}
	
	//next ����
	public void setNextNode(ListNode nextNode){
		this.nextNode = nextNode;
	}
	//prev ����
	public void setPrevNode(ListNode prevNode){
		this.prevNode = prevNode;
	}
	
	//element�� ��´�
	public Object getElement(){
		return element;
	}
	//next�� ��´�
	public ListNode getNextNode(){
		return nextNode;
	}
	//prev�� ��´�
	public ListNode getPrevNode(){
		return prevNode;
	}
	
}
