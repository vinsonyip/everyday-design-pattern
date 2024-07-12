package creational_patterns.abstract_factory_pattern;

import creational_patterns.abstract_factory_pattern.coder_set.Coder;
import creational_patterns.abstract_factory_pattern.types.FactoryType;
import creational_patterns.abstract_factory_pattern.types.FileType;

public class FactoryClient {

	public static void main(String[] args) {
		FactoryGenerator factoryG = FactoryGenerator.getInstance();
		var coderFactory = factoryG.getFactory(FactoryType.DecoderFactory);
		Coder myCoder = coderFactory.getCoder(FileType.XML);
		myCoder.performCoding();
	}
}
