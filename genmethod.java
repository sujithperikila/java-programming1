class customException extends Exception{
    public String customMessage() {
        return "String is not allowed";
    }

}
class genericClass{
    public <T> void function(T a){
    	try{
    		if(a instanceof String){
    			throw new customException();
    		}
    		double v = Double.parseDouble(String.valueOf(a));
    		System.out.println((v*2)/3);
    	}
    	catch(customException e){
    		System.out.println(e.customMessage());
    	}
    }
}

public class genmethod{
    public static void main(String[] args) {
    	genericClass g = new genericClass();
        g.function(55);
        g.function("hello");

    }
}