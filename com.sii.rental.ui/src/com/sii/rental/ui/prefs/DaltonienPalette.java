package com.sii.rental.ui.prefs;

import org.eclipse.jface.viewers.IColorProvider;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.widgets.Display;

import com.opcoach.training.rental.Customer;
import com.opcoach.training.rental.Rental;
import com.opcoach.training.rental.RentalAgency;
import com.opcoach.training.rental.RentalObject;
import com.sii.rental.ui.RentalProvider.Node;

public class DaltonienPalette implements IColorProvider {
	
	public DaltonienPalette() {
	}

	@Override
	public Color getForeground(Object element) {
		if (element instanceof Node) {
			return Display.getCurrent().getSystemColor(SWT.COLOR_DARK_GREEN);
		} else if (element instanceof RentalAgency) {
			return Display.getCurrent().getSystemColor(SWT.COLOR_BLUE);
		} else if (element instanceof Customer) {
			return Display.getCurrent().getSystemColor(SWT.COLOR_DARK_CYAN);
		} else if (element instanceof Rental) {
			return Display.getCurrent().getSystemColor(SWT.COLOR_GRAY);
		} else if (element instanceof RentalObject) {
			return Display.getCurrent().getSystemColor(SWT.COLOR_DARK_YELLOW);
		}
		return Display.getCurrent().getSystemColor(SWT.COLOR_DARK_RED);
	}

	@Override
	public Color getBackground(Object element) {
		return null;
	}
}
