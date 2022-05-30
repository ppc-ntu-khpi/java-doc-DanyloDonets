package domain;
/**
 * Клас, який описує художника
 * @author Danylo Donets
 * @version 1.0
 * @see Artist#artist
 */

public class Artist extends Employee {
	/**
    *
    * @param skiils – навички
    * @param name – і'мя
    * @param jobTitle – посада
    * @param level – рівень
    * @param dept – відділ
    */
    public Artist(String[] skiils, String name, String jobTitle, int level, String dept) {
        super(name, jobTitle, level, dept);
        this.skiils = skiils;
    }

    public Artist(String[] skiils) {
        super();
        this.skiils = skiils;
    }
    
    public Artist() {
        super();
        this.skiils = new String[10];
    }
    /**
     *Об'єкт класу {@linkplain artist}. Отримує навички художника
     * @return skiils
     */
    @Override
    public String toString() {
        return super.toString()+"\nSkills: "+getSkills();
    }
    /**
     * Містить навички художника
     */
    private String[] skiils;
    /**
     * Об'єкт класу {@linkplain artist}. Отримує навички художника
     * @return skiils
     */
    public String getSkills() {
        String s = "";
        for (String e : skiils) {
            s = s + e + ", ";
        }
       s=s.substring(0, s.length() - 2);
        return s;
    }
    /**
     *Об'єкт класу {@linkplain artist}. Надає навички художнику
     * @param skills 
     */
    public void setSkills(String[] skills) {
        this.skiils=skills;
    }
    /**
     * Об'єкт класу {@linkplain artist}. отримує всі навички художника
     * @return skiils – список всих навичок
     */
    public String[] getSkillsLSist() {
        return skiils;
    }
}
