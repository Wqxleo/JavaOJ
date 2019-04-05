package com.homework04F;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int m = scan.nextInt();
		int n = scan.nextInt();
		double[][] arr = new double[m][n];
		for(int i = 0; i < m; i++) {
			for(int j = 0; j < n; j++) {
				double d = scan.nextDouble();
				arr[i][j] = d;
			}
		}
		Matrix matrix = new Matrix(arr, m, n);
		System.out.println("row:"+matrix.height()+" column:"+matrix.width());
		int row = scan.nextInt();
		int col = scan.nextInt();
		double value = scan.nextDouble();
		matrix.set(row, col, value);
		System.out.println("after set value:");
		matrix.print();
		row = scan.nextInt();
		col = scan.nextInt();
		System.out.println("value on ("+row+","+col+"):"+(int)matrix.get(row, col));
		m = scan.nextInt();
		n = scan.nextInt();
		double[][] b = new double[m][n];
		for(int i = 0; i < m; i++) {
			for(int j = 0; j < n; j++) {
				double d = scan.nextDouble();
				b[i][j] = d;
			}
		}
		Matrix matrix2 = new Matrix(b, m, n);
		System.out.println("after add:");
		matrix.add(matrix2).print();
		m = scan.nextInt();
		n = scan.nextInt();
		double[][] c = new double[m][n];
		for(int i = 0; i < m; i++) {
			for(int j = 0; j < n; j++) {
				double d = scan.nextDouble();
				c[i][j] = d;
			}
		}
		scan.close();
		Matrix matrix3 = new Matrix(c, m, n);
		System.out.println("after multiply:");
		matrix.multiply(matrix3).print();
		System.out.println("after transpose:");
		matrix.transpose().print();
	}

}

class Matrix {
	private double[][] arr;
	private int m;
	private int n;
	public Matrix(double[][] a, int m, int n) {
		arr = new double[m][n];
		this.m = m;
		this.n= n;
		System.arraycopy(a, 0, arr, 0, m);
	}
	public Matrix(int m, int n) {
		arr = new double[m][n];
		this.m = m;
		this.n= n;
	}
	public void set(int row, int col, double value) {
		arr[row-1][col-1] = value;
	}
	public double get(int row, int col) {
		return arr[row-1][col-1];
	}
	public int width() {
		return n;
	}
	public int height() {
		return m;
	}
	public Matrix add(Matrix b) {
		Matrix c = new Matrix(m,n);
		for(int i = 0; i < m; i++) {
			for(int j = 0; j < n; j++) {
				c.arr[i][j] = arr[i][j] + b.arr[i][j];
			}
		}
		return c;
	}
	public Matrix multiply(Matrix b) {
		Matrix c = new Matrix(m,b.n);
		for(int i = 0; i < m; i++) {
			for(int j = 0; j < b.n; j++) {
				for(int k = 0; k < n; k++) {
					c.arr[i][j] += arr[i][k] * b.arr[k][j];
				}
			}
		}
		return c;
	}
	public Matrix transpose() {
		Matrix b = new Matrix(m, n);
		for(int i = 0; i < m; i++) {
			for(int j = 0; j < n; j++) {
				b.arr[i][j] = arr[j][i];
			}
		}
		return b;
	}
	public void print() {
		for(int i = 0; i < m; i++) {
			for(int j = 0; j < n; j++) {
				System.out.print((int)arr[i][j]);
				if(j < n-1) {
					System.out.print(" ");
				}else {
					System.out.println();
				}
			}
		}
	}
}
