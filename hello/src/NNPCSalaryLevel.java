public class NNPCSalaryLevel extends SalaryLevel{

    private double bonus;

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public double calculateSalary()
    {
        double baseSalary=this.getSalary()*4;
        return baseSalary+bonus;
    }
}
