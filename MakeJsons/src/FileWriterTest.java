import java.io.File;
import java.io.FileWriter;
import java.util.List;
import java.util.Scanner;

public class FileWriterTest {
	static String path = "C:\\Users\\Administrator\\Desktop\\임시폴더\\";

	public void makeFile(String fileName, String content) {

		try {

			// 파일 객체 생성
			File file = new File(path + fileName);

			// true 지정시 파일의 기존 내용에 이어서 작성
			FileWriter fw = new FileWriter(file, true);

			// 파일안에 문자열 쓰기
			fw.write(content);
			fw.flush();

			// 객체 닫기
			fw.close();

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static void main(String[] args) {
		OprCoordFileList oprList = new OprCoordFileList();
		FileWriterTest writer = new FileWriterTest();

		List<OprCoordFile> list = oprList.getList();

		Scanner sc = new Scanner(System.in);

		System.out.println(list.size() + "개의 json 파일을 만드시겠습니까?(y/n)");

		if (sc.nextLine().equals("y")) {

			for (int i = 0; i < list.size(); i++) {
				writer.makeFile(list.get(i).getOprConfigId() + ".json", list.get(i).toString());

				System.out.println("----" + list.get(i).getOprConfigId() + "----\n " + list.get(i).toString());
			}
		}
		for (int i = 0; i < list.size(); i++) {

			System.out.println(" get /lcap/opr/config/history/" + list.get(i).getOprConfigId());
		}

	}
}
