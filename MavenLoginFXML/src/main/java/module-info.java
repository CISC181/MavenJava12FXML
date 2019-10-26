module MavenLoginFXML {
	
	//	This is a royal pain in the ass.  
	//	Java 1.9+ requires you to export namespaces
	exports org.openjfx.hellofx;

	//	You have to tell java what assemblies are required
	requires javafx.base;
	requires javafx.controls;
	requires javafx.graphics;
	requires javafx.fxml;
	
	//	
	opens org.openjfx.hellofx to javafx.fxml;
	
}