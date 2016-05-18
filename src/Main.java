import Jama.Matrix;

public class Main {

	public static void main(String[] args) {
		double[][] vals = {{3,5},{5,1},{10,2}};
		Matrix X = new Matrix(vals);
		NeuralNetwork network = new NeuralNetwork();
		Matrix output = network.forward(X);
		output.print(1, 2);
	}

}
