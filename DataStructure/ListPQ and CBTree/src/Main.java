
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListPQ pq = new ListPQ(100);
		pq.insert(3, "����õ");
		pq.insert(2, "������");
		pq.insert(1, "�����");
		pq.insert(6, "�輺��");
		pq.insert(4, "�ڼ���");
		pq.insert(5, "�տ���");
		pq.printAll();
		pq.min();
		pq.printAll();
		pq.removeMin();
		pq.printAll();
		pq.removeMin();
		pq.printAll();
	}

}
