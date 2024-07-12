package structural_patterns.bridge_pattern.encoders;

import structural_patterns.bridge_pattern.encode_format_apis.EncodeFormatAPI;

public abstract class Encoder {
	protected EncodeFormatAPI encodeFormatAPI;
	public Encoder(EncodeFormatAPI encodeFormatAPI) {
		this.encodeFormatAPI = encodeFormatAPI;
	}
	
	public abstract void encode();
}
