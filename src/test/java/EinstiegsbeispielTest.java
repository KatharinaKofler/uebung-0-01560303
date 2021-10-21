import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class EinstiegsbeispielTest {

    Einstiegsbeispiel einstiegsbeispiel;

    @BeforeEach
    void setUp(){
        this.einstiegsbeispiel = new Einstiegsbeispiel();

        boolean[] input1 = new boolean[]{true, true, true, true};
        boolean[] input2 = new boolean[]{false, false, false, true };

    }

    @Test
    void testTrue1() {
        this.einstiegsbeispiel = new Einstiegsbeispiel();

        boolean[] input1 = new boolean[]{true, true, true, true};
        boolean[] input2 = new boolean[]{false, false, false, true };
        int length1 = input1.length;
        int length2 = input2.length;
        assertEquals(length1,length2);
    }

    @Test
    void testTrue2() {

        boolean[] input1 = new boolean[]{true, true};
        boolean[] input2 = new boolean[]{false, true};
        int test = 1;
        int count = 0;
        for(int i = 0; i < input1.length; i++) {
            if(input1[i] != input2[i]) {
                count++;
            }
        }

        assertEquals(count, test);
    }

    @Test
    void testFalse1() {
        this.einstiegsbeispiel = new Einstiegsbeispiel();

        boolean[] input3 = new boolean[]{true, true, true};
        boolean[] input4 = new boolean[]{false, false, false, true };
        int length3 = input3.length;
        int length4 = input4.length;
        assertEquals(length3,length4);
    }

    @Test
    void testFalse2() {
        boolean[] input1 = new boolean[]{true, false};
        boolean[] input2 = new boolean[]{false, true};
        int test = 1;
        int count = 0;
        for(int i = 0; i < input1.length; i++) {
            if(input1[i] != input2[i]) {
                count++;
            }
        }
        assertEquals(count, test);
    }
}
