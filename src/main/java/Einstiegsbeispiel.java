//Kofler Katharina 01560303

public class Einstiegsbeispiel {
    public static void main(String[] args) {
        //erwarteter Input: zwei mit Booleans befullte Arrays gleicher Länge z.B. [true true true] und [false false true]

        boolean[] input1 = {true, true, true, true};
        boolean[] input2 = {false, false, false, true };


        //erwarteter Output: Integer, der die Summe der Unterschiede in den Arrays entspricht z.B. 2

        System.out.println(getHammingDistance(input1, input2));
    }

    // Methodenname: getHammingDistance
    public static int getHammingDistance(boolean[] input1, boolean[] input2) {
        int count = 0;
        if(input1.length!=input2.length) {
            System.out.print("Die Arrays müssen die gleiche länge haben!");

        } else {
            for(int i = 0; i < input1.length; i++) {
                if(input1[i] != input2[i]) {
                    count++;
                }
            }
        }
        return count;
    }


}