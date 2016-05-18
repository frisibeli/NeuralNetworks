import Jama.Matrix;

public class NeuralNetwork {

	private int inputLayerSize;
	private int outputLayerSize;
	private int hiddenLayerSize;
	private Matrix input;
	private Matrix weights1;
	private Matrix weights2;

	public NeuralNetwork() {
		this.hiddenLayerSize = 3;
		this.outputLayerSize = 1;
		this.inputLayerSize = 2;
		this.weights1 = Matrix.random(inputLayerSize, hiddenLayerSize);
		this.weights2 = Matrix.random(hiddenLayerSize, outputLayerSize);
	}

	private double sigmoid(double z) {
		return 1 / (1 + Math.exp(-z));
	}

}
