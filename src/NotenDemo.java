public class NotenDemo {

    public static void main(String[] args) {
        getNotentext(77);
    }
    public static String getNotentext (int Punkte) {
        String Note = "Sehr gut";

       if (Punkte >= 90)   System.out.println(Note);
       else if (Punkte >= 78) System.out.println("Gut");
      else if (Punkte >= 65) System.out.println("Befriedigend");
       else if (Punkte >= 51) System.out.println("Genügend");
       else if (Punkte <= 51) System.out.println("Nicht Genügend");



        return Note;
    }
}
