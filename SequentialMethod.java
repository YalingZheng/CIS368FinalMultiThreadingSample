
public class SequentialMethod {
	
	public double[][] add(double[][] a, double[][] b) {
		int numrowdim = a.length;
		int numcoldim = 0;
		if (a!=null)
			numcoldim = a[0].length;
		
		long begintime = System.currentTimeMillis();
		
		for (int i=0; i<numrowdim; i++) {
			for (int j=0; j<numcoldim; j++) {
				matrixdata.result[i][j] = a[i][j] + b[i][j];
			}
		}		
		long duration = System.currentTimeMillis() - begintime;
		System.out.println("Time spent using sequential method -  " + duration);
		return matrixdata.result;
	}
	

}
