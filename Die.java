public class Die{

    public Die(){

    }
    public int roll(){
        return (((int)(Math.random()*6) + 1)+((int)(Math.random()*6) + 1));
    }
}