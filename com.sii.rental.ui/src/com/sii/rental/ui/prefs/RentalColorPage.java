package com.sii.rental.ui.prefs;

import org.eclipse.jface.preference.ColorFieldEditor;
import org.eclipse.jface.preference.FieldEditorPreferencePage;

import com.sii.rental.ui.RentalUIConstants;

public class RentalColorPage extends FieldEditorPreferencePage implements RentalUIConstants {

	public RentalColorPage() {
		super(GRID);
	}

	@Override
	protected void createFieldEditors() {
		addField(new ColorFieldEditor(PREF_CUSTOMER_COLOR, "Customer : ", getFieldEditorParent()));
		addField(new ColorFieldEditor(PREF_RENTAL_COLOR, "Locations : ", getFieldEditorParent()));
		addField(new ColorFieldEditor(PREF_RENTAL_OBJECT_COLOR, "Objets à louer : ", getFieldEditorParent()));
	}

}
