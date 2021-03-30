package ex03_File;

import java.io.File;
import java.io.IOException;
import java.sql.Date;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;

/*
	File 클래스
	1. 파일을 조작하는 클래스이다.
	2. 파일 생성, 파일 삭제, 파일명, 파일 크기, 수정날짜 등을 확인할 수 있다.
	3. io기반 stream과 함께 사용한다. 
*/

public class FileOverviewMainClass {

	public static void main(String[] args) {

		// directory 조작(확인)
		File dir = new File("C:\\MyTemp"); // 경로 구분 (\\ == File.separator)
		// File dir = new File("C:" + File.separator + "MyTemp"); // Linux와 Windows 호환용

		System.out.println(dir.exists()); // 존재하는 경로이면 true 반환, 아니면 false 반환

		if (dir.exists() == false) { // 존재하지 않는 dir이면 이라는 의미 (같은 코드로 if(!dir.exists()가 있지만 사용하는 걸 가급적 배제한다.))
			dir.mkdirs(); // dir 디렉터리를 생성한다. 작성한 경로에 비어있는 폴더를 생성해준다.
			System.out.println("MyTemp 디렉터리가 생성되었습니다.");
		}
		/*
		if (dir.exists() == true) { // if(dir.exists()) 와 같은 코드이다. 주석에 들어있는 코드가 좋은 코드이다.
			dir.delete(); // dir 디렉터리를 삭제한다. 작성한 경로에 있는 폴더를 삭제해준다.
			System.out.println("MyTemp 디렉터리가 삭제되었습니다.");
		}
		*/
		
		// File 조작
		File file = new File("C:\\MyTemp\\MyFile.txt");
		// File file = new File("C:\\MyTeml", "MyFile.txt");
		// File file = new File(dir, "MyFile.txt"); // File dir = new
		// File("C:\\MyTemp");
		// 3가지 모두 같은 코드이다. (우리가 수업에서 많이 사용할 코드구성은 3번째이다.)

		System.out.println(file.exists());

		try {
			if (file.exists() == false) {
				file.createNewFile(); // 내용이 없는 파일을 생성한다.(대부분 출력스트림을 이용하여 만들기 때문에 잘 사용하지 않는다.)
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

		System.out.println(file.getAbsolutePath());	// C:\MyTemp\MyFile.txt (저장된 경로)
		System.out.println(file.getPath());			// C:\MyTemp\MyFile.txt (저장된 경로)
		System.out.println(file.getParent());		// C:\MyTemp (폴더이름)
		System.out.println(file.getName());			// MyFile.txt (파일이름)
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd a h:mm");
		System.out.println(sdf.format(file.lastModified())); // SimpleDateFormat을 이용하여 패턴을 만들어주어서 파일의 최종 수정일을 보기 좋게 만들어준다.
															 // 1616978455812 (최종 수정일) new Date() 안에 file.lastModified()를 넣어주어 보기 좋게 만들어준다.
		System.out.println(file.length());			// 0 ()

		// 디렉터리 내의 모든 디렉터리와 파일 목록 출력하기
		File javaDir = new File("C:\\Program Files\\Java\\jdk1.8.0_202");
		File[] files = javaDir.listFiles(); 
		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd a hh:mm");
		for(File f : files) {
			System.out.print(sdf2.format(new Date(f.lastModified())) + " ");
			if(f.isDirectory()) {
				System.out.print("<DIR> " + "    ");
			} else {
				System.out.print("                  " + new DecimalFormat("#,##0").format(f.length()));
			}
			System.out.println("             " + f.getName());
		}
		
	}

}
