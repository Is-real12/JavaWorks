package DiaryApplication;

import java.util.ArrayList;

public class Diaries {
    ArrayList<Diary> diaries;

    public void add(String userName, String password){
        Diary diary = new Diary(userName, password);
        diaries.add(diary);
    }

    public Diary findByUserName(String userName) {
        if (diaries.toString().contains(userName)) {
            int index = diaries.toString().indexOf(userName);
        return diaries.get(index);
        }else {
            throw new IllegalArgumentException("Could not find diary with "+userName);
        }

    }


    public void delete(String userName, String password){
        Diary diary = new Diary(userName, password);
        if (diaries.equals(diary)){
            diaries.remove(diaries.indexOf(diary));

        }


    }
}