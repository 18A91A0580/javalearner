package vectorsAndStacks;
import java.util.Stack;
public class Stacks {

	public static void main(String[] args) {
		Stack<Integer> s=new Stack<>();
		s.push(1);
		s.push(3);
		s.push(4);
		System.out.println(s.peek());
		System.out.println(s.pop());
		System.out.println(s.pop());
	}

}
