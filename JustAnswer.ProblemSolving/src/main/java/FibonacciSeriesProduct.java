import java.util.ArrayList;

public class FibonacciSeriesProduct {
	public int[] fiboProd(int n) {
		int n1=1;
		int n2=1;
		int prod=1;
		ArrayList<Integer>list = new ArrayList<Integer>();
		for(int i=2;i<=n;i++) {
			int s=n1+n2;
			prod=prod*n1;
			list.add(prod);
			n1=n2;
			n2=s;
		}
		int fibProd[]=list.stream().mapToInt(i->i).toArray();
		return fibProd;
	}
	public static void main(String args[]) {
		FibonacciSeriesProduct f = new FibonacciSeriesProduct();
		int n=3;
		int res[]=f.fiboProd(n);
		for(int i=0;i<res.length;i++) {
			System.out.print(res[i]+" ");
		}
	}

}
