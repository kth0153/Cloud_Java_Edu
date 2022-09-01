package j20220727;

public class While_1 {

static 	int init=0;
static 	int sum=0;

	
	
	public static int Array() {
		int temp=0;
		while (++init<=10) {
			sum=sum+init;
			//System.out.println(init);
			temp=init;
			
		}
		//System.out.println(init);
		//System.out.println("합은:"+sum);
		
		
		return temp;
		
	}
	
	
	
	public static void main(String[] args) {
		
	
		
		
		int intvalue[]=new int[10];
		
		for(int i=0;i<intvalue.length;i++) {
			 intvalue[i]=i+1;
			
		}
		
		
		
		
		System.out.println(While_1.Array()); 
		
		
		
		
	}
}
