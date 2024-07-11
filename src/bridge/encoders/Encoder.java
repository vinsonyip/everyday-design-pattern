package bridge.encoders;

import bridge.encode_format_APIs.EncodeFormatAPI;

public abstract class Encoder {
	protected EncodeFormatAPI encodeFormatAPI;
	public Encoder(EncodeFormatAPI encodeFormatAPI) {
		this.encodeFormatAPI = encodeFormatAPI;
	}
	
	public abstract void encode();
}
