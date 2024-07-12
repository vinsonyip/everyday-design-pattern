package creational_patterns.abstract_factory_pattern;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

import creational_patterns.abstract_factory_pattern.factories.CodingFactory;
import creational_patterns.abstract_factory_pattern.types.FactoryType;

public class FactoryGenerator {
	private FactoryGenerator() {};
	private static FactoryGenerator _instance = new FactoryGenerator();
	public static FactoryGenerator getInstance() {
		return _instance;
	}
	private Map<FactoryType, CodingFactory> factoryMap = new HashMap<FactoryType, CodingFactory>();
	public CodingFactory getFactory(FactoryType factoryType) {
		String packageName = CodingFactory.class.getPackageName();
		String factoryName = factoryType.name();
		String className = packageName + "." + factoryName;
		CodingFactory factory = factoryMap.getOrDefault(factoryType, null);
		if(factory == null) {
			try {
				// Use reflection to get instance method
				Method factoryGetInstanceMethod = Class.forName(className).getMethod("getInstance", null);
				factoryGetInstanceMethod.trySetAccessible();
				factory = (CodingFactory)factoryGetInstanceMethod.invoke(null);
				factoryMap.put(factoryType, factory);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 
		}
		
		return factory;
	}
	
}
