			
public class NeuralNetwork {
	private int inputLayerSize;
	private int outputLayerSize;
	private int hiddenLayerSize;
	
	
	private double sigmoid(double z){
		return 1/(1+Math.exp(-z));
	}
	
	public NeuralNetwork(){
		this.hiddenLayerSize = 3;
		this.outputLayerSize = 1;
		this.inputLayerSize = 2;
	}
}
