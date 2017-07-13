package test_01;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class TestProperty {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		String str = "src/test_01/test.properties";
		try {
			InputStream in = new FileInputStream(str);
			Properties pro = new Properties();
			pro.load(in);
			System.out.println(pro.getProperty("name"));
			System.out.println(pro.getProperty("age"));
			System.out.println(TestProperty.class.getResource("/").getFile());
			System.out.println(TestProperty.class.getResource("/test_01").getPath());
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
