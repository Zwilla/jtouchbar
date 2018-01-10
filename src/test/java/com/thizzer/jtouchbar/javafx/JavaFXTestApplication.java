package com.thizzer.jtouchbar.javafx;

import static org.junit.Assert.assertNotNull;

import com.thizzer.jtouchbar.JTouchBar;
import com.thizzer.jtouchbar.JTouchBarTestUtils;

import javafx.application.*;
import javafx.stage.*;

import javafx.scene.*;
import javafx.scene.layout.*;

@SuppressWarnings("restriction")
public class JavaFXTestApplication extends Application {
			
	@Override
	public void start(Stage primaryStage) throws Exception {
		JTouchBar jTouchBar = JTouchBarTestUtils.constructTouchBar();
		assertNotNull(jTouchBar);
				
		primaryStage.setTitle("JavaFX JTouchBar Test");
        
        StackPane root = new StackPane();
        primaryStage.setScene(new Scene(root, 300, 250));
        primaryStage.show();
        
        jTouchBar.show(primaryStage);
	}
}
