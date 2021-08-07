/*
 * 
 * 
 */
package projectreflectapi;



import java.io.IOException;
import java.util.*;
import java.io.File;
import java.net.URL;



public class ProjectReflectAPI {

    /**
     * @param args the command line arguments
     */
    
    private static final  String[] packageClass = {"TourApp",
        "Tourist", "TourPackage", "TourAgent", "Booking", "BookinUtil", "Citytour",
        "SightSeeingTour", "AudioLanguage"
    };
    
    
    
    public static void main(String[] args) throws ClassNotFoundException, IOException {
        // TODO code application logic here
        System.out.println("\nNumber of expected classes in Backend package: " + packageClass.length);
        for (String expectedClass : packageClass) {
            System.out.println("Name of Class: \n\t " + expectedClass);
        }
        
        String classes = Arrays.toString(getClasses("backend"));
        
        String[] strSplit = classes.split(" ");
        ArrayList<String> strList = new ArrayList<String>(
            Arrays.asList(strSplit));
         System.out.println("\nActual number of classes in Backend package: ");
        for (String s : strList)
            System.out.println("Name of Class: \n\t" + s);
       
        //System.out.println("Name of Class: \n\t " +  classes.substring(1, classes.length() -1));
        
        

        
    }
    
    
    private static Class[] getClasses(String packageName) throws ClassNotFoundException, IOException {
    
    ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
    assert classLoader != null;
    String path = packageName.replace('.', '/');
    Enumeration<URL> resources = classLoader.getResources(path);
    List<File> dirs = new ArrayList<File>();
    while (resources.hasMoreElements()) {
        URL resource = resources.nextElement();
        dirs.add(new File(resource.getFile()));
    }
    ArrayList<Class> classes = new ArrayList<Class>();
    for (File directory : dirs) {
        classes.addAll(findClasses(directory, packageName));
    }
    return classes.toArray(new Class[classes.size()]);
}
         
   private static List<Class> findClasses(File directory, String packageName) throws ClassNotFoundException {
    List<Class> classes = new ArrayList<Class>();
    if (!directory.exists()) {
        return classes;
    }
    File[] files = directory.listFiles();
    for (File file : files) {
        if (file.isDirectory()) {
            assert !file.getName().contains(".");
            classes.addAll(findClasses(file, packageName + "." + file.getName()));
         

        } else if (file.getName().endsWith(".class")) {
            classes.add(Class.forName(packageName + '.' + file.getName().substring(0, file.getName().length() - 6)));
               

        }
        
    }
    return classes;
}      
         
    
}
