import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        
        //1
        list.add(90);
        list.add(89);
        list.add(77);
        list.add(68);
        list.add(46);

        //2
        System.out.println(list);

        //3
        int h = list.get(0);
        int l = list.get(0);
        int sum = 0;

        for(int i =1;i<list.size();i++){
            if(list.get(i)>h){
                h = list.get(i);
            }else if(list.get(i)<l){
                l = list.get(i);
            }
            sum += list.get(i);

        }
        System.out.println("Max element : "+h);
        System.out.println("Min element : "+l);
        System.out.println("Average element : "+(sum/list.size()));

        list.remove(2);
        System.out.println(list);
    }
}