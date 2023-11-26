package DiaryApplication;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DiaryTest {
Diary diary = new Diary("ziri","1234");
  @Test
    void checkThatDiaryTrowsExceptionAtNeededTime(){
      //checkThatICannotCreateEntryIfDiaryIsLocked
      assertThrows(IllegalArgumentException.class, ()-> diary.createEntry("In Ash We Rise", "Today of internal Grace"));

      //check that i cannot unlock account if password is incorrect
      assertThrows(IllegalArgumentException.class, ()-> diary.unlockDiary("1011"));

      // check that i cannot delete/account that is not available
      assertThrows(IndexOutOfBoundsException.class, ()-> diary.deleteEntry(15));


  }

    @Test
    void checkThatICanCreateEntryIfDiaryIsOpenAndItGenerateAnIDForMe(){
        diary.unlockDiary("1234");
        diary.createEntry("In Ash We Rise", "Today of internal Grace");
    }

    @Test
    void checkThatICanLockDiary(){
        diary.lockDiary();
        assertThrows(IllegalArgumentException.class, ()-> diary.createEntry("In Ash We Rise", "Today of internal Grace"));
    }

    @Test
    void checkThatICanDeleteEntry(){
      diary.unlockDiary("1234");
        diary.createEntry("In Ash We Rise", "Today of internal Grace");
        diary.deleteEntry(1);
        assertThrows(IndexOutOfBoundsException.class, ()-> diary.findEntry(1));
    }

    @Test
    void checkThatICanFindEntryByID(){
        diary.unlockDiary("1234");
        diary.createEntry("In Ash We Rise", "Today of internal Grace");
        Entry entry = diary.findEntry(1);
        assertEquals(entry, diary.findEntry(1));
    }

    @Test
    void checkThatICanUpdateEntryByID(){
        diary.unlockDiary("1234");
        diary.createEntry("In Ash We Rise", "Today of internal Grace");
        diary.updateEntry(1, "Our Face Shall shine", "Today in London Local Time i Shine");

    }


}