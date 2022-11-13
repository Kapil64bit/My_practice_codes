package comparableAndComparator;

import org.jetbrains.annotations.NotNull;

public class students{
    int marks;
    String name;

    public students(int marks, String name) {
        this.marks = marks;
        this.name = name;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }




    @Override
    public String toString() {
        return marks + " " + name;
    }
}

