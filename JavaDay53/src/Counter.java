public class Counter {
    private int value;

    public Counter (int startValue ){
        this.value = value;
    }
    public Counter(){
        this.value = 0;
    }
    public int Value(){
        return value;
    }
    public void  Increase(){
            value +=1;
    }
    public void Decrerase(){
        value -= 1;
    }
    public void increaseBy(int increaseBy){
        if (increaseBy > 0){
            value += increaseBy;
        } else{
            return;
        }
    }
    public void decreaseBy(int decreaseBy){
        if(decreaseBy > 0){
            value -= decreaseBy;
        }else{
            return;
        }
    }
        @Override
        public String toString() {
            return "Counter: " + value;
    }
}

