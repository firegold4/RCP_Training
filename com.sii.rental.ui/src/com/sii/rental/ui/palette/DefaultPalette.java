package com.sii.rental.ui.palette;

import javax.inject.Inject;

import org.eclipse.e4.core.di.annotations.Optional;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.jface.resource.ColorRegistry;
import org.eclipse.jface.resource.JFaceResources;
import org.eclipse.jface.resource.StringConverter;
import org.eclipse.jface.viewers.IColorProvider;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.widgets.Display;

import com.opcoach.training.rental.Customer;
import com.opcoach.training.rental.Rental;
import com.opcoach.training.rental.RentalAgency;
import com.opcoach.training.rental.RentalObject;
import com.sii.rental.ui.RentalProvider.Node;
import com.sii.rental.ui.RentalUIConstants;

public class DefaultPalette implements IColorProvider, RentalUIConstants {

	@Inject @Optional
	private IPreferenceStore prefStore;
	
	public DefaultPalette() {
	}

	@Override
	public Color getForeground(Object element) {
		if (element instanceof Node) {
			return Display.getCurrent().getSystemColor(SWT.COLOR_DARK_GREEN);
		} else if (element instanceof RentalAgency) {
			return Display.getCurrent().getSystemColor(SWT.COLOR_BLUE);
		} else if (element instanceof Customer) {
			return getAColor(prefStore.getString(PREF_CUSTOMER_COLOR));
		} else if (element instanceof Rental) {
			return getAColor(prefStore.getString(PREF_RENTAL_COLOR));
		} else if (element instanceof RentalObject) {
			return getAColor(prefStore.getString(PREF_RENTAL_OBJECT_COLOR));
		}
		return Display.getCurrent().getSystemColor(SWT.COLOR_DARK_RED);
	}

	@Override
	public Color getBackground(Object element) {
		return null;
	}

	private Color getAColor(String rgbKey) {
		ColorRegistry colorRegestry = JFaceResources.getColorRegistry();
		Color col = colorRegestry.get(rgbKey);
		if (col == null) {
			colorRegestry.put(rgbKey, StringConverter.asRGB(rgbKey));
			col = colorRegestry.get(rgbKey);
		}
		return col;
	}
}