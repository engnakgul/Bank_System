import javax.accessibility.AccessibleValue;
import java.util.HashMap;
import java.util.Map;

public class Bank {

    private Map<String, Account> accounts;

    public Bank() {
        this.accounts = new HashMap<>();
    }

    public void addAccount(String accountNumber, String customerName, double balance){
        Account account = new Account (accountNumber, customerName, balance);

        accounts.put(accountNumber, account);

        System.out.println("Hesap eklendi!!!");
    }

    public void displayAccountInfo(String accountNumber){
        if(accounts.containsKey(accountNumber)){
            Account account = accounts.get(accountNumber);
            System.out.println("Hesap Numarası: "+ account.getAccountNumber());
            System.out.println("Müşteri Adı: "+ account.getCustomerName());
            System.out.println("Bakiye: "+ account.getBalance());

        }else{
            System.out.println("HEsap bulunamadı!!!");
        }
    }
    public void performTransaction(String accountNum, double amount){
        if(accounts.containsKey(accountNum)){
            Account account = accounts.get(accountNum);
            account.deposit(amount);
            System.out.println("İşlem başarılı güncellenen bakiye: "+account.getBalance());


        }else{
            System.out.println("HEsap bulunamadı!!!");
        }
    }

}


