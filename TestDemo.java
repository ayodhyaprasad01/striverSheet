class TestDemo 
{
	public static void main(String[] args) 
	{
		int [] arr={33, 34, 35, 31, 29, 32, 36, 33};

		int n=arr.length;
		int res[]=new int[n];
		

		for(int i=0;i<n;i++){
			int count=0;
			for(int j=i+1;j<n;j++){

				if(arr[i]<arr[j]){
					count++;
					res[i]=count;
					break;
					
				}
		count++;

		}
		}
		for(int i=0;i<n;i++){
		System.out.println(res[i]);
		}
	}
}
