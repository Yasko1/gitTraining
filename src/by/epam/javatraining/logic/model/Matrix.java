package by.epam.javatraining.logic.model;

public class Matrix {
	public double[][] matrix;

	public Matrix(double[][] m) {
		this.matrix = m;
	}
	
	@Override
	public String toString() {
		String s = "";
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
			s = (String) s + "  " + matrix[i][j];
			}
			s+="\n";
		}
		return s;
	}

	public double findMinElement() {
		double min = matrix[0][0];
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				if (min > matrix[i][j]) {
					min = matrix[i][j];
				}
			}
		}
		return min;
	}

	public double findMaxElement(){
		double max = matrix[0][0];
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				if (max < matrix[i][j]) {
					max = matrix[i][j];
				}
			}
		}
		return max;
	}
	
	public boolean isSimmetrical() {
		for (int i = 0; i < matrix.length - 1; i++) {
			for (int j = i + 1; j < matrix[i].length; j++) {
				if (i != j) {
					if (matrix[i][j] != matrix[j][i]) {
						return false;
					}
				}
			}
		}
		return true;
	}

	public boolean isMirrowSimmetrical() {
		for (int i = 0; i < matrix.length - 1; i++) {
			for (int j = 0; j < matrix.length - 1 - i; j++) {
				if (matrix[i][j] != matrix[matrix.length - 1 - j][matrix.length - 1 - i]) {
					return false;
				}
			}
		}
		return true;
	}

	public int findPositionOfFirstLocMin() {
		double locmin;
		int position = -1;
		int count = 0;
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				locmin = matrix[i][j];
				++count;
					if (locmin < matrix[i - 1][j] && locmin < matrix[i + 1][j] && locmin < matrix[i][j - 1] && locmin < matrix[i][j + 1]) {
						position = count;
						break;
				}
			}
		}
		return position;
	}
	
	public void transpose(){
        if(matrix.length == matrix[0].length){
        	for(int i = 0; i < matrix.length; i++){
        		for(int j = i; j < matrix.length; j++){
        			double buf = matrix[i][j];
        			matrix[i][j] = matrix[j][i];
        			matrix[j][i] = buf;
                }
        	}
        }else{
            double[][] transpondedMatrix = new double[matrix[0].length][matrix.length];
            for(int i = 0; i < matrix[0].length; i++){
            	for(int j = 0; j < matrix.length; j++){
            		transpondedMatrix[i][j] = matrix[j][i];
            	}
            }
            matrix = transpondedMatrix;
        }
    }
	
}
