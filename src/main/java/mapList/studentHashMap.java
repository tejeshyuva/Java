package mapList;

import java.util.HashMap;
public class studentHashMap {


    // Method to retrieve a Student object by first name from the HashMap
    public static Student getStudentByName(HashMap<String, Student> studentMap, String firstName) {
        return studentMap.get(firstName);
    }
}