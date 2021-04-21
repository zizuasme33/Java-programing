package day24_loops;

public class YouTubeCatVideo {
    public static void main(String[] args) throws InterruptedException {

        System.out.println("starting: World's smallest cat: \uD83D\uDC08 - BBC");
        int seconds = 0;

        while (seconds <= 117 ) {
            System.out.println("Watching \uD83D\uDC08 at seconds: " + seconds);
            seconds ++;
            Thread.sleep(1000); // Pause the code for one 1000 milliseconds.(1seconds)
        }
        System.out.println("Finishing watching the \uD83D\uDC08 video ");
        System.out.println("Start start another one!");




    }
}
