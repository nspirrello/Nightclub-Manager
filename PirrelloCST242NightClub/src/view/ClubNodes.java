package view;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.Background;
import javafx.scene.layout.Border;
import javafx.scene.layout.BorderStroke;
import javafx.scene.layout.BorderStrokeStyle;
import javafx.scene.layout.BorderWidths;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;

public class ClubNodes {
	private HBox paneNode;
	private Label workPls;
	private Button unfollow;
	public ClubNodes(String text, VBox vbox){
		workPls = new Label(text);
		unfollow = new Button("Unfollow");
		//make it change when you hover from following to unfollow
		unfollow.setAlignment(Pos.BASELINE_RIGHT);
		unfollow.setOnAction(event -> {
			//event sent to controller for user to unsubscribe from the nightclubs notify list
		});
		
		
		
		paneNode = new HBox(15);
		paneNode.setAlignment(Pos.CENTER);
		paneNode.setBorder(new Border(new BorderStroke(Color.BLACK, BorderStrokeStyle.SOLID,CornerRadii.EMPTY,BorderWidths.DEFAULT)));
		paneNode.setPrefSize(298, 50);
		paneNode.getChildren().addAll(workPls, unfollow);
		vbox.getChildren().addAll(paneNode);
	}
	public String toString(){
		return "Text " + workPls.getText(); 
	}
	
}