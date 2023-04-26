public class Bicycle extends Transport {

		public Bicycle(String modelName, int wheelsCount){
			super(modelName, wheelsCount);
		}

	@Override
	public void service() {
		updateTyre();
	}
	public void updateTyre() {
			int i = 0;
			while (i < getWheelsCount()){
				i++;
			System.out.println("Меняем покрышку");
		}
	}
}
