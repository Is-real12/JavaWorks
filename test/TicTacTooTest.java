import TicTacTo.Empty;
import TicTacTo.TikTac;
import org.junit.jupiter.api.Test;

import java.util.InputMismatchException;

import static org.junit.jupiter.api.Assertions.*;

class TicTacTooTest {

    @Test
    public void testThatMyBoardIsContainsEmpty(){
        TikTac tiktac = new TikTac();
        Empty empty;
        assertTrue(tiktac.getEmpty());

    }

    @Test
    public void testThatUserCanOnlyBe_X_or_O_AndTheyCanChooseWhereToPlay (){
        TikTac tiktac = new TikTac();
        assertThrows(InputMismatchException.class, ()->tiktac.play("W", 2));
        tiktac.play("X", 2);
        tiktac.play("O", 1);

    }
    @Test
    public void testThatUserCantPlayInTheSamePlace (){
        TikTac tiktac = new TikTac();
        tiktac.play("X", 1);
        assertThrows(IllegalArgumentException.class,  ()->tiktac.play("O", 1));

    }
    @Test
    void testThatAfterthreeMacthingXorOYouShouldWin(){
        TikTac tiktac = new TikTac();
        tiktac.play("X", 1);
        tiktac.play("X", 4);
        tiktac.play("X", 7);
        assertTrue(tiktac.gameRules());
    }

    @Test
    void testThatAfterAllPlaysWithoutMacthing_XorO_it_A_Draw(){
        TikTac tiktac = new TikTac();
        tiktac.play("X", 1);
        tiktac.play("O", 2);
        tiktac.play("X", 3);
        tiktac.play("O", 4);
        tiktac.play("X", 5);
        tiktac.play("O", 6);
        tiktac.play("X", 7);
        tiktac.play("O", 8);
        tiktac.play("X", 9);
        assertTrue(tiktac.gameRules());
    }
//    public static void main(String[] args) {
//
//    }
}