/* chapter 24-05. 스캐닝과 포매팅
 */

package chapter24;

import java.io.*; 

public class CopyFile3 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader in = null;
		PrintWriter out = null;
		
		// output.txt 파일에 아래 문장을 한 줄씩 작성
		out = new PrintWriter(new FileWriter("output.txt"));
		out.println("변화를 원한다면,");
		out.println("제일 먼저 자신이 변화할 수 있다는 것과");
		out.println("변화하기까지 포기하지 않고");
		out.println("계속해서 노력할 수 있다는 것을 믿어야 한다.");
		out.flush(); 	// 버퍼 제거
		
		// output.txt 파일에 있는 내용을 한 줄씩 읽어서 출력
		in = new BufferedReader(new FileReader("output.txt"));
		String line;
		while ((line = in.readLine()) != null) {
			System.out.println(line);
		}
		
		if (in != null) {
			in.close();
		}
		if (out != null) {
			out.close();
		}
	}

}
