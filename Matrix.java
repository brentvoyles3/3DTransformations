public class Matrix {

	/*
	 * One function to multiply / concatenate matrices (2d arrays)
	 */
    public static double[][] multiply(double[][] A, double[][] B) {
	int aRows = A.length;
	int aCols = A[0].length;
	int bRows = B.length;
	int bCols = B[0].length;
	
	if (aCols != bRows) {
		System.out.println("This function will not work with unequal arrays");
	    throw new IllegalArgumentException();
	}

	double[][] resultArr = new double[aRows][bCols];
	for (int i = 0; i < aRows; i++) {
	    for (int j = 0; j < bCols; j++) {
		resultArr[i][j] = 0.00000;
	    }
	}

	for (int i = 0; i < aRows; i++) { // aRow
	    for (int j = 0; j < bCols; j++) { // bColumn
			for (int k = 0; k < aCols; k++) { // aColumn
		    	resultArr[i][j] += A[i][k] * B[k][j];
			}
	    }
	}
	return resultArr;
    } //multiply

} // Matrix