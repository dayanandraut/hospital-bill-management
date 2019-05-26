package controller;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.stream.IntStream;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import model.Patient;

public class PatientDetailsController {
	
	@FXML
	private TextField txtName;
	
	@FXML
	private TextField txtRef;
	
	@FXML
	private ComboBox<Integer> cmbAge;
	
	@FXML
	private RadioButton radioMale;
	
	@FXML
	private RadioButton radioFemale;
	
	@FXML
	private TextArea txtAddress;
	
	@FXML
	private Label lblCurrentDate;
	
	final ToggleGroup sex = new ToggleGroup();
	
	// initializing the form
	@FXML
    public void initialize() {
        System.out.println("Initializing");
        this.populateAge();
        this.populateCurrentDate();
        this.populateSex();
        //cmbAge.setV
    }
	
	public void onSave() {
		System.out.println("Get Set Ready"+ txtName.getText());
		this.extractFormData();
	}
	
	// populating age from 0 to 130 in age combo box
	private void populateAge() {
		Integer[] ag = new Integer[130];
		for(int i=0; i<130;i++) ag[i] = i;
		ObservableList<Integer> ages = FXCollections.observableArrayList(ag);
		this.cmbAge.setItems(ages);
		this.cmbAge.setValue(10);
	}
	
	// extracting the current date 
	private void populateCurrentDate() {
		LocalDateTime dateTime = LocalDateTime.now(); // gets the current date and time  
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy"); 
		this.lblCurrentDate.setText(dateTime.format(formatter));
	}
	
	// making sure either male or female is selected
	private void populateSex() {
		
		this.radioMale.setToggleGroup(this.sex);
		this.radioMale.setSelected(true);		
		this.radioFemale.setToggleGroup(this.sex);
	}
	
	private Patient extractFormData() {
		Patient patient = new Patient(this.txtName.getText(), this.cmbAge.getValue(), ((RadioButton)this.sex.getSelectedToggle()).getText(), this.txtAddress.getText());
		System.out.println(patient);
		return patient;
	}
}
