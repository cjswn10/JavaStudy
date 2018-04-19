package exam01;

import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;

public class URLTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		URL url;
		try {
			url = new URL("http://www.hanbit.co.kr/store/books/look.php?p_code=B8441457382");
			
			InputStream is = url.openStream();
			
			int ch;
			while((ch = is.read()) != -1) {
				System.out.print((char)ch);
				
			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
	}

}
