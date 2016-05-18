import Jama.Matrix;

public class NeuralNetwork {

	private int inputLayerSize;
	private int outputLayerSize;
	private int hiddenLayerSize;
	private Matrix inputLayer;
	private Matrix leftWeights;
	private Matrix rightWeights;
	private Matrix middleLayer;
	private Matrix activatedMiddle;
	private Matrix outputLayer;
	private Matrix activatedOutput;

	public NeuralNetwork() {
		this.hiddenLayerSize = 3;
		this.outputLayerSize = 1;
		this.inputLayerSize = 2;
		this.leftWeights = Matrix.random(inputLayerSize, hiddenLayerSize);
		this.rightWeights = Matrix.random(hiddenLayerSize, outputLayerSize);
	}

	private Matrix sigmoid(Matrix m) {
		double[][] array = m.getArray();
		for(int i = 0; i<m.getRowDimension();i++) {
			for(int j = 0; j<m.getColumnDimension();j++) {
				array[i][j] = 1 / (1 + Math.exp(array[i][j]));
			}
		}
		return Matrix.constructWithCopy(array);
	}
	
	public Matrix forward(Matrix X) {
		this.middleLayer = X.times(this.leftWeights);
		this.activatedMiddle = sigmoid(middleLayer);
		this.outputLayer = activatedMiddle.times(this.rightWeights);
		this.activatedOutput = sigmoid(outputLayer);
		return activatedOutput;
	}

}
