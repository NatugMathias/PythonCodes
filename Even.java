public class Even{
    
    public static void main(String[] args){
        int i; 
        for(i=0; i<=20;i++){
            if(i == 0){
                continue;
            }
            if(i % 2 == 0){
                System.out.println(i+" is an even number");
            }
        }
    }
}