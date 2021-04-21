package day14_multi_branch_if_statement;
public class YesOrNo {
    public static void main(String[] args) {

        System.out.println("Are sure you want to delete this file");

        char selection = 'n';
        boolean answer = true;
        String result;
       if(selection == 'y'){
           System.out.println("Your file will be deleted");
           answer = true;
           result = "deleted";


       }else{
          System.out.println("File deletion cancelled");
          answer = false;
          result = "not deleted";
      }
        System.out.println("Did file get deleted - " + answer);
        System.out.println("result = " + result);






    }
}



