


public class Odd{
    
    public static void main(String[] args){
        int i; 
        for(i=0; i<=20;i++){
            if(i == 0){
                continue;
            }
            if(i % 2 == 1){
                System.out.println(i+" is an odd number");
            }
        }
    }
}