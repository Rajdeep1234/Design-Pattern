package lesson.collection;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;


public class ColectionImpl {

	public List<String> getList()
	{
	List<String> list=new ArrayList<String>();
	
    list.add("abc");
    list.add("def");
    
    System.out.println(list);
	return list;
	}



}

