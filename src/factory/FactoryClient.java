package factory;

import factory.Type.EncoderType;

public class FactoryClient {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		var encoderFactory = EncoderFactory.getInstance();
		var encoder = encoderFactory.getEncoder(EncoderType.JsonEncoder);
		System.out.println(encoder.encode());
	}

}
