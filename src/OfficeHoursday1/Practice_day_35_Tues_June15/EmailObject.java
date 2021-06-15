package OfficeHoursday1.Practice_day_35_Tues_June15;

public class EmailObject {

    public static void main(String[] args) {

        Email email = new Email("Anton@cybertekschool.com", 43);
       // email/ADDRESS = "Email"; ADDRESS is final, so cannot be changed
        System.out.println(email);
        System.out.println(Email.domain);
        System.out.println(Gmail.domain);
        System.out.println(Yahoo.domain);
        System.out.println();

        Gmail gmail= new Gmail("kamran@gmail.com", 133);
        System.out.println(email);
        System.out.println(Email.domain);
        System.out.println(Gmail.domain);
        System.out.println(Yahoo.domain);
        System.out.println();

        Yahoo yahoo = new Yahoo("jamesbond@yahoo.com", 44);
        System.out.println(Email.domain);
        System.out.println(Gmail.domain);
        System.out.println(Yahoo.domain);

        Email.sendEmail();
        Gmail.sendEmail();
        Gmail.sendSuperEmail();

    }
}
