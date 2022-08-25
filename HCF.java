
public class HCF {

    
    public static void main(String[] args) {
        int num1=60;   //number 1
        int num2=36;   //number 2
        int hcf=1;  //initally HCF of every number is 1
        for(int i=1;i<=num1||i<=num2;i++)  //loop statement
        {
            if( num1%i==0 && num2%i==0)   //condition
                //both condition is true then hcf vale is change.
            {
                hcf=i;
            }
        }
        System.out.println("HCF of num1 and num2:"+hcf);
    }
    
}
