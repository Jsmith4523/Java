package StudentFile.Course;

public class Course {
    private String title;
    private String instructorName;
    private String days;
    private String duration;
    public double grade;

    public Course(String title, String instructorName, String days, String duration, double grade) {
        this.title          = title;
        this.instructorName = instructorName;
        this.days           = days;
        this.duration       = duration;
        this.grade          = grade;
    }

    public void showCourseInformation() {
        System.out.printf("Course title: \t%s\nInstructor: \t%s\nDays: \t\t%s\nDuration: \t%s\n", this.title, this.instructorName, this.days, this.duration);
        System.out.println("-----------------------------\n");
    }
}