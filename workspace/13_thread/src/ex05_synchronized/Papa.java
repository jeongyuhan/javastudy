package ex05_synchronized;

public class Papa extends Thread {
	
	// field
	private Dyson dyson;

	// method

	@Override
	public void run() {
		for(int i = 0; i < 10; i++) {
			dyson.homeCleaning(); // 아빠는 집안청소담당			
		}
	}
	
	public Dyson getDyson() {
		return dyson;
	}

	public void setDyson(Dyson dyson) {
		this.dyson = dyson;
	}
	
	
}
