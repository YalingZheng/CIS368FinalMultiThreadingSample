
public class testBothMethods {

	public static void main(String[] args) {
		matrixdata.generateMatrixData();
		
		SequentialMethod sm = new SequentialMethod();
		
		sm.add(matrixdata.a, matrixdata.b);
		
		double[][] result1 = new double[matrixdata.numrows][matrixdata.numcols];
		result1 = matrixdata.deepCopyResult();
		
		MultithreadingMethod mm = new MultithreadingMethod();
		
		mm.add(matrixdata.a, matrixdata.b);
		
		// compare two results
		matrixdata.compareTwoResults(result1, matrixdata.result);
		
	}

}
