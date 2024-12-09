import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class BankingSystem {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Bank bank = new Bank();

        while (true){
            System.out.println("\nBanka Sistemi Menüsü");
            System.out.println("\n1.Hesap Ekle");
            System.out.println("\n2.İşlem Yap");
            System.out.println("\n3. Hesap Bilgisi Görüntüle");
            System.out.println("\n4. Çıkış");
            System.out.println("\nSeçiminiz:");
            int choice = scanner.nextInt();

            switch (choice){

                case 1:
                    System.out.println("Hesaap numarası: ");
                    String accountNumber = scanner.next();
                    System.out.println("Müşteri adı: ");
                    String customerName = scanner.next();
                    System.out.println("Bakiye: ");
                    Double balance = scanner.nextDouble();
                    break;

                case 2:
                    System.out.print("Hesap Numarası: ");
                    accountNumber = scanner.next();
                    System.out.print("İşlem Miktarı (Pozitif: Yatırma, Negatif: Çekme): ");
                    double amount = scanner.nextDouble();
                    bank.performTransaction(accountNumber, amount);
                    break;

                case 3:
                    System.out.print("Hesap Numarası: ");
                    accountNumber = scanner.next();
                    bank.displayAccountInfo(accountNumber);
                    break;

                case 4:
                    System.out.println("Sistemden çıkılıyor...");
                    scanner.close();
                    return;

                default:
                    System.out.println("Geçersiz seçim! Tekrar deneyin.");
            }
        }
    }

}
