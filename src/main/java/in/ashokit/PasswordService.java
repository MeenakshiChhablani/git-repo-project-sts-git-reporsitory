package in.ashokit;

import java.util.Base64;
import java.util.Base64.Decoder;
import java.util.Base64.Encoder;

public class PasswordService {

	public static String encoded(String text) {
		Encoder encoder = Base64.getEncoder();

		return encoder.encodeToString(text.getBytes());

	}

	public static String decode(String encodeTxt) {
		Decoder decoder = Base64.getDecoder();
		byte[] decode = decoder.decode(encodeTxt);
		return new String(decode);
	}
	
	public static void main(String []args) {
		String encode=PasswordService.encoded("ashokit");
		System.out.println(encode);
		
		String decode=PasswordService.decode(encode);
		System.out.println(decode);
	}
}
