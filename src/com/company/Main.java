package com.company;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
//        ex1();
//        ex2();
//        ex3();
//        ex4();
//        ex5();
//        ex6();
//        ex7();
//		ex8();
		ex9();
	}

	public static void ex1() {
		final int N = 5;
		float[] arr = new float[N];
		float max = 0;
		int ind = 0;
		for (int i = 0; i < 5; i++) {
			arr[i] = (float) Math.random() * 30 + 25;
			if (arr[i] > max) {
				max = arr[i];
			}
			if (arr[i] == max) {
				ind = i;
			}
		}
		System.out.println("Выгоднее менять доляры в банке номер " + (ind + 1));
	}

	public static void ex2() {
		final int N = 128;
		int n = 2;
		int[] arr = new int[N];
		for (int i = 0; i < N; i++) {
			arr[i] = (int) (Math.random() * 10) + 1;
			if (i == Math.pow(2, n)) {
				System.out.println("arr[" + i + "] = " + arr[i]);
				n++;
			}
		}
	}

	public static void ex3() {
		final int N = 15;
		int sum = 0;
		int[] arr = new int[N];
		for (int i = 0; i < N; i++) {
			arr[i] = (int) (Math.random() * 10) + 1;
			if (i % 2 == 0) {
				sum += arr[i];
			}
		}
		System.out.println(Arrays.toString(arr));
		System.out.println("sum = " + sum);
	}

	public static void ex4() {
		final int N = 15;
		int comp = 1;
		int[] arr = new int[N];
		for (int i = 0; i < N; i++) {
			arr[i] = (int) (Math.random() * 100) + 1;
			if (arr[i] % 9 == 0) {
				comp *= arr[i];
			}
		}
		System.out.println(Arrays.toString(arr));
		System.out.println("composition = " + comp);
	}

	public static void ex5() {
		final int N = 30;
		int a = 5;
		int[] arr = new int[N];
		for (int i = 0; i < N; i++) {
			arr[i] = (int) (Math.random() * 2);
			if (arr[i] == 1) {
				a += 2;
			} else {
				a -= 1;
			}
		}
		System.out.println(Arrays.toString(arr));
		System.out.println("Улитка находится на высоте " + a + "cм");
	}

	public static void ex6() {
		final int N = 12;
		double[] arrR = new double[N];
		double[] arrP = new double[N];
		double[] arrZ = new double[N];
		double max = 0, min = 2500000;
		int indmax = 0, indmin = 0, count = 0;
		for (int i = 0; i < N; i++) {
			arrR[i] = (Math.random() * 1000000) + 500000;
			arrP[i] = (Math.random() * 1000000) + 500000;
			arrZ[i] = arrP[i] - arrR[i];
			if (arrZ[i] > max) {
				max = arrZ[i];
				indmax = i;
			}
			if (arrZ[i] < min) {
				min = arrZ[i];
				indmin = i;
			}
			if (arrZ[i] > 0) {
				count++;
			}
			System.out.println("Общая прибыль за " + (i + 1) + " месяц = " + arrZ[i] + "\n");
		}
		System.out.println("Месяц с максимальной прибылью: " + indmax);
		System.out.println("Месяц с минимальной прибылью: " + indmin);
		System.out.println("Колво месяцев с положительной прибылью: " + count);
	}

	public static void ex7() {
		final int N = 10;
		int[] arrH = new int[N];
		int[] arrD = new int[N];
		int i;
		for (i = 0; i < N; i++) {
			arrH[i] = (int) (Math.random() * 10) + 1;
			arrD[i] = (int) (Math.random() * 10) + 1;
		}
		System.out.println(Arrays.toString(arrH));
		System.out.println(Arrays.toString(arrD));
		int tmp;
		boolean flag = true, flag1 = true;
		i = 0;
		while (flag) {
			flag = false;
			if (arrD[i] > arrD[i + 1]) {
				tmp = arrD[i];
				arrD[i] = arrD[i + 1];
				arrD[i + 1] = tmp;
				flag = true;
			}
		}
		while (flag1) {
			flag1 = false;
			if (arrD[i] > arrD[i + 1]) {
				tmp = arrH[i];
				arrH[i] = arrH[i + 1];
				arrH[i + 1] = tmp;
				flag1 = true;
			}
		}
		System.out.println("Таблица лучших результатов: ");
		for (i = 0; i < 3; i++) {
			System.out.println(i + "-ое место высота : " + arrH[i]);
			System.out.println(i + "-ое длинна : " + arrD[i]);
		}
	}

	public static void ex8() {
		final int N = 10;
		int tmp, j = N - 1;
		int[] arr = new int[N];
		for (int i = 0; i < N; i++) {
			arr[i] = (int) (Math.random() * 10) + 1;
		}
		System.out.println(Arrays.toString(arr));
		tmp = arr[0];
		for (int i = 0; i < N / 2; i++) {
			tmp = arr[i];
			arr[i] = arr[j - i];
			arr[j - i] = tmp;
		}
		System.out.println(Arrays.toString(arr));
	}



	public static void ex9() {
		final int N = 20;
		int count = 0;
		int[] arr = new int[N];
		for (int i = 0; i < N; i++) {
			arr[i] = (int) (Math.random() * 100) + 1;

		}
		System.out.println(Arrays.toString(arr));
		for (int i = 0; i < N; i++) {
			if (isSimple(arr[i])) {
				System.out.println("Индекс простого числа = " + i);
				count++;//для проверк}и
			}
		}
		if (count == 0) {
			System.out.println("В массиве нет простых чисел");
		}


	}

	private static boolean isSimple(int number) {
		for (int i = 2; i < Math.sqrt(number); i++) {
			if (number % i == 0)
				return false;
		}
		return true;
	}
}
