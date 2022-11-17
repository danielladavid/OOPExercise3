public class iPad
{
	private String model; //attribute
	private final Camera camera; //component or part
	
	//constructor
	public iPad(String model){
		this.model= model;
	camera= new Camera ();
	}
	
	//accessor
	public String getModel(){
		return model;
	}
	
	//mutator 
	public void setModel (String model){
	this.model=model;
	}
}
