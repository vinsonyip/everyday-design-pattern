package abstract_factory;

import abstract_factory.CoderSet.Coder;
import abstract_factory.Type.FactoryType;
import abstract_factory.Type.FileType;

public class FactoryClient {

	public static void main(String[] args) {
		FactoryGenerator factoryG = FactoryGenerator.getInstance();
		var coderFactory = factoryG.getFactory(FactoryType.DecoderFactory);
		Coder myCoder = coderFactory.getCoder(FileType.XML);
		myCoder.performCoding();
	}
}
