package sample;

import javafx.fxml.Initializable;

import java.net.URL;
import java.util.ResourceBundle;

public class MainFormController implements Initializable {

	private LoginForm login = new LoginForm();

	public void initialize(URL location, ResourceBundle resources) {
		System.out.println("inicjalizacja");
		/*updateListView();
		usernameLabel.setText(AuthenticationManager.user.getUsername());
		countNoteContentCharacters();
		countNoteTitleCharacters();
		stars.setBottom( rating );
		//stars.setBottom(ViewUtils.createStars());
		availableTagsListView.setItems(tagManager.getTagList());*/
	}
	
/*	@Override
	public void initialize(URL location, ResourceBundle resources) {
		updateListView();
		usernameLabel.setText(AuthenticationManager.user.getUsername());
		countNoteContentCharacters();
		countNoteTitleCharacters();
		stars.setBottom( rating );
		//stars.setBottom(ViewUtils.createStars());
		availableTagsListView.setItems(tagManager.getTagList());
	}
	
	public void countNoteContentCharacters() {
		
		currentNoteTextArea.textProperty().addListener(
				(observable, oldValue, newValue) -> {
					if (newValue.length() <= 5000) {
						noteContentCharactersNumber = newValue.length();
						contentCharactersLabel.setText(noteContentCharactersNumber.toString());
					} else {
						currentNoteTextArea.setText(oldValue);
					}
				}
		);
	}
	
	public void countNoteTitleCharacters() {
		
		titleTextField.textProperty().addListener(
				(observable, oldValue, newValue) -> {
					if (newValue.length() <= 80) {
						noteTitleCharactersNumber = newValue.length();
						titleCharactersLabel.setText(noteTitleCharactersNumber.toString());
					} else {
						titleTextField.setText(oldValue);
					}
				}
		);
	}
	
	public void logout(ActionEvent event) {
		try {
			((Node)event.getSource()).getScene().getWindow().hide();
			login.start(new Stage());
		} catch(Exception e) {
			System.out.println("loadMainForm exception: " + e.getMessage());
		}
	}

	public void saveNote(ActionEvent event) {
		
		if ( titleTextField.getText().isEmpty()) {
			
			ViewUtils.showNotification("Error", "Title can not be empty!", Notification.ERROR_ICON, event);
			return;
		}
		
		if (noteManager.addNoteToDatabase(titleTextField.getText(), 
										currentNoteTextArea.getText(), 
										favouriteCheckBox.isSelected(),
										rating.ratingProperty().get() ) == NoteResult.SUCCESS ) {
			ViewUtils.showInformationAlert("Information", "Note has been saved!");
			System.out.println("Note added.");
		} else {
			ViewUtils.showErrorAlert("Error", "Note has not been added to database!");
			System.out.println("Note not added!");

		}
		updateListView();
	}
	
	public void deleteNote(ActionEvent event) {
		noteManager.deleteNote();
		updateListView();
	}
	
	public void newNote () {
		noteManager.newNote();
		titleTextField.setText("");
		currentNoteTextArea.setText("");
	    favouriteCheckBox.setSelected(false);
	    rating.setRating(0);
	    newTagTextField.setText("");
	}
	
	public void allNotesListClicked(MouseEvent arg0) {
		noteManager.setSortedNoteList();
		   
		if (noteManager.getNote(allNotesListView.getSelectionModel().getSelectedIndex()) ) {
			   displayNote();
		 }
	}
	
	public void favoriteNotesListClicked(MouseEvent arg0) {
		noteManager.setFavoriteNoteList();
		   
		if (noteManager.getNote(favouritesListView.getSelectionModel().getSelectedIndex()) ) {
			   displayNote();
		 }
	}
	
	public void recentNotesListClicked(MouseEvent arg0) {
		noteManager.setRecentNoteList();
		   
		if (noteManager.getNote(recentListView.getSelectionModel().getSelectedIndex()) ) {
			   displayNote();
		 }
	}
	
	public void searchNotesListClicked(MouseEvent arg0) {
		noteManager.setSearchNoteList(searchTextField.getText());
		   
		if (noteManager.getNote(searchListView.getSelectionModel().getSelectedIndex()) ) {
			   displayNote();
		 }
	}
	
	public void searchNote(ActionEvent event) {
		String keyword = searchTextField.getText();
		noteManager.setSearchNoteList(keyword);
		searchListView.setItems(noteManager.getSearchNoteList(keyword));
	}
	
	public void addTag(ActionEvent event) {
		String keyword = newTagTextField.getText();
		
		switch ( tagManager.addTagToDatabase(keyword) ) {
			case SUCCESS : 
				//ViewUtils.showInformationAlert("Information", "Tag has been saved!");
				Notifier.INSTANCE.notifySuccess("Success", "Tag has been saved!");
				
			break;
			case TAG_EMPTY : 
				//ViewUtils.showInformationAlert("Information", "Tag already exist.");
				Notifier.INSTANCE.notifyInfo("Info", "Tag can not be empty.");
			break;
			case TAG_EXIST : 
				//ViewUtils.showInformationAlert("Information", "Tag already exist.");
				Notifier.INSTANCE.notifyInfo("Info", "Tag already exist.");
			break;
			case FAILURE : 
				//ViewUtils.showErrorAlert("Error", "Tag has not been added to database!");
				Notifier.INSTANCE.notifyError("Error", "Tag has not been added to database!");
		}
		
		updateListView();
	}
	
	public void selectTag(ActionEvent event) {
		//TODO Add action to select tag button
	}
	
	public void deselectTag(ActionEvent event) {
		//TODO Add action to deselect tag button
	}
	
	private void displayNote() {
		noteManager.editMode();
		titleTextField.setText(noteManager.note.getTitle());
		currentNoteTextArea.setText(noteManager.note.getContent());
		favouriteCheckBox.setSelected(noteManager.note.getFavourite());
		rating.ratingProperty().set( noteManager.note.getStars() );
		newTagTextField.setText("");
	}
	
	private void updateListView() {
		allNotesListView.setItems(noteManager.getSortedNoteList());
		favouritesListView.setItems(noteManager.getFavoriteNoteList());
		recentListView.setItems(noteManager.getRecentNoteList());
		searchListView.setItems(noteManager.getSearchNoteList(searchTextField.getText()));	
		availableTagsListView.setItems(tagManager.getTagList());
//		selectedTagsListView.setItems(tagManager.getSelectedTagList());
//		searchTextField.setText("");
	}*/
		
	
}
