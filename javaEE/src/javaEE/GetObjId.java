package javaEE;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class GetObjId {
	
	public static Object getId(Object object) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		
		Object result = null;
		Method[] methods = object.getClass().getMethods();
						
			if (methods != null) {
				for (Method method : methods) {
					if (method.getName().equalsIgnoreCase("getId") ||
							method.getName().equalsIgnoreCase("getName") ||
							method.getName().equalsIgnoreCase("getFilename")) {
						result = method.invoke(object, method.getParameters());
					} // if
				} // for
			}	
		
		return result;
	}
	
	/*public static void main(String[] args) {
		
		GetId testGetId = new GetId();
		GetName testGetName = new GetName();
		GetFilename testGetFilename = new GetFilename();
		
		try {
			
			System.out.println(getId(testGetId));
			System.out.println(getId(testGetName));
			System.out.println(getId(testGetFilename));
			
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
*/
}
