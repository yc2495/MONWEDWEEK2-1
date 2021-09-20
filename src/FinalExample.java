import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class FinalExample {
    public static void main(String[] args) throws IOException{
        var filename = "student.txt";
        var studentFile = Paths.get(filename);
        var allStudents = Files.readString(studentFile);
        String [] separatedName = allStudents.split("\n");
        //now lets show the user
        System.out.println("Here are the students in your class:");
        for(var studentName: separatedName){
            System.out.println(studentName);
        }

    }

}
