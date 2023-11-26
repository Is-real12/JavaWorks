package DiaryApplication;

import java.util.ArrayList;

public class Diary {
    private String userName;
    private String passwords;
    private boolean isLocked;
    private int id;
    private ArrayList<Entry> entries;

    public Diary(String userName, String passwords) {
        this.userName = userName;
        this.passwords = passwords;
        isLocked = false;
        this.entries = new ArrayList<>();
    }

    public void unlockDiary(String password) {
        if (password.equals(passwords)) {
            isLocked = true;
        } else {
            throw new IllegalArgumentException("Input does not match Details");
        }

    }

    private boolean validate(String passwordOrUserName) {
        if (passwordOrUserName.equals(passwords) || passwordOrUserName.equals(userName)) {
            return true;
        } else {
            throw new IllegalArgumentException("Input does not match Details");
        }
    }

    public void lockDiary() {
        isLocked = false;
    }

    public boolean isLocked() {
        return isLocked;
    }
private int getId(){
    return  id++;
}
    public void createEntry(String title, String body) {
        if (isLocked == true){
            getId();
            Entry entry = new Entry(title, body, id);
            entries.add(entry);
        }else {
            throw new IllegalArgumentException("Diary is Locked");
        }

    }

    public void deleteEntry(int id) {
        if (id - 1 > entries.size()) {
            throw new IndexOutOfBoundsException("Entry Not Found");
        }
        entries.set(id - 1, null);
    }

    public Entry findEntry(int id) {
        if (id - 1 > entries.size() || entries.get(id -1) == null) {
            throw new IndexOutOfBoundsException("Entry Not Found");
        } else {
            return entries.get(id - 1);
        }
    }

    public void updateEntry(int id, String title, String body) {
        if (isLocked){
            if (id - 1 > entries.size()) {
            throw new IndexOutOfBoundsException("Entry Not Found");
        } else {
            Entry entry = new Entry(title, body, id);
            entries.set(id-1, entry);
        }
        }else {
            throw new IllegalArgumentException("Diary is Locked");

        }

        }
        @Override
        public String toString(){
        return String.format("""
                            Your Diary Details are:
                Your Entry ID is: %s
                Your userName is: %s
                Your Password is: %s
                Your Diary Status is: %s
                """,getId(),userName, passwords, isLocked());
        }
}
