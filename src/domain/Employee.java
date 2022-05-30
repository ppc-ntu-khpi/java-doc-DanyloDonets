package domain;
/**
 * Ѕазовий клас, €кий описуЇ сп≥вроб≥тник≥в компан≥њ
 *  @author Danylo Donets
 * @version 1.0
 * @see Employee#employee
 */
public class Employee {
	/**
     *ќб'Їкт класу {@linkplain employee}. ¬ив≥д ≥нформац≥њ про сп≥вроб≥тника
     * @return р€док з детальною ≥нформац≥Їю
     */
    @Override
    public String toString() {
        return "\nEmployee ID= " + ID + "\nName= " + name + "\nJobTitle= " + jobTitle + "\nLevel= " + level + "\nDept= " + dept;
    }
    /**
     * @param name Ц ≥м'€ сп≥вроб≥тника
     * @param jobTitle Ц посада, €ку в≥н займаЇ
     * @param ID Ц ID сп≥вроб≥тника
     * @param level Ц р≥вень
     * @param dept Ц вв≥д≥л, в €кому в≥н працюЇ
     */
    private String name;
    private String jobTitle;
    private int ID;
    private int level;
    private String dept;

   // private static int employeesCount = 0;
    /**
     * ќб'Їкт класу {@linkplain employee}.Ќайфункц≥ональн≥ший конструктор класу
     * @param name Ц ≥м'€ сп≥вроб≥тника
     * @param jobTitle Ц посада, €ку в≥н займаЇ
     * @param level Ц р≥вень
     * @param dept Ц вв≥д≥л, в €кому в≥н працюЇ
     */
    public Employee(String name, String jobTitle, int level, String dept) {
        this();
        setName(name);
        this.jobTitle = jobTitle;
        switch (level) {
            case 1:
            case 2:
            case 3:
                this.level = level;
                break;
            default:
                this.level = 1;
        }
        this.dept = dept;
    }
    /**
     * ќб'Їкт класу {@linkplain employee}. онструктор за замовчуванн€м
     * @deprecated
     */
    public Employee() {
        ID = (int)(Math.random()*1000);
//        if (ID > 10000) {
//            throw new NumberFormatException("ERROR! Employee's ID cannot be greater than 10000. Employee is not created!");
//        }
    }
    /**
     *ќб'Їкт класу {@linkplain employee}. ѕризначенн€ посади
     * @param job посада сп≥вроб≥тника
     */
    public void setJobTitle(String job) {
        jobTitle = job;
    }
    /**
     * ќб'Їкт класу {@linkplain employee}.ќтриманн€ посади
     * @return jobTitle Ц посада сп≥вроб≥тника
     */
    public String getJobTitle() {
        return jobTitle;
    }
    /**
     *ќб'Їкт класу {@linkplain employee}. ќтриманн€ ≥мен≥ сп≥вроб≥тника
     * @return name Ц ≥м'€ сп≥вроб≥тника
     */
    public String getName() {
        return name;
    }
    /**
     * ќб'Їкт класу {@linkplain employee}.ќтриманн€ р≥вн€
     * @param level Ц  р≥вень
     */
    public void setLevel(int level) {
        switch (level) {
            case 1:
            case 2:
            case 3:
                this.level = level;
                break;
            default:
                this.level = 1;
        }
    }
    /**
     * ќб'Їкт класу {@linkplain employee}.ќтриманн€ розр€ду чи категор≥њ
     * @return level Ц р≥вень
     */
    public int getLevel() {
        return level;
    }
    /**
     * ќб'Їкт класу {@linkplain employee}.ќтриманн€ вв≥д≥ла
     * @return dept Ц вв≥д≥л, в €кому працюЇ сп≥вроб≥тник
     */
    public String getDept() {
        return dept;
    }
    /**
     *	ќб'Їкт класу {@linkplain employee}.ѕризначенн€ вв≥д≥ла
     * @param dept Ц вв≥д≥л, в €кому працюЇ сп≥вроб≥тник
     */
    public void setDept(String dept) {
        this.dept = dept;
    }
    /**
     *  ќб'Їкт класу {@linkplain employee}.¬идача ≥мен≥
     * @param name Ц ≥м'€ сп≥вроб≥тника
     */
    public void setName(String name) {
//        boolean correctName = true;
//        for (int i = 0; i < name.length(); i++) {
//            char s = name.charAt(i);
//            if (Character.isDigit(s)) {
//                correctName = false;
//            }
//        }
//        if (correctName) {
//            this.name = name;
//        } else {
//            this.name = "John Doe";
//        }
        if (name.matches("^([a-zA-Z]+[\\'\\,\\.\\-]?[a-zA-Z ]*)+[ ]([a-zA-Z]+[\\'\\,\\.\\-]?[a-zA-Z ]+)+$")) {
            this.name = name;
        } else {
            this.name = "John Doe";
        }
    }
}
