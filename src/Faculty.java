
public class Faculty extends Employee implements TaxCalculator {
	
	private String initial;
	private int monthlySalary;
	private int yearlyBonus;
	
	public Faculty(int id, String name, int age, String initial, int monthlySalary, int yearlyBonus) {
		super(id, name, age);
		try {
			
			if(yearlyBonus<0) {
				throw new IllegalArgumentException("Yearly bonus can't be negative");
			}
		}catch(IllegalArgumentException e){
			System.out.print(e);
		
		}
		this.initial=initial;
		this.monthlySalary=monthlySalary;
		this.yearlyBonus=yearlyBonus;
	}
	
	//Getters
	
	public String getInitial() {
		return initial;
	}
	public int getMonthlySalary() {
		return monthlySalary;
	}
	public int getYearlyBonus() {
		return yearlyBonus;
	}
	
	//Setters
	
	public void setInitial(String initial) {
		this.initial=initial;
	}
	public void setMonthlySalary(int monthlySalary) {
		this.monthlySalary=monthlySalary;
	}
	public void setYearlyBonus(int yearlyBonus) {
		this.yearlyBonus=yearlyBonus;
	}

	@Override
	public double yearlyIncomeTax() {
		double yearlyIncomeTax = yearlyIncome()*(TAX_PERCENT/100.0);
		try {
			if(yearlyIncomeTax<0)
				throw new ArithmeticException("yearlyIncomeTax can't be negative");
		}catch (ArithmeticException e) {
			System.out.println(e);
		}
		return yearlyIncomeTax;
	}

	@Override
	public double yearlyIncomeWithoutTax() {
		double yearlyIncomeWithoutTax= yearlyIncome()-yearlyIncomeTax();
		try {
			if(yearlyIncomeWithoutTax<0)
				throw new ArithmeticException("yearlyIncomeWithoutTax can't be negative");
		}catch (ArithmeticException e) {
			System.out.println(e);
		}
		return yearlyIncomeWithoutTax;
	}

	@Override
	public int yearlySalary() {
		int yearlySalary = monthlySalary*12;
		try {
			if(yearlySalary<monthlySalary)
				throw new ArithmeticException("yearlySalary can't be less than monthlySalary");
		}catch (ArithmeticException e) {
			System.out.println(e);
		}
		return yearlySalary;
	}

	@Override
	public int yearlyIncome() {
		int yearlyIncome= yearlySalary()+yearlyBonus;
		try {
			if(yearlyIncome<0)
				throw new ArithmeticException("yearlyIncome can't be negative");
		}catch (ArithmeticException e) {
			System.out.println(e);
		}
		return yearlyIncome;
	}
	
	@Override
	public String toString() {
		return "Faculty [initial="+initial+
				", monthlySalary="+monthlySalary+
				", yearlyBonus="+yearlyBonus+
				", yearlySalary="+yearlySalary()+
				", yearlyIncome="+yearlyIncome()+
				", yearlyIncomeTax="+yearlyIncomeTax()+
				", yearlyIncomeWithoutTax="+yearlyIncomeWithoutTax()+"]";
	}
	
}
