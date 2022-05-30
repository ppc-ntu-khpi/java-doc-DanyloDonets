package domain;
/**
 * ����, ���� ����� ���������
 * @author Danylo Donets
 * @version 1.0
 * @see Editor#editor
 */
public class Editor extends Artist {

    public Editor(boolean electronicEditing, String[] skiils, String name, String jobTitle, int level, String dept) {
        super(skiils, name, jobTitle, level, dept);
        this.electronicEditing = electronicEditing;
    }

    public Editor(boolean electronicEditing, String[] skiils) {
        super(skiils);
        this.electronicEditing = electronicEditing;
    }

    public Editor(boolean electronicEditing) {
        super();
        this.electronicEditing = electronicEditing;
    }
    
    public Editor() {
        super();
        this.electronicEditing = true;
    }
    /**
     * ��'��� ����� {@linkplain editor}. ���� ���������� ��� ���������
     * @return s � ���������� ��� ���������
     */
    @Override
    public String toString() {
        String s=super.toString()+"\nEditing preferences= "; 
        if (electronicEditing)
            s=s+"electronic";
        else
            s=s+"paper";
        return s;
            
    }
    /**
     * <code>true</code> - ���� �������� ���� �������� ����� � ������� 
     */
    private boolean electronicEditing;
    /**
     *��'��� ����� {@linkplain editor}. ������ �������� ������ �� ����������
     * @return electronicEditing � �������� ��������� � �����
     */
    public boolean getPreferences() {
        return electronicEditing;
    }
    /**
     * ��'��� ����� {@linkplain editor}. G������� �������� ������ �� ����������
     * @param electronic � �������� ������ �� ����������
     */
    public void setPreferences(boolean electronic) {
        this.electronicEditing=electronic;
    }
}
