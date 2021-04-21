package day17_terinary_nested_conditions;

public class MoreTernary {
    public static void main(String[] args) {
        
        int hourlyRate = 50;
        String reply = (hourlyRate > 45) ? "accept" : "reject";
        System.out.println("reply = " + reply);
        
        String todayClass = "java";
        String teacher = (todayClass.equals("java")) ? "Siam|Murodil" : "nadir";
        System.out.println("Today's teacher = " + teacher);
        
        
        boolean isEligibleToDrive = false;
        String driving= (isEligibleToDrive) ? "yes, have Dl can drive" : "NO DL, can not drive";
        System.out.println("driving = " + driving);



        
        
        
        
    }
}
