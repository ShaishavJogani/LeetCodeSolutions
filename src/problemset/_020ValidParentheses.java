/**
 * 
 */
package problemset;

import java.util.ArrayList;

/**
 * @author Shaishav Jogani 
 * <br/>
 * Created on Aug 13, 2017
 *
 */
public class _020ValidParentheses {
	
	public class Solution {
	    public boolean isValid(String s) {
	        
	        Stack<Character> stack = new Stack();
	        
	        if(s == null) return true;
	        
	        for(int i=0; i<s.length(); i++) {
	            if(s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '[') {
	                stack.push(s.charAt(i));
	            } else if(!stack.isEmpty()){
	                if(s.charAt(i) == ')') {
	                    if((char)stack.pop() != '(')
	                        return false;
	                } else if(s.charAt(i) == '}') {
	                    if((char)stack.pop() != '{')
	                        return false;
	                } else if(s.charAt(i) == ']') {
	                    if((char)stack.pop() != '[')
	                        return false;
	                }  
	            } else 
	                return false;
	        }
	        
	        if(stack.isEmpty())
	            return true;
	        else
	            return false;
	        
	    }
	    
	    public class Stack<T> {
	        
	        ArrayList<T> stack;
	        int items;
	        
	        public Stack(){
	            stack = new ArrayList();
	            items=0;
	        }
	        public void push(T item) {
	            stack.add(items++, item);
	        }
	        public T pop() {
	           return  stack.get(--items);
	        }
	        public boolean isEmpty() {
	            if(items >0) return false;
	            return true;
	        }
	        
	    }
	}

}
