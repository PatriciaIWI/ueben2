public class WinterreifenpflichtDemo {
    public static void main(String[] args) {


        isWinterreifenPflichtDemo(11, false);
    }
    public static boolean isWinterreifenPflichtDemo (int Temperatur, boolean rutschigeFahrbahn){

        if ((Temperatur < 10) || (Temperatur < 4 && rutschigeFahrbahn))
            System.out.println("Winterreifen verwenden");
        else System.out.println("Winterreifen nicht verwenden");

        return rutschigeFahrbahn;
    }
}
