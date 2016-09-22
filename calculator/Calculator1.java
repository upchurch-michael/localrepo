

public class Calculator1
{
    private double register;
    
    public Calculator1()
    {
        register = 0;
    }
    public void add(double n)
    {
        register = register + n;
    }
    public double getRegister()
    {
        return register;
    }
    public void setRegister(double n)
    {
        register = n;
    }
    public void clearRegister()
    {
        register = 0;
    }
}
