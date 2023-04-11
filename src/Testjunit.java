import org.testng.annotations.Test;
import org.junit.jupiter.api.DisplayName;

import static org.junit.jupiter.api.Assertions.*;
public class Testjunit {
    @Test
    @DisplayName("Вторая строка ни разу не входит в первую")
    public void  thereisnocountMatchesOfLine2Into1 (){
        String a="абвгд";
        String b="лк";
        assertEquals(0, Main.countMatches(a,b), "The test failed");

    }

    @Test
    @DisplayName("Вторая строка входит в первую один раз")
    public void  line1EqualsLine2 (){
        String a="аб";
        String b="аб";
        assertEquals(1, Main.countMatches(a,b), "The test failed");

    }

    @Test
    @DisplayName("Вторая строка входит в первую несколько раз")
    public void line2OccursInLine1SeveralTimes() {
        String a = "абабабаб";
        String b = "аб";
        assertEquals(4, Main.countMatches(a,b), "The test failed");

    }

    @Test
    @DisplayName("Первая строка пустая")
    public void line1IsEmpty() {
        String a = "";
        String b = "аб";
        assertEquals(0, Main.countMatches(a, b), "The test failed");
    }

    @Test
    @DisplayName("Введена пустая вторая строка")
    public void line2IsEmpty (){
        assertThrows(Exception.class, ()->{
                    Main.countMatches("абсд","");
                }
        );}
}


