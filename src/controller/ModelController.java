package controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang3.StringUtils;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ListView;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.GridPane;


public class ModelController extends GridPane {
	
	ArrayList<String> activities= new ArrayList<>();
	ArrayList<String> dataCode= new ArrayList<>();
	ArrayList<String> dataBindingsCode= new ArrayList<>();
	ArrayList<String> constraintsCode= new ArrayList<>();
	


	@FXML
	private ListView<String> activitiesView = new ListView<>();
	
	@FXML
	private ListView<String> dataCodeView = new ListView<>();
	
	@FXML
	private ListView<String> dataBindingsCodeView = new ListView<>();
	
	@FXML
	private ListView<String> constraintsCodeView = new ListView<>();
	
	private String modelText;
	
	public ModelController(String modelText) {
		this.modelText = modelText;
		FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/view/ModelView.fxml"));
		if (!modelText.equals("")) {
			String[] splitModel = modelText.replace("\r\n", "\n").split("\n");
			inputSort(splitModel);
		}
        fxmlLoader.setRoot(this);
        fxmlLoader.setController(this);
        try {
            fxmlLoader.load();
        } catch (IOException exception) {
            throw new RuntimeException(exception);
        }
	}
	
	
    public boolean isActivity(String line) {
        return line.startsWith("activity ");
    }
    public String getModelText() {
		return modelText;
	}


	public void setModelText(String modelText) {
		this.modelText = modelText;
	}


	public boolean isDataBinding(String line) {
        return line.startsWith("bind ");
    }
    public boolean isConstraint(String line) {
        return line.contains("[");
    }
    public boolean isData(String line) {
        return (StringUtils.countMatches(line, ':') % 2 == 1) && !isDataBinding(line);
    }
    private void inputSort(String[] st) {
        int line = 0;
        for (String i : st) {
            ++line;

            if (i.isEmpty() || i.startsWith("/"))
                continue;

            if (isActivity(i))
            	activities.add(i);

            if (isData(i))
                dataCode.add(i);

            if (isDataBinding(i))
                dataBindingsCode.add(i);

            if (isConstraint(i))
                constraintsCode.add(i);
        }
    }
    @FXML
	public void initialize() {
        activitiesView.setItems(FXCollections.observableList(activities));
        constraintsCodeView.setItems(FXCollections.observableList(constraintsCode));
        dataBindingsCodeView.setItems(FXCollections.observableList(dataBindingsCode));
        dataCodeView.setItems(FXCollections.observableList(dataCode));
    }
}
