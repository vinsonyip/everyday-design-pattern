package creational_patterns.abstract_factory_pattern.factories;

import java.util.HashMap;
import java.util.Map;

import creational_patterns.abstract_factory_pattern.coder_set.Coder;
import creational_patterns.abstract_factory_pattern.types.DecoderType;
import creational_patterns.abstract_factory_pattern.types.FileType;

public class DecoderFactory extends CodingFactory {

	private DecoderFactory() {
		System.out.println("Instantiate DecoderFactory ...");
	}
	
	private static DecoderFactory _instance;
	
	public static DecoderFactory getInstance() {
		if(_instance == null) _instance = new DecoderFactory();
		return _instance;
	}
	
	private Map<FileType, Coder> decoderMap = new HashMap<FileType, Coder>();

	// The factory pattern generate different instance that match to specific feature of an object
	// e.g. When I create a "encoder" factory, then we can simply assign him a "JSON" or "XML" enum, 
	// 		then it will generate the corresponding "encoder" to me
	
	// The factory pattern generate different instance that match to specific feature of an object
	// e.g. When I create a "decoder" factory, then we can simply assign him a "JSON" or "XML" enum, 
	// 		then it will generate the corresponding "decoder" to me
	
	@Override
	public Coder getCoder(FileType fileType) {
		// TODO Auto-generated method stub
		Coder coder = decoderMap.getOrDefault(fileType, null);
		
		if(coder == null) {
			try {
				String coderPackageName = Coder.class.getPackageName();
				String coderName = "";
				String fileTypeName = fileType.name().toLowerCase();
				// The get the correct decoderType based on fileType.Name()
				for(DecoderType i : DecoderType.values()) {
					if(i.name().toLowerCase().contains(fileTypeName)) {
						coderName = i.name();
					}
				}
				String coderClassName = coderPackageName + "." + coderName;
				coder = (Coder) Class.forName(coderClassName).getDeclaredConstructor().newInstance();
				decoderMap.put(fileType, coder);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return coder;
	}

}