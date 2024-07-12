package structural_patterns.bridge_pattern.encode_format_apis;

public class JsonEncoding implements EncodeFormatAPI {
	@Override
	public void encode(String data) {
		// TODO Auto-generated method stub
		System.out.println("Encode " + data + " with Json Encoding ...");
		System.out.println("Done");
	}
}
