package abstract_factory.Factory;

import abstract_factory.CoderSet.Coder;
import abstract_factory.Type.FileType;

public abstract class CodingFactory {
	public abstract Coder getCoder(FileType coderType);
}
