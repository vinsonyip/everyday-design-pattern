package bridge.encoders;

import bridge.encode_format_APIs.EncodeFormatAPI;

public class TextEncoder extends Encoder {
	private String data;
	public TextEncoder(String data, EncodeFormatAPI encodeFormatAPI) {
		super(encodeFormatAPI);
		this.data = data;
		// TODO Auto-generated constructor stub
	}

	@Override
	public void encode() {
		System.out.println("TextEncoder is encoding data ...");
		// TODO Auto-generated method stub
		encodeFormatAPI.encode(data);
	}

}
