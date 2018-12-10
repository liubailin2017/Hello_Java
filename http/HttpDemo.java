import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;

public class HttpDemo {
	
	public static void main(String []args) {
		try {
			
			Socket socket = new Socket("www.hqhworld.cn",80);
			OutputStream os = socket.getOutputStream();
			InputStream is = socket.getInputStream();
			
			os.write(("GET /img/eventimg/PwYvKIKMuK6g.jpg.jpg HTTP/1.1\r\n" + 
					"Host: www.hqhworld.cn\r\n" + 
					//"User-Agent: Mozilla/5.0 (Windows NT 5.1; rv:5.0) Gecko/20100101 Firefox/5.0\r\n" + 
					//"Accept: text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8\r\n" + 
					"Accept-Language: zh-cn,zh;q=0.5\r\n" + 
					"Accept-Encoding: gzip, deflate\r\n" + 
					"Accept-Charset: GB2312,utf-8;q=0.7,*;q=0.7\r\n" + 
					//"Connection: keep-alive\r\n"+
					//+ "Cookie:"+
					"\r\n").getBytes());
			os.flush();
			
			InputStream  in = socket.getInputStream();
			StringBuffer buf = new StringBuffer();
			socket.setSoTimeout(10000);
			File file = new File("/home/liubailin/ttttttttt.data");
			FileOutputStream f = new FileOutputStream(file);
			while(true) {
			        try {
			        	byte [] b = new byte[1024];
			        	int len = 1024;
			                len = in.read(b);
			                if(len == -1 ) break;
			                f.write(b, 0, len);
			                buf.append(new String(b,0,len,"UTF-8"));
			        } catch(SocketTimeoutException e) {
			                    in.close();
			                  
			                    break;
			         }
			}
			System.out.println(buf.toString());
	
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
