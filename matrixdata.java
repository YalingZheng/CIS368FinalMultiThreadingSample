import java.util.Random;
public class matrixdata {	
	public static int numrows = 2000;
	public static int numcols = 2000;
	public static double[][] a;
	public static double[][] b;
	public static double[][] result;	
	public static double[][] deepCopyResult(){
		double[][] result1 = new double[numrows][numcols];
		for (int row=0; row<numrows;row++)
			for (int col=0; col<numcols; col++)
				result1[row][col] = result[row][col];
		return result1;		
	}	
	public static boolean compareTwoResults(double[][] r1, double[][] r2) {
		for (int row=0; row<numrows;row++)
			for (int col=0; col<numcols; col++) {
				if (r1[row][col] != r2[row][col]) {
					System.out.println("Two results are different!!!");
					return false;
				}
			}
		System.out.println("Two results are same!!!");
		return true;
	}	
	public static void generateMatrixData() {
		a = new double[numrows][numcols];
		b = new double[numrows][numcols];
		result = new double[numrows][numcols];
		Random r = new Random();
		r.setSeed(100L);
		for (int i=0; i<numrows;i++)
			for (int j=0; j<numcols;j++) {
					a[i][j] = r.nextDouble();
					b[i][j] = r.nextDouble();
			}		
	}
}
