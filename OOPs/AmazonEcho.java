package OOPs;

//Encapsulation 
public class AmazonEcho {
    private String color;
	private double lengthinInches;
    private String voice;

    //private/public/protected
    //dynamic constuctor
    //'this' keyword
    //Getter methods (return type methods)
    //Setter methods (void type methods)
    //toString


    public AmazonEcho(String user_color, double user_length, String user_voice) {
        this.color = user_color;
		this.lengthinInches = user_length;
        this.voice = user_voice;   
    }

    public String getColor() {
        return this.color;
    }

    public double getLength() {
        return this.lengthinInches;
    }

    public String getVoice() {
        return this.voice;
    }

    public void setColor(String new_color) {
        this.color = new_color;
    }

    public void setLength(double new_length) {
        this.lengthinInches = new_length;
    }

    public void setVoice(String new_voice) {
        this.voice = new_voice;
    }

    private String GPS() {
		return "Go left for 50 meters, then take a right and go straight ahead for 20 meters";
	}
	
	private String weather() {
		return "It is 78 degrees celsius outside with a 80% chance of rain";
	}
	
	private String Shopping() {
		return "The item is in stock and has been added in your cart";
	}

    @Override
    public String toString() {
        return "AmazonEcho [color=" + this.color + ", lengthinInches=" + this.lengthinInches + ", voice=" + this.voice + "]";
    }

    public static void main(String[] args) {
        AmazonEcho alexa = new AmazonEcho("Black", 12.5, "British Male");
        AmazonEcho alexa2 = new AmazonEcho("White", 1.5, "British Female");
        
        String GPS = alexa.GPS();
		String weather = alexa.weather();
        String Shopping = alexa.Shopping();
        
        
        System.out.println(GPS);
		System.out.println(weather);
        System.out.println(Shopping);

        System.out.println(alexa);
        System.out.println(alexa2);
        

    }

}