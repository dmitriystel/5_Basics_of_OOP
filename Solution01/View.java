package by.introduction.fifth.OOP1.main;

public class View {

	public static void printDirectory(Directory directory) {
		System.out.println("Directory's name: " + directory.getName());
		System.out.println("The list of inner directories: " );
		for (Directory innerDirectory : directory.getDirectoryList()) {
			System.out.println(innerDirectory.getName() + ", ");
		}
		
	System.out.println("\nThe list of inner list");
	
	for (File innerFile : directory.getFileList()) {
		System.out.println(innerFile.getName() + ", ");
		}
	}
}