package abstract_factory.Factory;

import java.util.HashMap;
import java.util.Map;

import abstract_factory.CoderSet.Coder;
import abstract_factory.Type.EncoderType;
import abstract_factory.Type.FileType;

public class EncoderFactory extends CodingFactory {
	private EncoderFactory() {
		System.out.println("Instantiate EncoderFactory ...");
	}
	
	private EncoderFactory _instance;
	
	public EncoderFactory getInstance() {
		if(_instance == null) _instance = new EncoderFactory();
		return _instance;
	}

	private Map<FileType, Coder> encoderMap = new HashMap<FileType, Coder>();

	@Override
	public Coder getCoder(FileType fileType) {
		// TODO Auto-generated method stub
		Coder coder = encoderMap.getOrDefault(fileType, null);
		
		if(coder == null) {
			try {
				String coderPackageName = Coder.class.getPackageName();
				String coderName = "";
				String fileTypeName = fileType.name().toLowerCase();
				// The get the correct decoderType based on fileType.Name()
				for(EncoderType i : EncoderType.values()) {
					if(i.name().toLowerCase().contains(fileTypeName)) {
						coderName = i.name();
					}
				}
				String coderClassName = coderPackageName + "." + coderName;
				coder = (Coder) Class.forName(coderClassName).getDeclaredConstructor().newInstance();
				encoderMap.put(fileType, coder);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return coder;
	}

}
