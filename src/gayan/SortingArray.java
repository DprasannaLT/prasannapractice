package gayan;

public class SortingArray {
	public static void main(String[] args) {
		
	
	int arr[]=new int []{0,6,2,1};
	int temp=0;
	for(int i=0;i<arr.length;i++) {
		System.out.print(" "+arr[i]);
	}
	for(int i=0;i<arr.length;i++) {
		for(int j=i+1;j<arr.length;j++) {
			if(arr[i]>arr[j]) {
				temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
			//System.out.print(arr[i]);
		}
		System.out.println();
		System.out.println(arr[i]);
	}
	
	}
}
