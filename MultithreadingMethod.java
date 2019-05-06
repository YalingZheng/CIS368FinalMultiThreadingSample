
public class MultithreadingMethod {
	
	public double[][] add(double[][] a, double[][] b) {
		int numrowdim = a.length;

		long begintime = System.currentTimeMillis();
		
		for (int i=0; i<numrowdim/100;i++) {
			int beginindex = i * (numrowdim/100);
			int endindex = (i + 1) * (numrowdim/100);
			mythread curthread = new mythread(beginindex, endindex);
			curthread.start();			
		}
		
		long duration = System.currentTimeMillis() - begintime;
		System.out.println("Time spent using multithreading method -  " + duration);
		return matrixdata.result;
	}
	
}
