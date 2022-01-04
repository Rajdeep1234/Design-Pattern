package lesson.collection;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Test;


public class JunitTestClass {
	
	@Test
	public void tetOne()
	{
		ColectionImpl impl=new ColectionImpl();
		List<String> lit=impl.getList();
		assertEquals("abc",lit.get(0));
	}

}
