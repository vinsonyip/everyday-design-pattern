package structural_patterns.bridge_pattern;

import structural_patterns.bridge_pattern.encode_format_apis.EncodeFormatAPI;
import structural_patterns.bridge_pattern.encode_format_apis.XmlEncoding;
import structural_patterns.bridge_pattern.encoders.CsvEncoder;
import structural_patterns.bridge_pattern.encoders.TextEncoder;

/**
 * The core idea of bridge pattern is to split the abstraction to implementation
 */
public class BridgeClient {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EncodeFormatAPI xmlEncoding = new XmlEncoding();
		TextEncoder textEncoder = new TextEncoder("Hello World", xmlEncoding);
		textEncoder.encode();
		
		CsvEncoder csvEncoder = new CsvEncoder("Hello World", xmlEncoding);
		csvEncoder.encode();
	}

}
