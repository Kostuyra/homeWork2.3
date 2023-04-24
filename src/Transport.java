abstract public class Transport implements MechanicalService {
	private String modelName;
	private int wheelsCount;

	public Transport(String modelName, int wheelsCount){
		this.modelName = modelName;
		this.wheelsCount = wheelsCount;
	}

	public int getWheelsCount() {
		return wheelsCount;
	}

	public String getModelName() {
		return modelName;
	}

	public void setModelName(String modelName) {
		this.modelName = modelName;
	}

	public void setWheelsCount(int wheelsCount) {
		this.wheelsCount = wheelsCount;
	}

}
