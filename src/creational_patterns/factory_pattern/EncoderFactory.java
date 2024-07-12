package creational_patterns.factory_pattern;

import java.util.HashMap;
import java.util.Map;

import creational_patterns.factory_pattern.coder_set.Encoder;

public class EncoderFactory {
	
	private static EncoderFactory encoderFactory  = new EncoderFactory();
	
	private EncoderFactory() {}
	
	public static EncoderFactory getInstance() {
		return encoderFactory;
	}
	
	private Map<String, Encoder> encoderMap = new HashMap<String, Encoder>();  
	
	public Encoder getEncoder(creational_patterns.abstract_factory_pattern.types.EncoderType jsonencoder) throws Exception {
		// Originally, this is using switch to find which the encoder should be returned
		// Now, this is using Map and reflection to find the corresponding encoder
			// - The new method is absolutely follows the "open-closed" principle.
				// - When user create a new encoder
				// - 1. Create new encoder and implement the encoder interface
				// - 2. Add the new encoder class name to the Enum (EncoderType.java)
				// - 3. Then done.
		Encoder encoder = encoderMap.getOrDefault(jsonencoder, null);
		if(encoder == null) {
			try {
				String encoderPackageName = Encoder.class.getPackageName();
				encoder = (Encoder) Class.forName(encoderPackageName+"."+jsonencoder.name()).getDeclaredConstructor().newInstance();
				encoderMap.put(encoderPackageName, encoder);
			}catch(Exception err) {
				throw new Exception("The encoder type is unknown");
			}
			
		}
		return encoder;
	}
}
