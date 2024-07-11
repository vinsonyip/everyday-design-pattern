package bridge.encoders;

import bridge.encode_format_APIs.EncodeFormatAPI;

// To encode csv source data with encodeFormatAPI
public class CsvEncoder extends Encoder {
	private String data;
	public CsvEncoder(String data, EncodeFormatAPI encodeFormatAPI) {
		super(encodeFormatAPI);
		this.data = data;
		// TODO Auto-generated constructor stub
	}

	@Override
	public void encode() {
		System.out.println("CsvEncoder is encoding data ...");
		// TODO Auto-generated method stub
		encodeFormatAPI.encode(data);
	}

}
