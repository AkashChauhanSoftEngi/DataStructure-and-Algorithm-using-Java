package alogorithm.ds.example.array;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

public class FindBestPayerAmongAll {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		List<Integer> inputList = new ArrayList<Integer>();
		
		while (in.hasNextInt()) {
			inputList.add(in.nextInt());
		}
		
		int max = Collections.max(inputList);
		int min = Collections.min(inputList);
		
		if(max>100000 || min<0){
			System.out.println("Invalid Input inserted!");
			return;
		}

		int numberOfPlayers = inputList.size() / 2;

		int[] player = new int[numberOfPlayers];
		int[][] array = new int[numberOfPlayers][2];

		ListIterator<Integer> iterator = inputList.listIterator();
		int i = 0;

		/* Store list into 2D array */
		while (i < numberOfPlayers && iterator.hasNext()) {
			array[i][0] = iterator.next();
			array[i][1] = iterator.next();
			i++;
		}

		for (int k = 0; k < numberOfPlayers; k++) {
			for (int l = 0; l < numberOfPlayers; l++) {
				if (k != l && ((array[k][0] >= array[l][0]) && (array[k][1] >= array[l][1]))
						|| ((array[k][0] >= array[l][0]) && (array[k][1] > array[l][1]))
						|| ((array[k][0] > array[l][0]) && (array[k][1] >= array[l][1]))) {
					player[k]++;
				} else {
					continue;
				}
			}
		}
		for (int m = 0; m < player.length; m++) {
			System.out.println(player[m]);
		}
	}
}
