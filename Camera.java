public class Camera
{
	private String specs; //attribute
	
	//constructor
	public Camera (){
		specs="12MP Ultra Wide front camera";
		}
		
		//accessor
		public String getSpecs(){
			return specs;
		}
		
		//mutator
		public void setSpecs(String specs){
			this.specs=specs;
		}
		
		public String openCamera(){
			return"The iPad camera is capturing.";
		}
		
	public String closeCamera(){
		return"The iPad camera is closing.";
	}

	
}
