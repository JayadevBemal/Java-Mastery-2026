package Day05_Strings;

public class Stringbuilder {
    public static void main(String[] args) {

        StringBuilder str = new StringBuilder("Jayadev");

        System.out.println(str);

        //char at 0
        System.out.println(str.charAt(0));

        //set char at any index
        str.setCharAt(2,'g');
        System.out.println(str);

        //push or insert
        str.insert(0,"Mr.");
        System.out.println(str);

        //delete
        str.delete(7,10);
        System.out.println(str);

        //append at the end

        str.append("B");
        str.append("h");
        str.append("a");
        str.append("i");
        System.out.println(str);

        //reverse

        System.out.println(str.reverse());

        for (int i = str.length()-1; i >= 0;i--){
            System.out.print(str.charAt(i));
        }
        StringBuilder peak = new StringBuilder("Rahul");
        System.out.println(peak);
        for (int i = 0; i < peak.length()/2;i++){

            int front = i;
            int back = peak.length()-1-front;

            char frontchar = peak.charAt(front);
            char backchar = peak.charAt(back);

            peak.setCharAt(front,backchar);
            peak.setCharAt(back,frontchar);


        }
        System.out.println(peak);


    }
}
