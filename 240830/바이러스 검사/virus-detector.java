import java.io.*;
import java.util.*;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringBuilder sb = new StringBuilder();
	static StringTokenizer st;

	static int n;
	static int[] max = new int[2];
	static int[] customer;

	public static void main(String[] args) throws Exception {
		init();
		logic();
	}

	private static void init() throws Exception {
		n = Integer.parseInt(br.readLine());
		customer = new int[n];
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < n; i++) {
			customer[i] = Integer.parseInt(st.nextToken());
		}
		st = new StringTokenizer(br.readLine());
		max[0] = Integer.parseInt(st.nextToken());
		max[1] = Integer.parseInt(st.nextToken());
	}

	private static void logic() {
		long answer = 0;
		for (int cur : customer) {
			cur = cur - max[0];
			answer++;
			if(cur <= 0) {
				continue;
			}
			answer += cur/max[1];
			if(cur%max[1] != 0) {
				answer++;
			}
		}
		System.out.println(answer);
	}
}