package ZebibPractices.Practice_day14.Replit;
import java.util.*;

public class Db {
    public Db(String next, int nextInt) {
    }

    public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            Db db = new Db(in.next(),in.nextInt());

            System.out.println(db.getData());
            System.out.println(db.getYint());

            db.setData(in.next());
            db.setYint(in.nextInt());

            System.out.println(db.getData());
            System.out.println(db.getYint());

        }
        
        private  String data;
        private  int Yint;

        public void setData(String data){
            this.data = data;
        }
        public String getData(){
            return data;
        }
        public void setYint(int Yint){
            this.Yint = Yint;
        }
        public int getYint(){
            return Yint;
    }

    @Override
    public String toString() {
        return "Db{" +
                "data='" + data + '\'' +
                ", Yint=" + Yint +
                '}';
    }
}
