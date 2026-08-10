import java.util.ArrayList;

public class ToDoList {
    public static void main(String[] args) {

        ArrayList<String> toDoList = new ArrayList<>();

        toDoList.add("Assignment Submission");
        toDoList.add("Push Code to GitHub");
        toDoList.add("Watch Video Lectures");

        toDoList.remove("Push Code to GitHub");

        StringBuffer sb = new StringBuffer();

        sb.append("To-Do List\n");
        sb.append("1.").append(toDoList.get(0)).append("\n");
        sb.append("2.").append(toDoList.get(1)).append("\n");

        System.out.println(sb);
    }
}