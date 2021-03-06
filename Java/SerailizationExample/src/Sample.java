import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;


public class Sample implements Serializable {
	ArrayList<String> arrayList = new ArrayList<>(2);
	public Sample() {
		arrayList.add("Hello");
		arrayList.add("World");
	}
	
	public void print() {
		for (String list : arrayList) {
			System.out.print(list + " ");
		}
		System.out.println();
	}
	public static void main(String args[]) {
		System.out.println("Priting Normal Object");
		Sample obj = new Sample();
		// Before Serialization
		obj.print();
		ObjectOutputStream oos = null;
		// Serializing obj
		try {
			FileOutputStream fos = new FileOutputStream("abc.txt");
			oos = new ObjectOutputStream(fos);
			oos.writeObject(obj);
		} catch (IOException io) {
			
		} finally {
			try {
				if (oos != null) oos.flush();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		ObjectInputStream ois = null;
		Sample serializeObj = null;
		// De-Serializing the sample obj
		try {
			FileInputStream fis = new FileInputStream("abc.txt");
			ois = new ObjectInputStream(fis);
			serializeObj = (Sample) ois.readObject();
		} catch (IOException e) {
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				ois.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("Printing from serialized object");
		 serializeObj.print();
	}
}
