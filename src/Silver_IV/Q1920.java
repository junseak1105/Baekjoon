package Silver_IV;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Q1920 {


	static ArrayList<Integer>[] list;
	static int[] dfs_result;
	static int[] bfs_result;

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int data_cnt= Integer.parseInt(br.readLine());
		StringTokenizer token = new StringTokenizer(br.readLine());
		int data_arr[] = new int[data_cnt];
		for(int i=0;i<data_cnt;i++){
			data_arr[i]=Integer.parseInt(token.nextToken());
		}
		Arrays.sort(data_arr);

		int data_find= Integer.parseInt(br.readLine());
		token = new StringTokenizer(br.readLine());
		for(int i=0;i<data_find;i++){
			int find = Integer.parseInt(token.nextToken());
			System.out.println(doSearch(data_arr,find,0,data_arr.length-1));
		}
	}

	static int doSearch(int[] arr, int find,int start, int end){
		int mid = (start+end)/2;

		if(start>end){
			return 0;
		}
		int current = arr[mid];

		if(current>find){
			return doSearch(arr,find,start,mid-1);
		}else if(current<find){
			return doSearch(arr,find,mid+1,end);
		}else{
			return 1;
		}

	}
}
