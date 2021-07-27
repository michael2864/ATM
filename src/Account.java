public class Account {

    private String name;
    private int value;


    public void putMonery(int monery){
        this.value = this.value + monery;
    }

    public int getMonery(int monery){

        if(this.value > monery ){
            this.value = this.value - monery;
        }else{
            monery = this.value;
            this.value = 0;
        }

        return monery;
    }


    public int search(){
        return this.value;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getValue() {
        return value;
    }
    public void setValue(int value) {
        this.value = value;
    }
}