
import java.io.Serializable;

public class SaveMoney extends Thread implements Serializable {


    private Account account;
    private int money;

    public SaveMoney(){
        super();
    }

    public SaveMoney(int money,Account account){
        this.account = account;
        this.money = money;
    }

    @Override
    public void run() {

        Int currMonery = account.search();


        synchronized (account) {
            try {
                Thread.sleep(5);
            } catch (InterruptedException e) {

                e.printStackTrace();
            }
            account.putMonery(this.money);

            System.out.println("Dear "+account.getName()+" User Hello!"+" The current balance is: "+currMonery +" pcs. "+" deposit balance: "+this.money+ "Yuan." + "Account balance is: "+account.search()+" ");
        }
    }
}