
import java.io.Serializable;
public class Main {
    public static void main(String[] args) {
/*        Написать мини приложение банкомат, которое работает в нескольких потоках, каждый поток может класть и снимать определенную сумму сумму из банкомата,
        каждая транзакция должна выводиться на экран в формате: поток - снятие/пополнение - сумма*/


                Account account = new Account();
                account.setName("gdshdsnfd");

                account.setValue(0);


                new SaveMoney(100,account).start();


                new SaveMoney(200, account).start();

                new FetchMoney(500, account).start();
            }


}
