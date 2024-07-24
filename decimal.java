import java.util.*;
class decimal{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        //sieve(40);
        //System.out.println(newtonRaphsonSqroot(36));
        //euclidenGCD(24,36);
        lcm(24,36);

    } 
static void decimaltoBinary(){

}

static void countDigits(int num){
    if(num==0) { System.out.println("1"); return; }
   
    //int count = (int)((int) Math.log(num)/Math.log(10))+1;
    int count =(int)Math.log10(num)+1;
    System.out.println("Number of digits in "+num+" is "+count);
}

static void sieve(int num){
    boolean[] arr = new boolean[num+1];
    Arrays.fill(arr,true);
    for(int i=2;i<=num;i++){
        if(arr[i]==true){
            for(int j=2*i;j<=num;j+=i){
                arr[j]=false;
            }
        }
    }
    System.out.println("Prime numbers till "+num+" are: ");
    for(int i=2;i<=num;i++){
        if(arr[i]==true) System.out.print(i+" ");
    }
}

static double newtonRaphsonSqroot(int num){
    double tol=0.0001,ans=0.0d;
    double x=num;
    double root;
    while(true){
        root=0.5*(x+(num/x));
        ans=x-root;
        if(ans < tol){
            break;
        }
        x=root;
    }
    return root;
}
static int GCD(int num1,int num2){
  int min=  (num1 <= num2)?num1:num2;
  while(min >0){
    if(num1%min==0 && num2%min==0){ return min;}min--;
  }
  int max =(num1 <= num2)?num2:num1;
  return max;

}


static int euclidenGCD(int num1,int num2){

    while(num1!=0&&num2!=0){
        if(num1>num2){num1=num1%num2;}
        else{num2=num2%num1;}

    }
    int res=num1;
    if(num1==0)res=num2;
    //System.out.println(res);
    return res;
}
static void lcm(int num1,int num2){
    int res=num1*num2/euclidenGCD(num1,num2); 
    System.out.println(res);
}

static double fastExponen(int num,int power){
    double res=1.0d;
    while(power>0){
        if(power%2==1){res=res*num;}
        num=num*num;
        power=power/2;
    }
    return res;
}




}