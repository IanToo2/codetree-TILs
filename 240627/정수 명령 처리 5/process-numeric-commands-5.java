import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int n = Integer.parseInt(br.readLine());
		List<Integer> q = new ArrayList<>();
		
		while(n-->0) {
			st = new StringTokenizer(br.readLine());
			String order = st.nextToken();
			if(order.equals("get")) {
				int idx = Integer.parseInt(st.nextToken());
				System.out.println(q.get(idx-1));
			}
			else if ( order.equals("push_back")) {
				int value = Integer.parseInt(st.nextToken());
				q.add(value);
			}else if (order.equals("pop_back")) {
				q.remove(q.size()-1);
			}else {
				System.out.println(q.size());
			}
		}
		
	}
	
}