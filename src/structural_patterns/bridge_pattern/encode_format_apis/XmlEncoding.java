package structural_patterns.bridge_pattern.encode_format_apis;

public class XmlEncoding implements EncodeFormatAPI {
	@Override
	public void encode(String data) {
		// TODO Auto-generated method stub
		System.out.println("Encode " + data + " with Xml Encoding ...");
		System.out.println("Done");
	}
}
