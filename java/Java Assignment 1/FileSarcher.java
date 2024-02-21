import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FileSarcher {
//    All the matching file path will store here
    private static List<String> matchingFilePaths = new ArrayList<>();
//    Function for finding absolute path which file name matches the pattern
    public static void findAbsolutePath(File[] files, Pattern pattern) {
        // iterating over the file
        for (File file : files) {
//            when directory is present inside directory then recursive call occur for subdirectory
            if (!file.isHidden() && file.isDirectory()) {
                // list down file of subdirectory
                File[] subFiles = file.listFiles();
                if (subFiles != null) {
                    findAbsolutePath(subFiles, pattern);
                }
            } else {
//                if it is file not subdirectory then with the help of Matcher class
//                match file name with pattern and if it matches store it inside matchingFilePaths list
                Matcher matcher = pattern.matcher(file.getName());
                if (matcher.matches()) {
                    matchingFilePaths.add(file.getAbsolutePath());
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter a regular expression to search for in file names: ");
        String regex = in.nextLine();
        try {
            // Compile the regular expression into a Pattern object
            Pattern pattern = Pattern.compile(regex);
            // Create a File object representing the user's home directory
            File homeDir = new File(System.getProperty("user.home"));
            // all the homeDir path listed down in files array
            File[] files = homeDir.listFiles();
            if (files != null) {
                findAbsolutePath(files, pattern);
                // If matchingFilePaths list is not empty list down all the path
                if(!matchingFilePaths.isEmpty()){
                    System.out.println("Matching files:");
                    for (String path : matchingFilePaths) {
                        System.out.println(path);
                    }
                }else{
                    System.out.println("No result found.");
                }
            } else {
                System.out.println("No result found.");
            }
        } catch (Exception e) {
            System.out.println("Invalid regular expression. Please try again.");
        } finally {
            in.close();
        }
    }
}
