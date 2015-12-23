public class BarCode implements Comparable{
    // instance variables
    private String _zip;
    private int _checkDigit;
    private static final String[] code = {"||:::", ":::||", "::|:|", "::||:", ":|::|", ":|:|:", ":||::", "|:::|", "|::|:", "|:|::"};    
    
    // constructors
    //precondtion: zip.length() = 5 and zip contains only digits.
    //postcondition: throws a runtime exception zip is not the correct length
    //               or zip contains a non digit
    //               _zip and _checkDigit are initialized.
    public BarCode(String zip) {
	int k = 0;
	if(zip.length() != 5){
	    throw new RuntimeException();
		}
	_zip = zip;
	for(int i = 0; i < zip.length(); i ++){
	    try{
		_checkDigit = checkSum();
	    }
	    catch(NumberFormatException e){
		throw new RuntimeException();
	    }
	}
	
	
    }


    // postcondition: Creates a copy of a bar code.
    public BarCode(BarCode x){
	_zip = x.getZip();
	_checkDigit = x.checkSum(); 
    }


    public String getZip(){
	return _zip;
    }

    public int getDigit(){
	return _checkDigit;
    }
    
    //post: computes and returns the check sum for _zip
    private int checkSum(){
	int k = 0;
	for(int i = 0; i < _zip.length(); i ++){
	    k += Integer.parseInt(_zip.substring(i, i+ 1));
	}
	return k;
    }
	     

    //postcondition: format zip + check digit + barcode 
    //ex. "084518  |||:::|::|::|::|:|:|::::|||::|:|"      
    public String toString(){
	String s = "";
	s += _zip;
	s += _checkDigit + " ";
	s += "|";
	for(int i = 0; i < _zip.length(); i++){
	    s += code[Integer.parseInt(_zip.substring(i, i + 1))];
	}
	s += "|";
	return s;

    }


    public boolean equals(Object other){
	return this == other ||
	   (other instanceof BarCode &&
	     _zip.equals(((BarCode)other).getZip()));

    }
    // postcondition: false if the object is not a BarCode, 
    // false if it is a non-matching barcode
    // true when they match.


    public int compareTo(Object other){
	if( equals(other) && _checkDigit == (((BarCode)other).getDigit())){
	    return 1;
	}
	else{
	    return 0;
	}
    }
    // postcondition: compares the zip + checkdigit 


    public static void main(String[]args){
	BarCode L = new BarCode("53567");
	System.out.println(L);
    }

}
