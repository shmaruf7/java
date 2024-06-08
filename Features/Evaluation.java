package Features;

public class Evaluation {
    private Attendence attendence;
    private mid midExam;
    private Final_exam finalExam;
    public int calculateTotal(){
        int totalMarks= this.attendence.getMarks()+this.midExam.calculateMarks()+this.finalExam.calculateMarks();
        return totalMarks;
    }
    public void printMarks(){
        int totalMarks=calculateTotal();
        System.out.println("Attendence"+attendence.getMarks()+"Mid: "+midExam.calculateMarks());
        System.out.println("final:" +finalExam.calculateMarks()+"total"+totalMarks);
        System.out.println("Mid time:"+midExam.calculateTime()+"final time:"+finalExam.calculateTime());
    }
}
