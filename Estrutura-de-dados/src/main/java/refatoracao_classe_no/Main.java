package refatoracao_classe_no;



public class Main {

    public static void main(String[] args) {

        NoR<String> no1 = new NoR<>("ConteÃºdo no1");

        NoR<String> no2 = new NoR<>("ConteÃºdo no2");
        no1.setProximoNo(no2);

        NoR<String> no3 = new NoR<>("ConteÃºdo no3");
        no2.setProximoNo(no3);

        NoR<String> no4 = new NoR<>("ConteÃºdo no4");
        no3.setProximoNo(no4);
        //no1->no2->no3->no4->null

        System.out.println(no1);
        System.out.println(no1.getProximoNo());
        System.out.println(no2);

        System.out.println("---------------------");

        System.out.println(no1);
        System.out.println(no1.getProximoNo());
        System.out.println(no1.getProximoNo().getProximoNo().getProximoNo());
        System.out.println(no1.getProximoNo().getProximoNo().getProximoNo().getProximoNo());


    }
}
