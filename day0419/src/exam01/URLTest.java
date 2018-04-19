package exam01;

import java.net.MalformedURLException;
import java.net.URL;

public class URLTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		URL url;
		try {
			url = new URL("http://www.hanbit.co.kr/store/books/look.php?p_code=B8441457382");
			String host = url.getHost();
			String path = url.getPath();
			int port = url.getPort();
			String protocol = url.getProtocol();
			String query = url.getQuery();
			
			System.out.println("host: " + host);
			System.out.println("path: " + path);
			System.out.println("port: " + port);
			System.out.println("protocol: " + protocol);
			System.out.println("query: " + query);
			
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
	}

}
