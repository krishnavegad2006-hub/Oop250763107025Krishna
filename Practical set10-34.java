import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import javafx.stage.FileChooser;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

public class RegistrationForm extends Application {

    @Override
    public void start(Stage stage) {

        GridPane grid = new GridPane();
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setStyle("-fx-padding: 20;");

        // Fields
        TextField rollField = new TextField();
        TextField nameField = new TextField();
        TextField ageField = new TextField();
        TextField emailField = new TextField();

        Button submitBtn = new Button("Submit");

        // Add to grid
        grid.add(new Label("Roll No:"), 0, 0);
        grid.add(rollField, 1, 0);

        grid.add(new Label("Name:"), 0, 1);
        grid.add(nameField, 1, 1);

        grid.add(new Label("Age:"), 0, 2);
        grid.add(ageField, 1, 2);

        grid.add(new Label("Email:"), 0, 3);
        grid.add(emailField, 1, 3);

        grid.add(submitBtn, 1, 4);

        // Button action
        submitBtn.setOnAction(e -> {
            try {
                int rollNo = Integer.parseInt(rollField.getText());
                int age = Integer.parseInt(ageField.getText());
                String name = nameField.getText();
                String email = emailField.getText();

                // Email validation
                if (!email.contains("@") || !email.contains(".")) {
                    throw new Exception("Invalid email format!");
                }

                // File chooser to save data
                FileChooser fileChooser = new FileChooser();
                fileChooser.setTitle("Save Registration Data");
                File file = fileChooser.showSaveDialog(stage);

                if (file != null) {
                    BufferedWriter bw = new BufferedWriter(new FileWriter(file));
                    bw.write("Roll No: " + rollNo + "\n");
                    bw.write("Name: " + name + "\n");
                    bw.write("Age: " + age + "\n");
                    bw.write("Email: " + email + "\n");
                    bw.close();
                }

                // Success alert
                Alert success = new Alert(Alert.AlertType.INFORMATION);
                success.setTitle("Success");
                success.setHeaderText("Registration Successful");
                success.setContentText(
                        "Roll No: " + rollNo +
                        "\nName: " + name +
                        "\nAge: " + age +
                        "\nEmail: " + email
                );
                success.showAndWait();

            } catch (NumberFormatException ex) {
                showError("Roll No and Age must be integers.");
            } catch (Exception ex) {
                showError(ex.getMessage());
            }
        });

        Scene scene = new Scene(grid, 400, 250);
        stage.setTitle("Registration Form");
        stage.setScene(scene);
        stage.show();
    }

    // Method to show error alert
    void showError(String msg) {
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setTitle("Error");
        alert.setHeaderText("Validation Failed");
        alert.setContentText(msg);
        alert.showAndWait();
    }

    public static void main(String[] args) {
        launch();
    }
}