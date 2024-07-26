package Array;
import java.util.Scanner;
public class Array3D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		int arr[][][]=new int[3][2][];
		arr[0][0]= new int[3];
		arr[0][1]= new int[2];
		arr[1][0]= new int[1];
		arr[1][1]= new int[4];
		arr[2][0]= new int[2];
		arr[2][1]= new int[3];
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				for(int k=0;k<arr[i][j].length;k++) {
					System.out.println("Enter a["+i+"]"+"["+j+"]"+"["+k+"]");
					arr[i][j][k]=s.nextInt();
				}//k=ForlOOp
				System.out.println();
			}//j=ForLoop
			System.out.println();
		}//i=forLoop
			
		for(int n1[][]: arr) {
			for (int n2[]:n1) {
				for(int n3:n2)
					System.out.print(n3+" ");
			}
			System.out.println();
		}
		System.out.println();
        s.close();
	}

}
