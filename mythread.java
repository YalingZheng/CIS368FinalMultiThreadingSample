
public class mythread extends Thread{

	private int rowbeginindex = 0;
	private int rowendindex = 0;
	public mythread(int rowbeginindex, int rowendindex) {
		this.rowbeginindex = rowbeginindex;
		this.rowendindex = rowendindex;
	}

	public void run() {
		for (int i=rowbeginindex; i<rowendindex; i++) {
			for (int j=0; j<matrixdata.numcols; j++) {
				matrixdata.result[i][j] = matrixdata.a[i][j] + matrixdata.b[i][j];
			}
		}
	}
}