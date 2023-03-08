package StudentFile.Course;

public class Course {
    private String title;
    private String instructorName;
    private String days;
    private String duration;

    public Course(String title, String instructorName, String days, String duration) {
        this.title = title;
        this.instructorName = instructorName;
        this.days = days;
        this.duration = duration;
    }

    public void showCourseInformation() {
        System.out.printf("Course title: %s\nInstructor: %s\nDays: %s\nDuration: %s\n", this.title, this.instructorName, this.days, this.duration);
        System.out.println("-----------------------------\n");
    }
}