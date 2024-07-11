Description: 
	- User want to have encoder and decoder, how to design the program?
	- The encoder should provide json and xml encoding and decoding function.
	
Solution:
	- Using abstract factory pattern
	
User workflow to create encoder or decoder:
	1. Create an FactoryGenerator to create encoder or decoder
	2. Create an encoder or decoder factory
	3. Assign the file format to be encode or decode, i.e. Json, xml ...
	3. Then the result returns
	
We can come up with:
	1. A Enum for DecoderType
	2. A Enum for EncoderType
	3. A Enum for FactoryType
	4. A Enum for FileType
	- Note: The enum is the constraint of the program
	
Explanation:
	1. FactoryGenerator responsible for create corresponding coder by evaluating the input FactoryType, i.e. encoder or decoder
	2. EncoderFactory/DecoderFactory responsible for create corresponding Encoder/Decoder by evaluating 
		- The input FileType, i.e. json or xml
		- The EncoderType or DecoderType (use String comparison to find out most suitable encoder or decoder type)

Note:
	1. We use reflection to create instance
	2. So, we should make sure the EncoderType and DecoderType must be the same as the ClassName of the Encoder.
		- i.e. The EncoderType should have "JsonEncoder" and "XmlEncoder"(Which is the correct class name) as its element.