package shobhit;
class sum{
	private float num1;
    private float num2 ;
   sum(){
	   
   }
   
   sum(int num1,int num2)
   {
	   this( (float)num1,(float) num2){
	   this.num1= num1;
	   this.num2= num2;
	   }
	   
   }
   sum(float num1,float num2)
   {
	   this.num1=num1;
	   this.num2=num2;
	   
   }
    
	
	float getsum() {
	return num1+num2;
	}
}

public class Const {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 sum s1=new sum(13.23f,13.56f);
		float add=s1.getsum();
		System.out.println("sum=="+add);
	}
}


