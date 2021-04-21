import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.ArrayList;

//import ...

/**
 * A helper class for your gradebook
 * Some of these methods may be useful for your program
 * You can remove methods you do not need
 * If you do not wiish to use a Gradebook object, don't
 */
public class Gradebook implements Serializable {

  private static final long serialVersionUID = 1L;
  private ArrayList<Student> students;

  /* Read a Gradebook from a file */
  public Gradebook(String filename) {
    //create a gradebook object
    FileInputStream file;
    ObjectInputStream objStream;
    Gradebook gradebook = null;

    // Populate gradebook with deserialized file
    try {
      file = new FileInputStream(filename);
      objStream = new ObjectInputStream(file);
      gradebook = (Gradebook) objStream.readObject();
      objStream.close();
      file.close();
    } catch (Exception e) {
      System.out.println("I/O Exception");
      System.exit(255);
    }

    students = gradebook.getStudents();
  }

  public ArrayList<Student> getStudents() {
    return students;
  }

  /* student name requirment */
  /* firstname and lastname same regex */
  /* duplicate student error case */

  /* Create a new gradebook */
  public Gradebook() {
    students = new ArrayList<>();
  }

  /* return the size of the gradebook */
  public int size() {
    throw new UnsupportedOperationException();
  }

  /* Adds a student to the gradebook */
  public void addStudent(Student student) {
    students.add(student);
  }

  /* Adds an assinment to the gradebook */
  public void addAssignment(/*...*/) {

  }

  /* Adds a grade to the gradebook */
  public void addGrade(/*...*/) {

  }

  public String toString() {

    return "";
  }
}