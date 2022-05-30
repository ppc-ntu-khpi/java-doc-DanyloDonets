package domain;
/**
 * Клас, який описує редактора
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
     * Об'єкт класу {@linkplain editor}. Додає інформацію про редактора
     * @return s – інформація про редактора
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
     * <code>true</code> - якщо редактор надає перевагу роботі з папером 
     */
    private boolean electronicEditing;
    /**
     *Об'єкт класу {@linkplain editor}. отримує переваги паперу чи електроніки
     * @return electronicEditing – переваги редактора в роботі
     */
    public boolean getPreferences() {
        return electronicEditing;
    }
    /**
     * Об'єкт класу {@linkplain editor}. Gризначає переваги паперу чи електроніки
     * @param electronic – перевага паперу чи електроніки
     */
    public void setPreferences(boolean electronic) {
        this.electronicEditing=electronic;
    }
}
