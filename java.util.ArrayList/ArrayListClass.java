import java.util.ArrayList;
import java.util.List;

public class ArrayListClass {
	public void printArrayList(){
		List<String> ref=new ArrayList<String>();
		ref.add("First");
		ref.add("Second");
		ref.add("Third");
		ref.add(1,"-");
		System.out.println("ArrayList:"+ ref);
		ref.remove(1);//index
		ref.remove("Second");//object
		System.out.println("ArrayList:"+ ref);
		System.out.println("Size:" + ref.size());
		ref.clear();
	}
	public static void main(String[] args){
		ArrayListClass obj = new ArrayListClass();
		obj.printArrayList();
	}
}
