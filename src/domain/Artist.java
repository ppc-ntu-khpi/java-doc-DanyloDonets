package domain;
/**
 * ����, ���� ����� ���������
 * @author Danylo Donets
 * @version 1.0
 * @see Artist#artist
 */

public class Artist extends Employee {
	/**
    *
    * @param skiils � �������
    * @param name � �'��
    * @param jobTitle � ������
    * @param level � �����
    * @param dept � ����
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
     *��'��� ����� {@linkplain artist}. ������ ������� ���������
     * @return skiils
     */
    @Override
    public String toString() {
        return super.toString()+"\nSkills: "+getSkills();
    }
    /**
     * ̳����� ������� ���������
     */
    private String[] skiils;
    /**
     * ��'��� ����� {@linkplain artist}. ������ ������� ���������
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
     *��'��� ����� {@linkplain artist}. ���� ������� ���������
     * @param skills 
     */
    public void setSkills(String[] skills) {
        this.skiils=skills;
    }
    /**
     * ��'��� ����� {@linkplain artist}. ������ �� ������� ���������
     * @return skiils � ������ ���� �������
     */
    public String[] getSkillsLSist() {
        return skiils;
    }
}
