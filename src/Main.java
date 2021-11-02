import jp.ac.uryukyu.ie.jp.ac.uryukyu.ie.e215735.library.*;

public class Main {
    public static void main(String[] args){
        //貸し出し図書の準備
        RentalBook book1 = new RentalBook("何故ルートビアは美味いのか", 123);
        System.out.println(book1.title);
        book1.printSummary();
        Member teacher = new Member(945734, "naltoma");
        System.out.println(teacher.getName());
    }    

}

