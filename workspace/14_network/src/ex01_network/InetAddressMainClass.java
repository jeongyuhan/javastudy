package ex01_network;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Arrays;

public class InetAddressMainClass {

	public static void main(String[] args) {
	
		// 원격 호스트 
		String host = "www.naver.com";
		
		// 인터넷 주소를 처리하는 InetAddress
		InetAddress ia = null;
		try {
			ia = InetAddress.getByName(host);
			System.out.println(ia);					 // 아래 두개를 모두 가진 || www.naver.com/125.209.222.141
			System.out.println(ia.getHostName());	 // hostname = domain	  || www.naver.com
			System.out.println(ia.getHostAddress()); // hostaddress = ip	  || 125.209.222.141
			
			// 등록된 ip가 여러개일 경우 모두 가져오는 방법
			InetAddress[] ias = InetAddress.getAllByName(host);
			for(InetAddress i : ias) {
				System.out.println(i.getHostName() + "의 ip 주소 : " + i.getHostAddress());
			}
			
			byte[] byteIp = ia.getAddress();
			System.out.println(Arrays.toString(byteIp)); // [125, -47, -34, -114]
			// ip주소는 최대 0 ~ 256까지이다.
			
			// [125, -47, -34, -114] => [125, 209, 222, 142] 바꿔주는작업
			short[] ip = new short[byteIp.length];
			for(int i = 0; i < ip.length; i++) {
				ip[i] = (short)(byteIp[i] < 0 ? byteIp[i] + 256 : byteIp[i]); 
			}
			System.out.println(Arrays.toString(ip));
			// byte로 표기할 수 있는 숫자의 범위는 -128~127 이기 때문에 범위를 벗어난 숫자는 정상적인 표기가 안되고, 표기법이 달라진다.
			// 범위 이상의 숫자를 표기할 때는 시계처럼 처음으로 돌아가 127 다음번호는 -128로 돌아가며 표현된다.
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}
		
		// hostname    : localhost
		// hostaddress : 127.0.0.1
		// localhost  == 127.0.0.1
		
	}

}
