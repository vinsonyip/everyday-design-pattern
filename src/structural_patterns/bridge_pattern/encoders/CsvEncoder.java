package structural_patterns.bridge_pattern.encoders;

import structural_patterns.bridge_pattern.encode_format_apis.EncodeFormatAPI;

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
