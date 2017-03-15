package com.sii.rental.ui.prefs;

import org.eclipse.core.runtime.preferences.AbstractPreferenceInitializer;
import org.eclipse.core.runtime.preferences.InstanceScope;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.jface.resource.StringConverter;
import org.eclipse.swt.graphics.RGB;

import com.opcoach.e4.preferences.ScopedPreferenceStore;
import com.sii.rental.ui.RentalUIConstants;

public class RentalColorInitializer extends AbstractPreferenceInitializer implements RentalUIConstants {

	public RentalColorInitializer() {
	}

	@Override
	public void initializeDefaultPreferences() {
		IPreferenceStore prefStore = new ScopedPreferenceStore(InstanceScope.INSTANCE, "com.sii.rental.ui");
		prefStore.setDefault(PREF_CUSTOMER_COLOR, StringConverter.asString(new RGB(255, 128, 0)));
		prefStore.setDefault(PREF_RENTAL_COLOR, StringConverter.asString(new RGB(128, 0, 64)));
		prefStore.setDefault(PREF_RENTAL_OBJECT_COLOR, StringConverter.asString(new RGB(0, 128, 128)));
	}
}
