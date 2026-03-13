class Course {
    String courseName;
    int duration;
    double fee;
    static String instituteName = " GLA university";
    Course(String c, int d, double f) {
        courseName = c;
        duration = d;
        fee = f;
    }
    void CourseDetails() {
        System.out.println(courseName + " " + duration + " " + fee + " " + instituteName);
    }
    static void updateInstituteName(String name) {
        instituteName = name;
    }
    public static void main(String[] args) {
        Course c1 = new Course("Java", 6, 10000);
        c1.CourseDetails();
        Course.updateInstituteName("IIT ");
        c1.CourseDetails();
    }
}
