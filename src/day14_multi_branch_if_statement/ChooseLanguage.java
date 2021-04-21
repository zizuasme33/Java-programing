package day14_multi_branch_if_statement;

public class ChooseLanguage {
    public static void main(String[] args) {
        System.out.println("Choose your language");

        int selection = 6 ;
        if (selection == 1){
            System.out.println("hello, thank for your call");
        }else if(selection == 2){
            System.out.println("holla, gracias para llamar");

        } else if(selection == 3 ){
            System.out.println("merhaba, aradiginiz izin tesekkurler");
        }else if(selection == 4){
            System.out.println("privet, spasibo za vash zvonok");
        }else if (selection == 5) {
            System.out.println("Merci, pour votre appel");
        }else if (selection == 6){
            System.out.println("Selam, yekenyelna bmdwalkum");
        }
        else {
            System.out.println("lets talk java and english, hello");
        }


    }
}
