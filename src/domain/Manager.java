package domain;
/**
 * Клас, який описує менеджера
 *  @author Danylo Donets
 * @version 1.0
 * @see Manager#manager
 */
public class Manager extends Employee {

    public Manager(Employee[] employees, String name, String jobTitle, int level, String dept) {
        super(name, jobTitle, level, dept);
        this.employees = employees;
    }

    @Override
    public String toString() {
        return super.toString()+"\nEmployees: "+getEmployees(); 
    }

    public Manager(Employee[] employees) {
        super();
        this.employees = employees;
    }
    
    public Manager() {
        super();
        employees = new Employee[10];
    }
    /**
     *@param Employee – список ким керує менеджер
     */
    private Employee[] employees;
    /**
     *Об'єкт класу {@linkplain manager}. Отримання підлеглих менеджера
     * @return s –  підлеглі менеджера
     */
    public String getEmployees() {
        String s = "";
        for (Employee e : employees) {
            s = s + e.getName() + ", ";
        }
        s=s.substring(0, s.length() - 2);
        return s;
    }
    /**
     * Об'єкт класу {@linkplain manager}. призначення піглеглих менеджеру
     * @param employees – підлеглі менеджера
     */
    public void setEmployees(Employee[] employees) {
        this.employees=employees;
    }
    /**
     * Об'єкт класу {@linkplain manager}. Отримання піглеглих менеджеру
     * @return employees – підлеглі менеджера
     */
    public Employee[] getEmployeesList() {
        return employees;
    }

    
}
