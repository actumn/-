import java.util.*;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hashtable<String, String> hTable = new Hashtable<String, String>();
		hTable.put("1", "�Ͽ���");
		hTable.put("2", "����õ");
		hTable.put("3", "�Ͽ���");
		hTable.put("4", "�Ͽ���");
		hTable.put("5", "�Ͽ���");
		hTable.put("5", "�Ͽ���2");
		
		System.out.println(hTable.get("5"));
		System.out.println(hTable.get("5"));
		
		
		Collection<String> collection = hTable.keySet();
		Iterator<String> it = collection.iterator();
		while(it.hasNext()){
			String key = (String)it.next();
			String value = (String)hTable.get(key);
			System.out.println("key:"+key+" value:"+value);
		}
		System.out.println("Total Size : "+hTable.size());
		System.out.println(hTable.get("1"));
	}

}
