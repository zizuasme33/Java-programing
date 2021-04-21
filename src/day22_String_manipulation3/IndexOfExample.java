package day22_String_manipulation3;

public class IndexOfExample {
    public static void main(String[] args) {
        String technologies = "java, html, css, selenium, testng, maven, cucumber";

        System.out.println(technologies.indexOf(",")); // 4
        // last coma
        System.out.println(technologies.lastIndexOf(",")); // 40
        // for middle one we need to loop
        
        int indexOfJava = technologies.indexOf("java");
        System.out.println("java is index = " + indexOfJava);

        int indexOfCss = technologies.indexOf("css");
        System.out.println("Css is index = " + indexOfCss);

        int indexOfCucumber = technologies.indexOf("cucumber");
        System.out.println("Cucumber is index = " + indexOfCucumber);


        int indexOfSql = technologies.indexOf("sql"); // not present -1
        System.out.println("Sql index of  = " + indexOfSql);

        if (technologies.contains("maven")) {
            System.out.println("maven is present");
        }else {
            System.out.println("maven is not present");

        }

        if (technologies.indexOf("maven")>= -1) { // which will be present
            System.out.println("maven is present");

        }else {
            System.out.println("maven is not present");
        }




    }
}
