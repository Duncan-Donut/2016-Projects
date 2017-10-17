public class Sandwich{
		
	private String main;
    private String bread;
    private double price;

	public void setMain(String type){
		main = type;
	}
	
	public String getMain(){
		return main;
	}
	
	public void setBread(String type){
		bread = type;
	}
	
	public String getBread(){
		return bread;
	}
	
	public void setPrice(double value){
		price = value;
	}

	public double getPrice(){
		return price;
	}
	
}