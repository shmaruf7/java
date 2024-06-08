package Features;

public class Final_exam implements Exam {

    @Override
    public int calculateMarks() {
        return 45;
    }

    @Override
    public String calculateTime() {
        return "2 hour and 30min";
    }
    
}
