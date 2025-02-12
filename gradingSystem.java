public class gradingSystem {
    static void calc(float examScore, float assessmentScore, float fees ){ 
        float fee = 100;
        if(examScore >= 25 && assessmentScore >= 15){
            System.out.println("You passed");
        }
        else if(examScore + assessmentScore == 39){
            System.out.println("You are condoned");
        }
        if(examScore>=25 && assessmentScore>=15 && fees==fee){
            System.out.println("You get issued a certificate");
        }
        else{
            System.out.println("You failed");
        }
        
        if(examScore>=25){
            System.out.println("You passed the exams");
        }
        else{
            System.out.println("You failed the exams");
        }
        if(assessmentScore>=15){
            System.out.println("You passed the assessment");
        }
        else{
            System.out.println("You failed the assessment");
        }
        if(examScore<25 && assessmentScore<15){
            System.out.println("You are repeated");
        }
        float balance = fee - fees;
        if(fees<100){
            System.out.println("YOU NEED TO PAY THE REMAINING "+ balance + " OF YOUR FEES");
        }
    }
    public static void main(String[] args){
        calc(26,20,50);
    }
}
