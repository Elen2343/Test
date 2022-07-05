import java.util.List;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class WithProblemsTests {

    private final String CONST = "const";
    private final static String bd = "pui";

   
    public void equalsOneToOne(){
        assertEquals("1", "1");
    }


   
    public void assignValueToConstVar(){
        CONST = "newValue";
        assertEquals("newValue", CONST);
    }

    
    public static void equalsOneToOne(){
        assertEquals(1, 1);
    }



    
    public void stringsMustBeEquals(){
        String res = "a";

        if (bd == new String("pui")) {
            res = "asd";
        }

        assertEquals("asd", res);
    }

   
    public void successfullyRemovingFirstElementFromList(){
        List<String> sourceData = List.of("1", "viskas", "chupocabra");
        for (String element: sourceData){
            sourceData.remove(element);
        }
        assertFalse(sourceData.contains("1"));
    }


}
