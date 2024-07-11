package bridge;

import bridge.encode_format_APIs.EncodeFormatAPI;
import bridge.encode_format_APIs.XmlEncoding;
import bridge.encoders.CsvEncoder;
import bridge.encoders.TextEncoder;

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
