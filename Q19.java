public class Q19 {

    
    public static void processFile(String filename) throws Exception {
        if (filename == null || filename.isEmpty()) {
            throw new IllegalArgumentException("Filename cannot be null or empty");
        }
        
        if (filename.equals("notfound.txt")) {
            throw new java.io.FileNotFoundException("File not found: " + filename);
        }
        
        System.out.println("Processing file: " + filename);
    }

    public static void main(String[] args) {
        try {
            
            processFile("notfound.txt");
        } 
        
        catch (IllegalArgumentException e) {
            System.out.println("Caught IllegalArgumentException: " + e.getMessage());
        } 
        catch (java.io.FileNotFoundException e) {
            System.out.println("Caught FileNotFoundException: " + e.getMessage());
        } 
        
        catch (Exception e) {
            System.out.println("Caught generic exception: " + e.getMessage());
        } 
        
        finally {
            System.out.println("Finally block executed: Cleaning up resources.");
        }

        
        try {
            processFile(""); 
        } catch (Exception e) {
            System.out.println("Caught exception while processing empty filename: " + e.getMessage());
        }
    }

}
