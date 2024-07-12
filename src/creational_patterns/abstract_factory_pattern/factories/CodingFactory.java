package creational_patterns.abstract_factory_pattern.factories;

import creational_patterns.abstract_factory_pattern.coder_set.Coder;
import creational_patterns.abstract_factory_pattern.types.FileType;

public abstract class CodingFactory {
	public abstract Coder getCoder(FileType coderType);
}
