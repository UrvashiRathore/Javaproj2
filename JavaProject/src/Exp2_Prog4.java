
public class Exp2_Prog4 {
	public static void main(String[] args) {
	int n=10, temp;
	int stu[]=new int[n];
		stu[0] = 49;
		stu[1] = 50;
		stu[2]=57;
		stu[3]=74;
		stu[4]=59;
		stu[5]=72;
		stu[6]=85;
		stu[7]=93;
		stu[8]=79;
		stu[9]=90;
	
	   for(int i=0;i<n;i++)
    {
    	for(int j=i+1;j<n;j++)
    	{
    		if(stu[i]>stu[j])
    		{
    			temp = stu[i];
    			stu[i] = stu[j];
    			stu[j] = temp;
    		}
    	}
    }
    System.out.print("Marks of Student in Ascending Order: ");
    for (int i=1; i < n-1; i++) 
    {
        System.out.print(stu[i] + ", ");
    }
    System.out.print(stu[n-1]);
    for(int i=0;i<n;i++) {
    	if(stu[i] > 40) {
    		System.out.print("Student stu[i] got Pass ");
    	}
    	if(stu[i] > 50) {
    			System.out.print("Student stu[i] got Merit ");}
    	if(stu[i] > 75)
    	{
    	System.out.print("Student stu[i] got distinction ");
    		}
    }
}
}
