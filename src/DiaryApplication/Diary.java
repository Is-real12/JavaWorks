package DiaryApplication;

        import java.util.ArrayList;
        import java.util.Arrays;

public class Diary {
    private String userName;
    private String passwords;
    private boolean isLocked;
    private int id;
    private ArrayList<Entry> entries;
    private ArrayList<String> entryStr ;

    public Diary(String userName, String passwords) {
        this.userName = userName;
        this.passwords = passwords;
        isLocked = false;
        this.entries = new ArrayList<>();
        this.entryStr = new ArrayList<>();
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
            String spli = body;
            if (body.length() % 50 == 0) {
                String splis = body.lines().toString();
//                 Arrays.toString(body.split("\n"));
//                spli += spli.replace("z", "\n");
            }
            entryStr.add(String.format("""
                                        %s
                        %s
                        """, title, spli));

            Entry entry = new Entry(title, body, getId());
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
        if (isLocked == true) {
            if (id - 1 > entries.size() || entries.get(id - 1) == null) {
                throw new IndexOutOfBoundsException("Entry Not Found");
            } else {
                return entries.get(id - 1);
            }
        } else {
            throw new IllegalArgumentException("Diary is Locked");

        }
    }

    public String getEntryStr(int whichEntry) {
        if (isLocked == true) {

            return entryStr.get(whichEntry - 1);
        } else {
            throw new IllegalArgumentException("Diary is Locked");
        }
    }
    public void updateEntry(int id, String title, String body) {
        if (isLocked){
            if (id - 1 > entries.size()) {
                throw new IndexOutOfBoundsException("Entry Not Found");
            } else {
                Entry entry = new Entry(title, body, id);
                entryStr.set(id-1, (String.format("""
                                    %s
                    %s
                    """,title,body)));
                entries.set(getId()-1, entry);
            }
        }else {
            throw new IllegalArgumentException("Diary is Locked");

        }

    }
    @Override
    public String toString(){
        String lol = "";
        if (isLocked == true) {
            lol = "Your Diary is Open";
        }
        else {
            lol = "Your Diary is Locked";
        }
        return String.format("""
                            Your Diary Details are:
                Your Entry ID is: %s
                Your userName is: %s
                Your Password is: %s
                Your Diary Status is: %s
                
                """,entries.size(),userName, passwords,lol);
    }

    public static void main(String[] args) {
        Diary d = new Diary("","");
        d.unlockDiary("");
        d.createEntry("Title","One day as i was coming na so i take see this z mallam wey dey soe shoe i con say make i call am shey u know weiten him tell me, him talk say i no dey soe broke shoe \n");
        System.out.println(d.getEntryStr(1));
//        System.out.println(d.getEntryStr());
    }
}
