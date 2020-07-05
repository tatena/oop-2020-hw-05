package webApp;

import java.lang.management.BufferPoolMXBean;
import java.util.HashMap;

public class AccountManager {
    private HashMap<String, String> dataBase;

    public AccountManager() {
        dataBase = new HashMap<>();
        this.addAccount("Patrick", "1234");
        this.addAccount("Molly", "FloPup");
    }

    public boolean checkAccount(String username, String password) {
        return checkAccountExists(username, password) && dataBase.get(username).equals(password);
    }

    public boolean checkAccountExists(String username, String password) {
        return dataBase.containsKey(username);
    }

    public void addAccount(String username, String password) {
        dataBase.put(username, password);
    }
}
