package application;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class InventoryManagementSystem extends Application {

    private TableView<Item> table;
    private TextField nameInput, quantityInput, priceInput;
    private ObservableList<Item> items;

    public static void main(String[] args) {
        launch(args);
    }

    
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Inventory Management System");

       
        TableColumn<Item, String> nameColumn = new TableColumn<>("Name");
        nameColumn.setMinWidth(200);
        nameColumn.setCellValueFactory(cellData -> cellData.getValue().nameProperty());

        
        TableColumn<Item, Integer> quantityColumn = new TableColumn<>("Quantity");
        quantityColumn.setMinWidth(100);
        quantityColumn.setCellValueFactory(cellData -> cellData.getValue().quantityProperty().asObject());

        
        TableColumn<Item, Double> priceColumn = new TableColumn<>("Price");
        priceColumn.setMinWidth(100);
        priceColumn.setCellValueFactory(cellData -> cellData.getValue().priceProperty().asObject());

      
        nameInput = new TextField();
        nameInput.setPromptText("Name");
        nameInput.setMinWidth(100);

        quantityInput = new TextField();
        quantityInput.setPromptText("Quantity");

        priceInput = new TextField();
        priceInput.setPromptText("Price");

        // Buttons
        Button addButton = new Button("Add");
        addButton.setOnAction(e -> addItem());

        Button updateButton = new Button("Update");
        updateButton.setOnAction(e -> updateItem());

        Button deleteButton = new Button("Delete");
        deleteButton.setOnAction(e -> deleteItem());

        Button clearButton = new Button("Clear");
        clearButton.setOnAction(e -> clearFields());

        HBox hBox = new HBox();
        hBox.setPadding(new Insets(10, 10, 10, 10));
        hBox.setSpacing(10);
        hBox.getChildren().addAll(nameInput, quantityInput, priceInput, addButton, updateButton, deleteButton, clearButton);

        table = new TableView<>();
        items = FXCollections.observableArrayList();
        table.setItems(items);
        table.getColumns().addAll(nameColumn, quantityColumn, priceColumn);

        VBox vBox = new VBox();
        vBox.getChildren().addAll(table, hBox);

        Scene scene = new Scene(vBox);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private void addItem() {
        Item item = new Item(nameInput.getText(), Integer.parseInt(quantityInput.getText()), Double.parseDouble(priceInput.getText()));
        items.add(item);
        clearFields();
    }

    private void updateItem() {
        Item selectedItem = table.getSelectionModel().getSelectedItem();
        if (selectedItem != null) {
            selectedItem.setName(nameInput.getText());
            selectedItem.setQuantity(Integer.parseInt(quantityInput.getText()));
            selectedItem.setPrice(Double.parseDouble(priceInput.getText()));
            table.refresh();
        }
    }

    private void deleteItem() {
        ObservableList<Item> selectedItems = table.getSelectionModel().getSelectedItems();
        items.removeAll(selectedItems);
    }

    private void clearFields() {
        nameInput.clear();
        quantityInput.clear();
        priceInput.clear();
    }
}

