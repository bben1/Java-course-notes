package tutorial27_29_GenericsAndCasting;

class Machine {
	public void start() {
		System.out.println("Machine started.");
	}
}

class Camera extends Machine {
	public void start() {
	System.out.println("Camera started.");
	}
	
	public void snap() {
		System.out.println("Photo taken.");
	}
}

public class tutorial_28_UpcastingDowncasting {

	public static void main(String[] args) {
		
		//Creating machine and camera objects
		Machine machine1 = new Machine();
		Camera camera1 = new Camera();
		
		//Running methods from each object as normal
		machine1.start();
		camera1.start();
		camera1.snap();
		
		//Upcasting (camera to a machine)
		Machine machine2 = camera1;
		machine2.start();//Runs start() method for camera
		//machine2.snap(); Returns an error as machine2 does not have snap() method.
		
		//Downcasting
		Machine machine3 = new Camera(); //upcasting step
		Camera camera2 = (Camera)machine3; 
		camera2.start(); //Runs start() method for camera
		camera2.snap(); //Runs snap() method for camera (because is a cast to a camera)
		
		//Incorrect downcasting because you need to start with upcasting step
		Machine machine4 = new Machine();
		Camera camera3 = (Camera)machine4;
		camera3.start();
		camera3.snap();
	}

}
