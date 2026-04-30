import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import javafx.geometry.Pos;

public class GradeBarChart extends Application {

    // Method to create a single bar with label
    private VBox createBar(String name, int percentage, Color color) {
        double maxHeight = 200; // maximum bar height
        double barHeight = (percentage / 100.0) * maxHeight;

        Rectangle bar = new Rectangle(60, barHeight);
        bar.setFill(color);

        Label label = new Label(name + " — " + percentage + "%");

        VBox vbox = new VBox(5);
        vbox.setAlignment(Pos.BOTTOM_CENTER);
        vbox.getChildren().addAll(bar, label);

        return vbox;
    }

    @Override
    public void start(Stage stage) {

        HBox root = new HBox(20);
        root.setAlignment(Pos.BOTTOM_CENTER);

        // Create bars
        VBox projects = createBar("Projects", 20, Color.RED);
        VBox quizzes = createBar("Quizzes", 10, Color.BLUE);
        VBox midterm = createBar("Midterm Exams", 30, Color.GREEN);
        VBox finalExam = createBar("Final Exam", 40, Color.ORANGE);

        root.getChildren().addAll(projects, quizzes, midterm, finalExam);

        Scene scene = new Scene(root, 500, 300);

        stage.setTitle("Grade Distribution Bar Chart");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}