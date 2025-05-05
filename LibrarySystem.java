
class LibraryItem {

    protected String title;
    protected String author;
    protected int publicationYear;


    public LibraryItem(String title, String author, int publicationYear) {
        this.title = title;
        this.author = author;
        this.publicationYear = publicationYear;
    }

    public void displayInfo() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Publication Year: " + publicationYear);
    }
}

class Book extends LibraryItem {
    
    private String ISBN;
    private int numberOfPages;


    public Book(String title, String author, int publicationYear, String ISBN, int numberOfPages) {
        super(title, author, publicationYear);
        this.ISBN = ISBN;
        this.numberOfPages = numberOfPages;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();  // Call base class method
        System.out.println("ISBN: " + ISBN);
        System.out.println("Number of Pages: " + numberOfPages);
    }
}

class Magazine extends LibraryItem {

    private int issueNumber;
    private String month;
    private String editor;


    public Magazine(String title, String author, int publicationYear, int issueNumber, String month, String editor) {
        super(title, author, publicationYear);
        this.issueNumber = issueNumber;
        this.month = month;
        this.editor = editor;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();  
        System.out.println("Issue Number: " + issueNumber);
        System.out.println("Month: " + month);
        System.out.println("Editor: " + editor);
    }
}


class ReferenceBook extends Book {
    private String fieldOfStudy;
    private boolean isLendable;


    public ReferenceBook(String title, String author, int publicationYear, String ISBN, int numberOfPages, String fieldOfStudy, boolean isLendable) {
        super(title, author, publicationYear, ISBN, numberOfPages);
        this.fieldOfStudy = fieldOfStudy;
        this.isLendable = isLendable;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();  
        System.out.println("Field of Study: " + fieldOfStudy);
        System.out.println("Lendable: " + (isLendable ? "Yes" : "No"));
    }
}

public class LibrarySystem {
    public static void main(String[] args) {
        
        LibraryItem book = new Book("Effective Java", "Joshua Bloch", 2008, "978-0134685991", 416);
        LibraryItem magazine = new Magazine("National Geographic", "Various Authors", 2025, 12, "April", "Susan Goldberg");
        LibraryItem referenceBook = new ReferenceBook("Encyclopedia of Science", "John Doe", 2020, "123-456-789", 1200, "Science", false);

       
        System.out.println("Displaying Book Information:");
        book.displayInfo();  

        System.out.println("\nDisplaying Magazine Information:");
        magazine.displayInfo();  

        System.out.println("\nDisplaying Reference Book Information:");
        referenceBook.displayInfo();  
    }
}




/* 















class Course {
    
    protected String courseID;
    protected String courseTitle;
    protected int creditHours;

   
    public Course(String courseID, String courseTitle, int creditHours) {
        this.courseID = courseID;
        this.courseTitle = courseTitle;
        this.creditHours = creditHours;
    }

    
    public void showCourseDetails() {
        System.out.println("Course ID: " + courseID);
        System.out.println("Course Title: " + courseTitle);
        System.out.println("Credit Hours: " + creditHours);
    }
}


class OnlineCourse extends Course {
    
    private String platformName;
    private String instructor;
    private int durationWeeks;


    public OnlineCourse(String courseID, String courseTitle, int creditHours, String platformName, String instructor, int durationWeeks) {
        super(courseID, courseTitle, creditHours);
        this.platformName = platformName;
        this.instructor = instructor;
        this.durationWeeks = durationWeeks;
    }

    @Override
    public void showCourseDetails() {
        super.showCourseDetails(); 
        System.out.println("Platform Name: " + platformName);
        System.out.println("Instructor: " + instructor);
        System.out.println("Duration (Weeks): " + durationWeeks);
    }
}

class OnsiteCourse extends Course {
    
    private String location;
    private String classroomNumber;
    private String instructor;

    
    public OnsiteCourse(String courseID, String courseTitle, int creditHours, String location, String classroomNumber, String instructor) {
        super(courseID, courseTitle, creditHours);
        this.location = location;
        this.classroomNumber = classroomNumber;
        this.instructor = instructor;
    }

    @Override
    public void showCourseDetails() {
        super.showCourseDetails();
        System.out.println("Location: " + location);
        System.out.println("Classroom Number: " + classroomNumber);
        System.out.println("Instructor: " + instructor);
    }
}


class Feedback {
    
    public void submitFeedback(String comments) {
        System.out.println("Feedback (General): " + comments);
    }

    
    public void submitFeedback(int rating) {
        System.out.println("Feedback (Rating): " + rating + "/5");
    }

    
    public void submitFeedback(String comments, int rating) {
        System.out.println("Feedback (Detailed): " + comments + " | Rating: " + rating + "/5");
    }
}

public class OnlineCourseManagementSystem {
    public static void main(String[] args) {
        
        Course onlineCourse = new OnlineCourse("CS101", "Introduction to Computer Science", 4, "Udemy", "Dr. Smith", 12);
        Course onsiteCourse = new OnsiteCourse("MATH101", "Calculus I", 3, "Room 204, Building A", "A204", "Prof. Johnson");

        
        System.out.println("Online Course Details:");
        onlineCourse.showCourseDetails();  

        System.out.println("\nOnsite Course Details:");
        onsiteCourse.showCourseDetails();  

        
        Feedback feedback = new Feedback();

       
        System.out.println("\nSubmitting General Feedback:");
        feedback.submitFeedback("Great course, very informative!");

        System.out.println("\nSubmitting Rating Feedback:");
        feedback.submitFeedback(4);  

        System.out.println("\nSubmitting Detailed Feedback:");
        feedback.submitFeedback("Excellent course materials and clear explanations.", 5);
    }
}

*/