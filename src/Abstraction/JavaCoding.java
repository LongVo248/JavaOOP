package Abstraction;

public class JavaCoding extends  AbstractJob{
    public JavaCoding(){

    }

    @Override
    public void doJob() {
        System.out.println("Coding Java...");
    }

    @Override
    public String getJobName() {
        return "Coding Java";
    }
}
