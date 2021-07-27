import java.io.Serializable;

public class FetchMoney extends Thread implements Serializable {

    private Account account; // account object;
    private int monery; // balance;

    public FetchMoney(){
        super();
    }

    public FetchMoney(int monery,Account account){
        this.account = account;
        this.monery = monery;
    }

    @Override
    public void run() {
        Int currMonery = account.search(); //current balance;
        synchronized (account) {
            try {
                Thread.sleep(5); //Time for withdrawal of payment;
            } catch (InterruptedException e) {

                e.printStackTrace();
            }

            int getMonery = account.getMonery(monery);
            System.out.println("Respected "+account.getName()+" User Hello!"+" The current balance is: "+currMonery +" pcs. "+" Take the balance as: "+getMonery+". The "+" account balance is: "+account.search()+"yuan");
        }
    }
}