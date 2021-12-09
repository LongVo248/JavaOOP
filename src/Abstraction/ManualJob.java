package Abstraction;

public abstract class ManualJob extends  AbstractJob{
    public ManualJob(){

    }

    @Override
    public String getJobName() {
        return "Manual Job";
    }
}
